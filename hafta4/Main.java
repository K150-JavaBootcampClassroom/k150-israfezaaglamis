//tamamlanmadı :/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String customer;

       Thy thy = new Thy("THY");
       Pegasus pegasus = new Pegasus("Pegasus");
       Scanner scanner = new Scanner(System.in);
       Company company = new Company("");


        System.out.println("Firma seçiniz");
        System.out.println(" 1-THY\n 2-Pegasus");
        customer = scanner.nextLine();
        if ("1".equals(customer)){
            company.setCompanyName(thy.getCompanyName());
            System.out.println("seçiminiz THY");

        } else if ("2".equals(customer)) {
            company.setCompanyName(pegasus.getCompanyName());
            System.out.println("seciminiz Pegasus");

        }else{
            System.out.println("Gecersiz islem");
        }






    }
}
