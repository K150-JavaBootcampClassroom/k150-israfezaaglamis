public class Company extends CustomerManager{
// Kurumsal müşteriler için olusturulmus alt sınıf
    public Company(String companyName, String city, String  phoneNumber) {
        super(city, phoneNumber);
        this.setCompanyName(getCompanyName());
        this.setPhoneNumber(getPhoneNumber());
    }
}
