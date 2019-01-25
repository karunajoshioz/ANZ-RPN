package com.anz.rpn.operators;

import java.math.BigDecimal;

import com.anz.rpn.exception.RPNCalculatorException;

public class PlusOperation  implements Operation {

	@Override
	public Double run(Double firstOperand, Double secondOperand) throws RPNCalculatorException {
		
		return firstOperand + (secondOperand);
	}

 
}
