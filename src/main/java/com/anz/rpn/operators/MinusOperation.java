package com.anz.rpn.operators;


import com.anz.rpn.exception.RPNCalculatorException;

public class MinusOperation  implements Operation {

	@Override
	public Double run(Double firstOperand, Double secondOperand) throws RPNCalculatorException {
		return (secondOperand - firstOperand);
	}

}
