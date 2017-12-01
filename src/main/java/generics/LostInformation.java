package generics;

//: generics/LostInformation.java
import java.util.*;

class Frob {}
class Fnorkle {}
class Quark<Q> {}
class Particle<POSITION, MOMENTUM> {}

/*
 * 在泛型代码内部，无法获得任何有关泛型参数类型的信息。
 * Java泛型是使用擦除来实现的，这意味着当你使用泛型时，任何具体的类型信息都将被擦除。
 * 泛型类型参数将擦除到它的第一个边界
 * 当你希望代码能够跨多个类工作时，使用泛型才有帮助，
 * T extends Hasf 返回T的方法才有帮助。
 */
public class LostInformation {
	public static void main(String[] args) {
		List<Frob> list = new ArrayList<Frob>();
		Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long, Double> p = new Particle<Long, Double>();
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
	}
} /*
	 * Output: [E] [K, V] [Q] [POSITION, MOMENTUM]
	 */// :~
