package com.sudha;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class OperatorFeatureEx {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("30-20");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("10*20");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("true and true");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("true && false");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("true or true");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("true || false");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("10 ne 20");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("10 >= 20");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("10 lt 15");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("10 ge 5");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("10 eq 101?'condition is true':'condition is false'");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("T(Thread).MIN_PRIORITY");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("T(Integer).toString(10)");
		System.out.println(expr.getValue());

		User user = new User();
		user.setUname("Sudhakar");
		StandardEvaluationContext context = new StandardEvaluationContext(user);
		expr = parser.parseExpression("uname?.toUpperCase()");
		System.out.println(expr.getValue(context));
	}
}
