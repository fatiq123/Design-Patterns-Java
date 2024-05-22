package Creational.BuilderPattern;

import org.jetbrains.annotations.NotNull;

public class House extends HouseOwner{
    private String houseName;
    private int housePrice;
    private long houseSize;
    private String houseAddress;


    public House(String houseName, int housePrice, long houseSize, String houseAddress) {
        this.houseName = houseName;
        this.housePrice = housePrice;
        this.houseSize = houseSize;
        this.houseAddress = houseAddress;
    }

    public String getHouseName() {
        return houseName;
    }
    public int getHousePrice() {
        return housePrice;
    }
    public long getHouseSize() {
        return houseSize;
    }
    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }
    public void setHouseSize(long houseSize) {
        this.houseSize = houseSize;
    }
    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }


    @Override
    void houseInfo() {

    }

    @Override
    int houseFloors() {
        return 0;
    }


    public static void main(String[] args, HouseOwner houseOwner) {
        houseOwner.getHouseOwner();

    }
}
