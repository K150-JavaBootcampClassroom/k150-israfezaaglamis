public enum CustomerClass {
    BUSINESS("Business paket"),
    ECONOMIC("Ekonomik paket");

    String customer;

    CustomerClass(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
