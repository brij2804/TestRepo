package com.jpmc.saleprocessing.exceptions;

public class SalesException extends Throwable {

    public SalesException(String msg){
        super(msg);
    }

    public SalesException(String msg, Throwable throwable){
        super(msg,throwable);
    }
}
