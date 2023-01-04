public class Individual extends CustomerManager {

    //bireysel müsteriler için olusturulan alt sınıf
    public Individual(String customerName,String city, String  phoneNumber) {
        super(city, phoneNumber);
        this.setCustomerName(getCustomerName());
        this.setPhoneNumber(getPhoneNumber());
    }
}