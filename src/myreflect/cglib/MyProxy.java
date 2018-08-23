package myreflect.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyProxy implements MethodInterceptor {

	//ͨ��Enhancer �����������
	private Enhancer enhancer = new Enhancer(); 
	
	 //ͨ��Class�����ȡ�������
    public Object getProxy(Class c){
        //���ô����������
        enhancer.setSuperclass(c);
        enhancer.setCallback(this);
        return enhancer.create();
    }
	@Override
	public Object intercept(Object obj, Method m, Object[] args, MethodProxy proxy) throws Throwable {
		 // TODO Auto-generated method stub
        System.out.println("��־��ʼ...");
        //��������ø���ķ���
        proxy.invokeSuper(obj, args);
        System.out.println("��־����...");
        return null;
	}

}
