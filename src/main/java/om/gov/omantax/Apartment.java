package om.gov.omantax;

public class Apartment {
    private int apartmentID;
    private double apartmentPrice;


    public Apartment(int apartmentID, double apartmentPrice) {
        this.apartmentID = apartmentID;
        this.apartmentPrice = apartmentPrice;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentID=" + apartmentID +
                ", apartmentPrice=" + apartmentPrice +
                '}';
    }

    public int getApartmentID() {
        return apartmentID;
    }

    public void setApartmentID(int apartmentID) {
        this.apartmentID = apartmentID;
    }

    public double getApartmentPrice() {
        return apartmentPrice;
    }

    public void setApartmentPrice(double apartmentPrice) {
        this.apartmentPrice = apartmentPrice;
    }
}
