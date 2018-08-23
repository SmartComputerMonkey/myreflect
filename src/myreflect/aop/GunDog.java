package myreflect.aop;

public class GunDog implements Dog {

	@Override
	public void info() {
		System.out.println("GunDog的info方法");
	}

	@Override
	public void run() {
		System.out.println("GunDog的run方法");
	}

}
