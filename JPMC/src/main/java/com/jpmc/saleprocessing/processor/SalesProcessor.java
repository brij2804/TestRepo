package com.jpmc.saleprocessing.processor;

import com.jpmc.saleprocessing.common.SalesConstants;
import com.jpmc.saleprocessing.exceptions.SalesException;
import com.jpmc.saleprocessing.model.SaleRequest;
import com.jpmc.saleprocessing.utils.SalesUtil;

public class SalesProcessor {

    private SalesUtil salesUtil;

    public SalesProcessor(){
        salesUtil = new SalesUtil();
    }

    public void processSaleMsg(SaleRequest saleRequest) throws SalesException {
       try {
           if (saleRequest.getType() != null && saleRequest.getType() != "") {
               String saleType = saleRequest.getType();
               if (saleType.equalsIgnoreCase(SalesConstants.MSG_TYPE_1)) {
                   // process string msg
                   if (saleRequest.getMsg() != null && saleRequest.getMsg() != "") {
                       salesUtil.parseSingleSaleMsg(saleRequest.getMsg());
                   }
               } else if (saleType.equalsIgnoreCase((SalesConstants.MSG_TYPE_2))) {

               } else if (saleType.equalsIgnoreCase(SalesConstants.MSG_TYPE_3)) {

               }
           }
       }catch (Throwable thr)
           // log the exception and throw the exception


    }


    //determine sale type

    // if single sale add it in total sale record

    // if it is multiple sale then add it in sales record

    // if it is adjustment sales then adjust the sales

    // after 10th message log report

    // after 50th message log report




}
