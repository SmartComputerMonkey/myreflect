package myreflect.cglib;

public class TestCglib {
	public static void main(String[] args) {
        //创建我们的代理类
		MyProxy Proxy = new MyProxy();
		Dog dog = (Dog)Proxy.getProxy(Dog.class);
		dog.run();

    }
}
