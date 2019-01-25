package com.anz.rpn.calculator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Stack;

import com.anz.rpn.exception.RPNCalculatorException;

public interface RPNCalculator {
	Stack<Double> calculate(String[] keywordArray, boolean isUndoOperation) throws RPNCalculatorException;

}
