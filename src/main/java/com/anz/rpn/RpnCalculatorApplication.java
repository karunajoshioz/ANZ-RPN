package com.anz.rpn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.anz.rpn.controller.CalculatorController;
import com.anz.rpn.exception.RPNCalculatorException;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication

@ComponentScan
@EnableAutoConfiguration
public class RpnCalculatorApplication {

	
	public static void main(String[] args) {
		//SpringApplication.run(RpnCalculatorApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(RpnCalculatorApplication.class, args);
		CalculatorController calculatorController = (CalculatorController) ctx.getBean("calculatorController");

		System.out.println("\n\n[RPN RpnCalculator] Enter a white-spaced list of numbers and operators then press enter or typein 'exit' to quit::\n>");
		try{
			calculatorController.process();
		}
		catch (RPNCalculatorException e) {
			e.printStackTrace();
		}
		ctx.close();
	}

}

