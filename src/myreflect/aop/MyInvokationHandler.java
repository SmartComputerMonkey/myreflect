package myreflect.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvokationHandler implements InvocationHandler {

	private Object target;
	
	public void setTarget(Object target) {
		this.target = target;
	}

	/**
	 * 执行动态代理对象的所有方法时，都会被替换成执行如下的invoke方法
	 * 其中：
	 * proxy：代表动态代理对象
	 * method：代表正在执行的方法
	 * args：代表调用目标方法时传入的实参
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		DogUtil du = new DogUtil();
		du.method1();
		Object result = method.invoke(target, args);
		du.method2();
		return result;
	}

}
