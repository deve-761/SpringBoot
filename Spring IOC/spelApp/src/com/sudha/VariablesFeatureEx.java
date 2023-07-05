package com.sudha;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class VariablesFeatureEx {

	public static void main(String[] args) {
		MyMath math = new MyMath();
		StandardEvaluationContext context = new StandardEvaluationContext(math);
		context.setVariable("number1", 10);
		context.setVariable("number2", 5);
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr1 = parser.parseExpression("num1 = #number1");
		Expression expr2 = parser.parseExpression("num2 = #number2");

		System.out.println(math.add());
		System.out.println(math.sub());
		System.out.println(math.mul());
	}
}
