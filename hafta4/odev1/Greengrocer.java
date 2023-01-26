import java.util.HashMap;

//Main class
public class Greengrocer {
    public static void main(String[] args) {
        GreengrocerManager manager = new GreengrocerManager();

        HashMap <String,Double> products = new HashMap<>();
        products.put(Products.APPLE.getProductType(),70.0);
        products.put(Products.PEAR.getProductType(),70.0);
        products.put(Products.CHERRY.getProductType(),70.0);

        UpdateStrategyImpl update = new UpdateStrategyImpl();
        update.uptade( products);

        SellStrategyImpl sell = new SellStrategyImpl();
        sell.showAmaount(Products.APPLE,30.0);






    }

}
