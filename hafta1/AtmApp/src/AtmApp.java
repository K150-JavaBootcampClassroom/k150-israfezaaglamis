import java.util.Scanner;
public class AtmApp {
    public static void main(String[] args) {

        int balance = 2000, amount, input; // bakiye değişkeni tanımlandı, para yatırma/çekme opsiyonlarında kullanılmak üzere "miktar" değişkeni olusturuldu. kullanıcıyla etkileşime girerken kullanılmak üzere input değişkeni tanımlandı.

        Scanner scanner = new Scanner(System.in);
        System.out.println("        "); //çıktıların üst üste binmemesi için biraz boşluk :))
        System.out.println("Hoşgeldiniz İsra, Güncel bakiyeniz " + balance +" TL'dir. Lütfen bir sonraki adımda yapmak istediğiniz işlemi seçiniz" );
        System.out.println("        ");


        while (balance > 0 ){ //bakiye mevcutken çalısacak şekilde şartlandı
            System.out.println("Para yatırmak için 1'i");
            System.out.println("Para çekmek için 2'yi");
            System.out.println("Bakiye sorgulama işlemi için 3'ü");
            System.out.println("Çıkış yapmak için ise 4'ü seçebilirsiniz.");
            System.out.println("Yapmak istediğiniz işlem : " );

            input = scanner.nextInt();

            if (input == 1){ //Kullanıcı 1'i seçerse

                System.out.println("Yatırmak istediğiniz miktar :");
                amount = scanner.nextInt();
                balance += amount;

            } else if (input == 2) { //Kullanıcı 2'yi seçerse
                System.out.println("Çekmek istediğiniz miktar :");
                amount = scanner.nextInt();

                if (balance<amount){ // Çekilmek istenen miktar bakiyeden büyükse işlem yapılmaz ve yetersiz bakiye uyarısı verir.
                    System.out.println("Yetersiz bakiye");
                    System.out.println("        ");
                }else {
                    balance -= amount;
                }
            }else if (input == 3){ //Kullanıcı 3'ü seçerse
                System.out.println("Bakiyeniz : " + balance);

            }else if (input == 4){ //Kullanıcı 4'ü seçecek olursa break komutuyla sistemden çıkış yapılır
                System.out.println("İsteğiniz üzerine sistemden çıkış yapılıyor..");
                break; //döngüyü bitirir.

            }else{ //tanımlanan işlemler haricinde başka bir seçim yapılacak olursa geçersiz işlem uyarısı verilir.
                System.out.println("Geçersiz işlem yapıldı");
                System.out.println("        ");
            }

        }



    }
}