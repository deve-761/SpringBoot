package com.sudha;

import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope {

	Map<String, Object> scope = null;

	CustomThreadLocal threadLocal = new CustomThreadLocal();

	@Override
	public Object get(String name, ObjectFactory objectFactory) {
		scope = (Map<String, Object>) threadLocal.initialValue();
		Object obj = scope.get(name);
		if (obj == null) {
			obj = objectFactory.getObject();
			scope.put(name, obj);
		}
		return obj;
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerDestructionCallback(String arg0, Runnable arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object remove(String name) {
		Object obj = scope.remove(name);
		return obj;
	}

	@Override
	public Object resolveContextualObject(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
