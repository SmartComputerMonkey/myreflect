package myreflect.lx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {
	
	private ClassTest() {}
	
	public ClassTest(String name) {System.out.println("执行有参构造函数");}
	
	public void info() {System.out.println("执行无参的info方法");}
	
	public void info(String str) {
		System.out.println("执行有参的info方法" + ",其str参数值：" + str);
	}
	
	class Inner {}
	
	public static void main(String[] args) throws Exception {
		
		Class<ClassTest> clazz = ClassTest.class;
		
		//获取该Class对象所对应累的全部构造函数
		Constructor[] ctors = clazz.getDeclaredConstructors();
		
		System.out.println("ClassTest的全部构造器如下：");
		
		for (Constructor c : ctors) {
			System.out.println(c);
		}
		
		//获取该Class对象所对应累的全部public构造器
		Constructor<?>[] publicCotrs = clazz.getConstructors();
		
		System.out.println("ClassTest的全部public构造器如下：");
		
		for (Constructor<?> c : publicCotrs) {
			System.out.println(c);
		}
		
		//获取该Class对象所对应累的全部public方法
		Method[] mtds = clazz.getMethods();
		System.out.println("ClassTest的全部public方法如下：");
		for (Method method : mtds) {
			System.out.println(method);
		}
		
		System.out.println("ClassTest里带一个字符串参数的info方法为：" + clazz.getMethod("info", String.class));
		
		//获取该class对象所对应类的全部内部类
		Class<?>[] inners = clazz.getDeclaredClasses();
		System.out.println("所有的内部类为：");
		for (Class<?> c : inners) {
			System.out.println(c);
		}
		
		//使用class.forName()方法加载classTest的Inner内部类
		Class inClazz = Class.forName("ClassTest$Inner");
		//通过getDeclaringClass 访问该类的所在的外部类
		System.out.println("inClazz对应类的外部类为："+inClazz.getDeclaringClass());
		System.out.println("ClassTest的包为："+inClazz.getDeclaringClass());
		System.out.println("ClassTest的父类为："+inClazz.getDeclaringClass());
	}
}
