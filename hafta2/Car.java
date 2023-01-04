//Araçlar için oluşturulmus super sınıf

public abstract class Car {

    private String carName;
    private String color;
    private String modelYear;
    private int dailyHireRate;
    private int mounthlyHireRate;
    private int baggageSize;
    private Car Car;

    //Constructor metodunu yazıyorum,parametre olarak verdiğim değerleri değişkenlerle eşitlemesi için this kullandım
    public Car(String carName,String modelYear, String color,int baggageSize, int dailyHireRate ) {
        this.carName = carName;
        this.modelYear = modelYear;
        this.color = color;
        this.baggageSize = baggageSize;
        this.dailyHireRate = dailyHireRate;
    }

    //getter ve setter metodları | aylık kiralama işlemini setter metoduna yerleştirdim o_o
    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public int getDailyHireRate() {
        return dailyHireRate;
    }

    public void setDailyHireRate(int dailyHireRate) {
        this.dailyHireRate = dailyHireRate;
    }

    public int getMounthlyHireRate() {
        mounthlyHireRate += dailyHireRate*30;
        return mounthlyHireRate;
    }

    public void setMounthlyHireRate(int mounthlyHireRate) {
        this.mounthlyHireRate = mounthlyHireRate;
    }

    public int getBaggageSize() {
        return baggageSize;
    }

    public void setBaggageSize(int baggageSize) {
        this.baggageSize = baggageSize;
    }
}
