package myreflect.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvokationHandler implements InvocationHandler {

	private Object target;
	
	public void setTarget(Object target) {
		this.target = target;
	}

	/**
	 * ִ�ж�̬�����������з���ʱ�����ᱻ�滻��ִ�����µ�invoke����
	 * ���У�
	 * proxy������̬�������
	 * method����������ִ�еķ���
	 * args���������Ŀ�귽��ʱ�����ʵ��
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
