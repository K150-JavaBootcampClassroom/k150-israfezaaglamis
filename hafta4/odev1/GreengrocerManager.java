public class GreengrocerManager implements ISellStrategy {

    Products productType;
    private double productAmaount;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public GreengrocerManager() {
        this.productType = productType;
        this.productAmaount = productAmaount;
    }

    @Override
    public void showAmaount(Products productType,GreengrocerManager productAmount) {
        productType = productType;
        productAmount = productAmount;
    }

    public Products getProductType() {
        return productType;
    }

    public void setProductType(Products productType) {
        this.productType = productType;
    }

    public double getProductAmaount() {
        return productAmaount;
    }

    public void setProductAmaount(double productAmaount) {
        this.productAmaount = productAmaount;
    }
}

