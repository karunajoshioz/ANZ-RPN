package com.anz.rpn.operators;


import com.anz.rpn.exception.RPNCalculatorException;

public class DivideOperation implements Operation {

	@Override
	public Double run(Double firstOperand, Double secondOperand) throws RPNCalculatorException {
		if (firstOperand  == 0)
             throw new RPNCalculatorException("Cannot divide by 0.");
		
         return secondOperand/(firstOperand);//, 15, RoundingMode.HALF_UP);
	}

}
