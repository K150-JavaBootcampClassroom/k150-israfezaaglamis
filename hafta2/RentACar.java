//Main sınıf

import java.util.Scanner;
public class RentACar {
    public static void main(String[] args) {
//dısardan dönüt alabilmek için scanner sınıfı import ediliyor daha sonra araçlar için nesneler olusturuluyor
        Scanner input  = new Scanner(System.in);
        Hatchback hatchback = new Hatchback("Renault Clio", "2017","Mavi",420,450);
        Sedan sedanCar = new Sedan("AudiA4Sedan","2018","Pembe",740,500);
        Suv suvCar     = new Suv("Dacia Duster","2023","Fıstık yesili",760,690);
        CustomerManager customerManager = new CustomerManager("İst", "984379833") {
        };

        String customerType;
        String customer;


        System.out.println("-₨ Riot Racers Cars'a hoşgeldiniz -₨");
        System.out.println("Size nasıl hitap etmemizi istersiniz?");
        customer = input.nextLine(); //gelecek değer customer'a esitleniyor
        customerManager.setCustomerName(customer);
        customerManager.setCompanyName(customer);
        System.out.println("Aracı teslim alacağınız şehri seçiniz");
        customer = input.nextLine();
        customerManager.setCity(customer);
        System.out.println("Konum "+customerManager.getCity()+" olarak belirlendi. ");
        System.out.println("Lütfen verilen değerlere göre müşteri tipinizi giriniz.");
        System.out.println("Bireysel için -B- \nKurumsal için -K- tuşlarını tuşlayınız"); //kurumsal veya bireysel oalrak müşteri tipi seçimi yaptırılıyor
        customer = input.nextLine();
        customerType = "B";


        if (customer.equals("B") || customer.equals("b")){
            customerType = "B";
            System.out.println(" Sn " +customerManager.getCustomerName()+" Bireysel müşteri tipini seçtiniz");

        }else if (customer.equals("K") || customer.equals("k") ){
            customerType = "K";
            System.out.println(" Sn " +customerManager.getCompanyName()+" Kurumsal müşteri tipini seçtiniz");

        }else {
            System.out.println("Seçiminiz anlaşılmadı, tekrar deneyin");
        }

        if (customerType == "B"){//müsterinin tipini kontrol ederek devam ediyor ve secime göre dönütler veriyor.
            System.out.println("Bireysel müşterilerimizin kiralayabileceği araçlar");
            hatchback.hatchbackPackage();
        }
        if (customerType == "K"){
                System.out.println("Kurumasal müşterilerimizin kiralayabileceği araçlar;\n 1- Hatchback,\n 2- Sedan,\n 3- SUV  şeklindedir");
                System.out.println("Lütfen istediğiniz aracın numarasını giriniz");
                customer = input.nextLine();

                if (customer.equals("1")){
                    System.out.println(" Sn " +customerManager.getCompanyName()+" seçtiğiniz araç Hatchback");
                    hatchback.hatchbackPackage();
                }else if (customer.equals("2")){

                    System.out.println(" Sn " +customerManager.getCompanyName()+" seçtiğiniz araç Sedan");
                    sedanCar.sedanPackage();
                }else if (customer.equals("3")){

                    System.out.println(" Sn " +customerManager.getCompanyName()+" seçtiğiniz araç SUV");
                    suvCar.suvPackage();
                }else {
                    System.out.println("Seçiminiz anlaşılmadı, tekrar deneyin");
                }
            }




    }

}
