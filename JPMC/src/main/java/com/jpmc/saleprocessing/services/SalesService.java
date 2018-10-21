package com.jpmc.saleprocessing.services;

import com.jpmc.saleprocessing.common.SalesConstants;
import com.jpmc.saleprocessing.exceptions.SalesException;
import com.jpmc.saleprocessing.model.SaleRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public interface SalesService {

    @RequestMapping(value = SalesConstants.POST_SALE, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void processSale(@RequestBody SaleRequest saleRequest) throws SalesException;

}
