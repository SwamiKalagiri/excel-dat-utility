package com.imawsom.poivel.util;

public class Formatter {

    public String pad(String inputString ,int width){
        if(inputString.length() >= width){
            return inputString.substring(0,width);
        }
        StringBuffer outputString = new StringBuffer(inputString) ;
        for(int i=0; i< (width-inputString.length());i++)  {
            outputString.append(" ");
        }
        return outputString.toString();
    }
}
