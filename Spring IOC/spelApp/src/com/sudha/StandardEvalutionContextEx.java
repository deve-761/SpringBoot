package com.sudha;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class StandardEvalutionContextEx {

	// Using StandardEvalutionContext
	public static void main(String[] args) {
		CalculatorBean cal = new CalculatorBean();
		StandardEvaluationContext context = new StandardEvaluationContext(cal);

		ExpressionParser parser = new SpelExpressionParser();

		Expression expr1 = parser.parseExpression("num1");
		expr1.setValue(context, "10");

		Expression expr2 = parser.parseExpression("num2");
		expr2.setValue(context, "5");

		System.out.println("num1 :" + cal.getNum1());
		System.out.println("num2 :" + cal.getNum2());
		System.out.println("ADD :" + cal.add());
		System.out.println("SUB :" + cal.sub());
		System.out.println("MUL :" + cal.mul());
	}
}
