public class Seat {
    private String seatID;
    private boolean isBlank= false;
    private CustomerClass customerClass;

    public CustomerClass getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(CustomerClass customerClass) {
        this.customerClass = customerClass;
    }

    public Seat(String seatID, boolean isBlank, String seatType) {
        this.seatID = seatID;
        this.isBlank = isBlank;
        this.customerClass = customerClass;
    }

    public String getSeatID() {
        return seatID;
    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }


    public boolean isBlank() {
        return isBlank;
    }

    public void setBlank(boolean blank) {
        isBlank = blank;
    }
}
