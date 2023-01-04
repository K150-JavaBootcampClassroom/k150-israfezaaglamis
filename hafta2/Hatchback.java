public class Hatchback extends Car{
    //alınacak değerler belirlendi
    public Hatchback(String carName, String modelYear, String color, int baggageSize, int dailyHireRate) {
        super(carName, modelYear, color, baggageSize, dailyHireRate);

    }
    //araçların özelliklerinin çağırıldığında gelmesini istediğimden metod olusturdum ve bu sablonu diğer araçlarda da kullandım
    //hatchback modeli için aylık kira bedeli bulunmuyor

    public void hatchbackPackage(){
        System.out.println("Hatchback model araçlarımız yalnızca günlük kiralamaya uygundur. \n" +
                "Kiralabilir Hatchback araba özellikleri :" +
                " Araç ismi "+ getCarName()+"|"+
                " Modeli(Yıl) "+ getModelYear()+"|"+
                " Renk : "+ getColor()+"|"+
                " Bagaj hacmi : "+ getBaggageSize()+"|"+
                " Günlük kiralama bedeli : "+ getDailyHireRate()+
                " Aracı belirlenen noktadan saat 10.00'da alabilirsiniz. Riot Racers Cars'ı tercih ettiğiniz için teşekkür ederiz ");
        return;

    }

}
