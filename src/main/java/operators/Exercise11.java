package operators;

import static net.mindview.util.Print.*;

public class Exercise11 {
	public static void main(String[] args) {
		int k = 0X80000000;
		print(String.valueOf(k));
		print(Integer.toBinaryString(k));
		for(int j=0;j<32;j++){
			k >>= 1; print(Integer.toBinaryString(k)+"\t"+k);
		}
		
		print("**************************************************************************************************");
		 int i = -1 << 1;
		 print(Integer.toBinaryString(i)+"\t"+i);
		 i >>>= 1 ;print(Integer.toBinaryString(i)+"\t"+i);
		 while(i>0){
			StringBuffer sb =new StringBuffer(Integer.toBinaryString(i));
			while(sb.length()<32){
				sb.insert(0, "0");
			}
			 i >>>= 1 ;print(sb+"\t"+i);
		 }
		
		
	}

}
