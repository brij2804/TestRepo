package com.jpmc.saleprocessing.model.type;

public class MultipleSale {

    private String productName;
    private double quantity;
    private double priceForEach;
    private double totalValue;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getPriceForEach() {
        return priceForEach;
    }

    public void setPriceForEach(double priceForEach) {
        this.priceForEach = priceForEach;
    }
}
