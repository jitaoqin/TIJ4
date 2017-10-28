package initialization;
//: initialization/SimpleEnumUse.java

public class SimpleEnumUse {
	public enum Spiciness {
		NOT, MILD, MEDIUM, HOT, FLAMING
	}//也可以单独放到Spiciness.java文件中

	public static void main(String[] args) {
		Spiciness howHot = Spiciness.MEDIUM;
		System.out.println(howHot);
		
		//ordinal（）用来表示某个特定enum常量的声明顺序
		for (Spiciness value : Spiciness.values()) {
			System.out.println(value+"\tordinal:" +value.ordinal());
		}
		System.out.println();
	}
	

}
/*
 * Output: MEDIUM
 */// :~
