package com.GabrielRezende079.repo01.controllers.MathControllers;

import com.GabrielRezende079.repo01.exception.UnsupportedMathOperationException;

public class convertToDouble {
            // this method converts a string to a double for math operations and also handles comma as decimal separator
    public static double convertToDouble(String strNumber){
        if(strNumber == null || strNumber.isEmpty()){
             throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        String number = strNumber.replace(",",".");
        return Double.parseDouble(number);
    }
    
}
