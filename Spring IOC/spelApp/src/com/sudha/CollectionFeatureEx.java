package com.sudha;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class CollectionFeatureEx {

	public static void main(String[] args) throws Exception {
		City_State_Collection collection = new City_State_Collection();
		StandardEvaluationContext context = new StandardEvaluationContext(collection);
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("city_State.?[state=='KA']");
		ArrayList<City_State> al = (ArrayList<City_State>) expr.getValue(context);
		System.out.println(al);
	}
}
