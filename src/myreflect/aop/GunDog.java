package myreflect.aop;

public class GunDog implements Dog {

	@Override
	public void info() {
		System.out.println("GunDog��info����");
	}

	@Override
	public void run() {
		System.out.println("GunDog��run����");
	}

}
