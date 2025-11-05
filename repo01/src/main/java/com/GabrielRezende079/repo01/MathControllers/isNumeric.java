package com.GabrielRezende079.repo01.MathControllers;

public class isNumeric {
    
        public static boolean isNumeric(String strNumber) {

        if(strNumber == null || strNumber.isEmpty()){
            return false;
        }
        String number = strNumber.replace(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

}
