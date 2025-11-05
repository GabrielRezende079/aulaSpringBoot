package com.GabrielRezende079.repo01.MathControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.GabrielRezende079.repo01.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/math") // http://localhost:8080/math
public class MultController {



    //http://localhost:8080/math/mult/5/3 for example

    //explanation of @PathVariable: it binds the method parameters to the values passed in the URL path
    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public double mult( 
        @PathVariable("numberOne") String numberOne, 
        @PathVariable("numberTwo") String numberTwo
        ) throws Exception { 
          
            
        if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble.convertToDouble(numberOne) * convertToDouble.convertToDouble(numberTwo);
    } 
  
}
