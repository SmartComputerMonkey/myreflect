package myreflect.lx;

import java.lang.reflect.Field;

public class FieldTest {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Person p = new Person();
		Class<Person> personClazz = Person.class;
		
		//通过getDeclaredField获得成员变量
		Field nameField = personClazz.getDeclaredField("name");
		Field ageField = personClazz.getDeclaredField("age");
		//设置通过放射访问该成员变量时取消访问权限检查
		nameField.setAccessible(true);
		ageField.setAccessible(true);
		//调用set 方法为p对象的name成员变量设置值
		nameField.set(p, "yeeku.h.lee");
		ageField.set(p, 30);
		
		System.out.println(p);
	}
}
