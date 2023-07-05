package com.sudha;

import java.lang.reflect.Method;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class MethodFeatureEx {

	public static void main(String[] args) throws Exception {
		StandardEvaluationContext context = new StandardEvaluationContext();
		Class cls = Class.forName("com.sudha.MyString");
		Method method = cls.getDeclaredMethod("reverseString", new Class[] { java.lang.String.class });
		context.registerFunction("reverse", method);
		context.setVariable("str", "Sudhakar Java Tech");
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("#reverse(#str)");

		expr = parser.parseExpression("new java.util.Date().toString()");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("'Sudhakar Java Tech'.toUpperCase()");
		System.out.println(expr.getValue());
	}
}
