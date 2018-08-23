package myreflect.lx;

import java.lang.reflect.Field;

public class FieldTest {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Person p = new Person();
		Class<Person> personClazz = Person.class;
		
		//ͨ��getDeclaredField��ó�Ա����
		Field nameField = personClazz.getDeclaredField("name");
		Field ageField = personClazz.getDeclaredField("age");
		//����ͨ��������ʸó�Ա����ʱȡ������Ȩ�޼��
		nameField.setAccessible(true);
		ageField.setAccessible(true);
		//����set ����Ϊp�����name��Ա��������ֵ
		nameField.set(p, "yeeku.h.lee");
		ageField.set(p, 30);
		
		System.out.println(p);
	}
}
