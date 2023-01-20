public class Thy extends Company implements ICompany{
    public Thy(String companyName) {
        super(companyName);
    }

    private double ticketPrice= 5000.0;
    private double businessTicketPrice;
    private FlyType flyType;
    private CustomerClass customerClass;

    @Override
    public void sell(FlyType flyType, CustomerClass customerClass) {

    }

    public void ticketInfo(){
        if (flyType == FlyType.INTERNATIONAL_LINE || customerClass == CustomerClass.BUSINESS){
            System.out.println("Business class ile uluslararası uçan müşterilere yemek ve ikram hizmetimiz mevcuttur. ");
            System.out.println(" Yolcuğun başlangıç konumu : "+Fly.getStartingLocation()+
            "Yolcuğun varış konumu "+Fly.getCountry()+
            "Uçuş süresi : "+ Fly.getFlightTime()+
            "Bilet tutarı : "+ getBusinessTicketPrice());
        }else if (flyType == FlyType.DOMESTIC_LINE || customerClass ==CustomerClass.ECONOMIC){
            System.out.println("Ekonomik paketi tercih ettiniz. Bu paket için ek hizmetimiz bulunmamaktadır.");
            System.out.println(" Yolcuğun başlangıç konumu : "+Fly.getStartingLocation()+ "Yolcuğun varış konumu "+Fly.getCountry()+ "Uçuş süresi : "+ Fly.getFlightTime()+ "Bilet tutarı : "+ getBusinessTicketPrice());

        }
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getBusinessTicketPrice() {
        return businessTicketPrice += ticketPrice*2.5;
    }

    public void setBusinessTicketPrice(double businessTicketPrice) {
        this.businessTicketPrice = businessTicketPrice;

    }
}
