package myreflect.lx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {
	
	private ClassTest() {}
	
	public ClassTest(String name) {System.out.println("ִ���вι��캯��");}
	
	public void info() {System.out.println("ִ���޲ε�info����");}
	
	public void info(String str) {
		System.out.println("ִ���вε�info����" + ",��str����ֵ��" + str);
	}
	
	class Inner {}
	
	public static void main(String[] args) throws Exception {
		
		Class<ClassTest> clazz = ClassTest.class;
		
		//��ȡ��Class��������Ӧ�۵�ȫ�����캯��
		Constructor[] ctors = clazz.getDeclaredConstructors();
		
		System.out.println("ClassTest��ȫ�����������£�");
		
		for (Constructor c : ctors) {
			System.out.println(c);
		}
		
		//��ȡ��Class��������Ӧ�۵�ȫ��public������
		Constructor<?>[] publicCotrs = clazz.getConstructors();
		
		System.out.println("ClassTest��ȫ��public���������£�");
		
		for (Constructor<?> c : publicCotrs) {
			System.out.println(c);
		}
		
		//��ȡ��Class��������Ӧ�۵�ȫ��public����
		Method[] mtds = clazz.getMethods();
		System.out.println("ClassTest��ȫ��public�������£�");
		for (Method method : mtds) {
			System.out.println(method);
		}
		
		System.out.println("ClassTest���һ���ַ���������info����Ϊ��" + clazz.getMethod("info", String.class));
		
		//��ȡ��class��������Ӧ���ȫ���ڲ���
		Class<?>[] inners = clazz.getDeclaredClasses();
		System.out.println("���е��ڲ���Ϊ��");
		for (Class<?> c : inners) {
			System.out.println(c);
		}
		
		//ʹ��class.forName()��������classTest��Inner�ڲ���
		Class inClazz = Class.forName("ClassTest$Inner");
		//ͨ��getDeclaringClass ���ʸ�������ڵ��ⲿ��
		System.out.println("inClazz��Ӧ����ⲿ��Ϊ��"+inClazz.getDeclaringClass());
		System.out.println("ClassTest�İ�Ϊ��"+inClazz.getDeclaringClass());
		System.out.println("ClassTest�ĸ���Ϊ��"+inClazz.getDeclaringClass());
	}
}
