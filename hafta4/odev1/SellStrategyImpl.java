public class SellStrategyImpl implements ISellStrategy{


    double amount;

    @Override
    public void showAmaount( Products productType ,GreengrocerManager productsAmount) {
        if ( amount < productsAmount ){
            System.out.println("Depodaki ürün miktarı yetersiz");
        }else if (amount - productsAmount ){
            return productsAmount.showAmaount(Products.APPLE,30.0);
        }
    }

}
