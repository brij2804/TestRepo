package com.jpmc.saleprocessing.model.type;

public class AdjustmentSale {

    private String productName;
    private double priceForEach;
    private String adjustmentType;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPriceForEach() {
        return priceForEach;
    }

    public void setPriceForEach(double priceForEach) {
        this.priceForEach = priceForEach;
    }

    public String getAdjustmentType() {
        return adjustmentType;
    }

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }
}
