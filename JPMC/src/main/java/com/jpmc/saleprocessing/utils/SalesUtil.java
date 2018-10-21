package com.jpmc.saleprocessing.utils;

import com.jpmc.saleprocessing.common.SalesConstants;
import com.jpmc.saleprocessing.exceptions.SalesException;
import com.jpmc.saleprocessing.model.type.MultipleSale;
import com.jpmc.saleprocessing.model.type.SingleSale;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SalesUtil {



    // add , subract or multiply

    //string parser for  parsing the string msg types
    public SingleSale parseSingleSaleMsg(String msg) throws SalesException{
        System.out.println("start : parseSingleSaleMsg");
        SingleSale singleSale = new SingleSale();
        try {
          // check if the msg is correct format using regex , if not throw exception
          Pattern msgPattern = Pattern.compile(SalesConstants.MSG_TYPE_1_REGEX_PATTERN);
            System.out.println("parseSingleSaleMsg: regex pattern : "+SalesConstants.MSG_TYPE_1_REGEX_PATTERN);
          Matcher msgMatcher = msgPattern.matcher(msg);
          if (msgMatcher.find()) {
              System.out.println("Found value: " + msgMatcher.group(0));
              System.out.println("Found value: " + msgMatcher.group(1));
              System.out.println("Found value: " + msgMatcher.group(2));
          } else {
           // logs pattern does not match
              System.out.println(SalesConstants.ERROR_PATTERN_DOES_NOT_MATCH);
              // throw exception
            throw new SalesException(SalesConstants.ERROR_PATTERN_DOES_NOT_MATCH) ;
          }
          // if the format is correct then break using space delimiter
          String[] splitMsg = msg.split(" ");
          String productType = splitMsg[0];
          String strValue = splitMsg[2];
          singleSale.setProductName(productType);

          Pattern moneyPattern = Pattern.compile(SalesConstants.MONEY_REGEX_PATTERN);
          Matcher moneyMatcher = moneyPattern.matcher(strValue);

          if (moneyMatcher.find()){
          String strPrice= moneyMatcher.group(0);
          double price = Double.valueOf(strPrice);
          singleSale.setValue(price);
          }else{
              // log pattern does not match
              System.out.println("Error while parsing money string "+SalesConstants.ERROR_PATTERN_DOES_NOT_MATCH);
              // throw exception
              throw new SalesException(SalesConstants.ERROR_PATTERN_DOES_NOT_MATCH);
          }
      }catch(Throwable exception){
            // log the error msg and throw the exception
          throw new SalesException(SalesConstants.ERROR_PARSING_MSG,exception);
      }
      System.out.println("parseSingleSaleMsg : productName : "+singleSale.getProductName());
        System.out.println("parseSingleSaleMsg : price : "+singleSale.getValue());
      System.out.println("ends : parseSingleSaleMsg");
      return singleSale;
    }

    public SingleSale parseMultipleSaleMsg(String msg) throws SalesException{
        System.out.println("start : parseMultipleSaleMsg");
        MultipleSale multipleSale = new MultipleSale();
        try {
            // check if the msg is correct format using regex , if not throw exception
            Pattern msgPattern = Pattern.compile(SalesConstants.MSG_TYPE_2_REGEX_PATTERN);
            System.out.println("parseSingleSaleMsg: regex pattern : "+SalesConstants.MSG_TYPE_2_REGEX_PATTERN);
            Matcher msgMatcher = msgPattern.matcher(msg);
            if (msgMatcher.find()) {
                System.out.println("Found value: " + msgMatcher.group(0));
                System.out.println("Found value: " + msgMatcher.group(1));
                System.out.println("Found value: " + msgMatcher.group(2));
            } else {
                // logs pattern does not match
                System.out.println(SalesConstants.ERROR_PATTERN_DOES_NOT_MATCH);
                // throw exception
                throw new SalesException(SalesConstants.ERROR_PATTERN_DOES_NOT_MATCH) ;
            }
            // if the format is correct then break using space delimiter
            String[] splitMsg = msg.split(" ");
            String productType = splitMsg[0];
            String strValue = splitMsg[2];
            singleSale.setProductName(productType);

            Pattern moneyPattern = Pattern.compile(SalesConstants.MONEY_REGEX_PATTERN);
            Matcher moneyMatcher = moneyPattern.matcher(strValue);

            if (moneyMatcher.find()){
                String strPrice= moneyMatcher.group(0);
                double price = Double.valueOf(strPrice);
                singleSale.setValue(price);
            }else{
                // log pattern does not match
                System.out.println("Error while parsing money string "+SalesConstants.ERROR_PATTERN_DOES_NOT_MATCH);
                // throw exception
                throw new SalesException(SalesConstants.ERROR_PATTERN_DOES_NOT_MATCH);
            }
        }catch(Throwable exception){
            // log the error msg and throw the exception
            throw new SalesException(SalesConstants.ERROR_PARSING_MSG,exception);
        }
        System.out.println("parseSingleSaleMsg : productName : "+singleSale.getProductName());
        System.out.println("parseSingleSaleMsg : price : "+singleSale.getValue());
        System.out.println("ends : parseSingleSaleMsg");
        return singleSale;
    }

    public static void main(String[] args){

    }

}
