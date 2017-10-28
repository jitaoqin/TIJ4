package operators;//: operators/EqualsMethod.java

public class EqualsMethod {
  public static void main(String[] args) {
    Integer n1 = new Integer(47);
    Integer n2 = new Integer(47);
    System.out.println(n1.equals(n2));//true 同一个对象引用不同
    System.out.println(n1 == n2);//false
    System.out.println(n1 != n2);//true
    
    Value v1 = new Value();
	Value v2 = new Value();
	v1.i = v2.i = 100;
	System.out.println(v1.equals(v2));//false 比较的是引用
  }
  
}
class Value {
	int i;
}
