package com.sudha;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ExpressionFeatureEx {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("10+10");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("'abc' + 'def'");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("0xACBCDEF*10+6");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("'Spring' matches 'Sp.*'");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("'abb@sudha.tech' matches'[a-z]*@sudha.tech'");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("'abc@gmail.com' matches'[a-z]*@sudha.com'");
		System.out.println(expr.getValue());
	}
}
