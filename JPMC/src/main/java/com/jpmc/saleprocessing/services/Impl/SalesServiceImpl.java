package com.jpmc.saleprocessing.services.Impl;

import com.jpmc.saleprocessing.common.SalesConstants;
import com.jpmc.saleprocessing.exceptions.SalesException;
import com.jpmc.saleprocessing.model.SaleRequest;
import com.jpmc.saleprocessing.processor.SalesProcessor;
import com.jpmc.saleprocessing.record.SalesRecord;
import com.jpmc.saleprocessing.services.SalesService;

public class SalesServiceImpl implements SalesService {

    private SalesProcessor salesProcessor;

    public SalesServiceImpl(){
      salesProcessor = new SalesProcessor();
    }

    @Override
    public void processSale(SaleRequest saleRequest) throws SalesException {

        try {
            if (saleRequest != null) {
                // increase the sales msg counter
                SalesRecord.incrementSaleCounter();
                // process sale msg
                salesProcessor.processSaleMsg(saleRequest);
            }

        }catch(Throwable ex){
            // print the exception in logger
            throw new SalesException(SalesConstants.ERROR_PROCESSING_REQUEST,ex);
        }
    }
}
