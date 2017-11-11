package typeinfo;

import java.lang.reflect.Field;
import java.util.Arrays;

class TypeSuper {
	public TypeSuper() {
		System.out.println("TypeSuper Constor");
	}
}
public class TypeTest extends TypeSuper {
	private int count=1;
	public static void main(String[] args) {
		Class c = null;
		try {
			c=Class.forName("typeinfo.TypeTest");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TypeTest typeTest = null;
		try {
			System.out.println(c.newInstance() instanceof TypeTest);
			typeTest = (TypeTest) c.newInstance();//必须强转才能调用
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.getSuperclass();
		Field[] fields=c.getDeclaredFields();
		System.out.println((fields[0]));
		System.out.println(typeTest.count);
		System.out.println(c.getSimpleName());
	}
}
