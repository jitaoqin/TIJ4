package interfaces;


interface in1{
	void  f1();
	void  f2();
}
interface in2{
	void  f3();
	void  f4();
}
interface in3{
	void  f5();
	void  f6();
}
interface in4 extends in1,in2,in3{
	void f7();
}

class c1{
	 public void f8() {};
}

public class Exercise14 extends c1 implements in4 {

	@Override
	public void f1() {}
	@Override
	public void f2() {}
	@Override
	public void f3() {}
	@Override
	public void f4() {}
	@Override
	public void f5() {}
	@Override
	public void f6() {}
	@Override
	public void f7() {}
	public static void f8(in1 i1) {
		System.out.println("f8");
	}
	public static void f9(in2 i2) {
		System.out.println("f8");
	}
	public static void f10(in3 i3) {
		System.out.println("f8");
	}
	public static void f11(in4 i4) {
		System.out.println("f8");
	}
	public static void main(String[] args) {
		Exercise14 exercise14 =new Exercise14();
		f8(exercise14);
		f9(exercise14);
		f10(exercise14);
		f11(exercise14);
	}

}
