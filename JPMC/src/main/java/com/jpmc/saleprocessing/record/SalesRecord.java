package com.jpmc.saleprocessing.record;

import com.jpmc.saleprocessing.model.ProductSaleRecord;

import java.util.HashMap;
import java.util.Map;

public class SalesRecord {

    public static Map<String, ProductSaleRecord> saleRecord= new HashMap<String, ProductSaleRecord>();

    private static int salesCounter = 0 ;

    public static void incrementSaleCounter(){
        salesCounter = salesCounter +1;
    }

    public static int getSalesCounter(){
        return salesCounter;
    }

}
