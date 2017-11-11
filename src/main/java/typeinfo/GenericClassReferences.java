package typeinfo;
//: typeinfo/GenericClassReferences.java

public class GenericClassReferences {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		intClass = double.class;
		//genericIntClass = double.class; // Illegal 因为Integer Class 对象不是 Number Class对象的子对象		
		
		//好处是他表示你并非是碰巧或者由于疏忽，而使用了一个非具体的类引用，你就是选择了非具体的版本
		 Class<?> intClass2 = int.class;
		    intClass2 = double.class;
		
		  //限制为某种类型，或该类型的任何子类型，为了提供编译器类型检查。  
		 Class<? extends Number> bounded = int.class;
		    bounded = double.class;
		    bounded = Number.class;
		    // Or anything else derived from Number.
		
		
	}
} /// :~
