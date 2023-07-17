package om.gov.omantax.entity;

public class Rental {
private  int rentalId;
private rentalStatus status;

    public Rental(int rentalId, rentalStatus status) {
        this.rentalId = rentalId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalId=" + rentalId +
                ", status=" + status +
                '}';
    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public rentalStatus getStatus() {
        return status;
    }

    public void setStatus(rentalStatus status) {
        this.status = status;
    }
}
