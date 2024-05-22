package Creational.Prototype;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String importantData;


    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }
    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "Very important data";
        Thread.sleep(5000);
        // it will take 5 minutes
    }

    @Override
    public String toString() {
        return this.ip + " : " + this.importantData;
    }

    @Override
    public NetworkConnection clone() {
        try {
            NetworkConnection clone = (NetworkConnection) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
