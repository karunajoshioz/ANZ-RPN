package com.anz.rpn.operators;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import com.anz.rpn.exception.RPNCalculatorException;

public class SqrtOperation implements Operation {

	@Override
	public Double run(Double firstOperand, Double secondOperand) throws RPNCalculatorException {
		
		Double calculationResult = Math.sqrt(firstOperand);// new Double(Math.sqrt(firstOperand), MathContext.DECIMAL128)
				// .setScale(15, RoundingMode.HALF_UP).stripTrailingZeros();
		return calculationResult;
	}
	
	
}
