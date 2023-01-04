public class Suv extends Car{
    public Suv(String carName, String modelYear, String color, int baggageSize, int dailyHireRate) {
        super(carName, modelYear, color, baggageSize, dailyHireRate);

    }
    //araçların özelliklerinin çağırıldığında gelmesini istediğimden metod olusturdum ve bu sablonu diğer araçlarda da kullandım
    public void suvPackage(){
        System.out.println("Kiralabilir Suv araba özellikleri :" +
                " Araç ismi "+ getCarName()+"|"+
                " Modeli(Yıl) "+ getModelYear()+"|"+
                " Renk : "+ getColor()+"|"+
                " Bagaj hacmi : "+ getBaggageSize()+"|"+
                " Günlük kiralama bedeli : "+ getDailyHireRate()+"|"+
                " Aylık kiralama : "+ getMounthlyHireRate()+
                " Aracı belirlenen noktadan saat 10.00'da alabilirsiniz. Riot Racers Cars'ı tercih ettiğiniz için teşekkür ederiz ");

    }
}
