public class Pegasus extends Company implements ICompany{

    public Pegasus(String companyName) {
        super(companyName);
    }
    private double ticketPrice= 7000.0;
    private double businessTicketPrice;
    private FlyType flyType;
    private CustomerClass customerClass;

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getBusinessTicketPrice() {
        return businessTicketPrice += ticketPrice*3;
    }

    public void setBusinessTicketPrice(double businessTicketPrice) {
        this.businessTicketPrice = businessTicketPrice;
    }

    public FlyType getFlyType() {
        return flyType;
    }

    public void setFlyType(FlyType flyType) {
        this.flyType = flyType;
    }

    public CustomerClass getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(CustomerClass customerClass) {
        this.customerClass = customerClass;
    }

    @Override
    public void sell(FlyType flyType, CustomerClass customerClass) {
        }

}
