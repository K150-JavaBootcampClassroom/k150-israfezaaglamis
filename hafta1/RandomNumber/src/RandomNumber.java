import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {

        int number,counter =0 ;

        Random randomNumber = new Random();

        boolean flag = true;

        while (flag){

            number = randomNumber.nextInt(501); // 0>=x<10
            System.out.println("Random sayı : " +number);

            if (number> 50 && number < 100){
                flag = false;
                counter++;

            }else{
                counter++;
            }
        }

        System.out.println("Sayı " + counter +". işlemde bulundu.");



    }
}