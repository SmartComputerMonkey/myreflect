package myreflect.cglib;

public class TestCglib {
	public static void main(String[] args) {
        //�������ǵĴ�����
		MyProxy Proxy = new MyProxy();
		Dog dog = (Dog)Proxy.getProxy(Dog.class);
		dog.run();

    }
}
