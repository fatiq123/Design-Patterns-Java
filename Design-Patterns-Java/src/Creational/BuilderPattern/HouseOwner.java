package Creational.BuilderPattern;

public abstract class HouseOwner {

    String length = "";
    private String houseOwner;
    /*public HouseOwner(String houseOwner) {
        this.houseOwner = houseOwner;
    }
    */
    public void getHouseOwner() {
        System.out.println("FH Houses");
    }
    public void setHouseOwner(String houseOwner) {
        this.houseOwner = houseOwner;
    }


    private void houseOwner() {
        System.out.println("Inside houseOwner");
    }

    abstract void houseInfo();

    abstract int houseFloors();

    /*abstract String houseOwnerName;*/ // we cannot do like this

}
