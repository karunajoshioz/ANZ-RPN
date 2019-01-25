package com.anz.rpn.operators;

import java.math.BigDecimal;

import com.anz.rpn.exception.RPNCalculatorException;


public interface Operation {

	Double run(Double firstOperand, Double secondOperand) throws RPNCalculatorException;
}
