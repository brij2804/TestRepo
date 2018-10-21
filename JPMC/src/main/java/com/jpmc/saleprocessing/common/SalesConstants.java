package com.jpmc.saleprocessing.common;

public class SalesConstants {
    public static final String POST_SALE = "/rest/sale/process";
    public static final String MSG_TYPE_1= "type1";
    public static final String MSG_TYPE_2= "type2";
    public static final String MSG_TYPE_3= "type3";
    public static final String MSG_TYPE_1_REGEX_PATTERN="";
    public static final String MSG_TYPE_2_REGEX_PATTERN="";
    public static final String MSG_TYPE_3_REGEX_PATTERN="";
    public static final String MONEY_REGEX_PATTERN="";
    public static final String ERROR_PARSING_MSG="Error occured while parsing the msg string";
    public static final String ERROR_PROCESSING_REQUEST="Exception occured in while processing the sale request.";
    public static final String ERROR_PATTERN_DOES_NOT_MATCH="Input msg pattern does not match";
    public enum Calculate {
        ADD, SUBTRACT, MULTIPLY;
    }
}
