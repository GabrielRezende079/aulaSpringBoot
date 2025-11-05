package com.GabrielRezende079.repo01.MathControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.GabrielRezende079.repo01.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/math") // http://localhost:8080/math
public class SquareRootController {

    //http://localhost:8080/math/squareRoot/4 for example

    //explanation of @PathVariable: it binds the method parameters to the values passed in the URL path
    @RequestMapping("/squareRoot/{number}")
    public double squareRoot( 
        @PathVariable("number") String number
        ) throws Exception { 
          
            
        if (!isNumeric.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return Math.sqrt(convertToDouble.convertToDouble(number));
    } 
  
}
