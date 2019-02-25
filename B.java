package ormuco;

public class B {
	public static void version(String v1, String v2){
		String[] v1s = v1.split("\\.");
		String[] v2s = v2.split("\\.");
		int v1int,v2int;
		for(int n=0; n<Math.max(v1s.length, v2s.length); n++){
			if(n >= v1s.length){
				v1int=0;
			}else{
				v1int = Integer.parseInt(v1s[n]);
			}
			if(n >= v2s.length){
				v2int=0;
			}else{
				v2int = Integer.parseInt(v2s[n]);
			}
			if(v1int<v2int){
				System.out.println(v1 +" is less than "+ v2);
				return;
			}else if(v1int>v2int){
				System.out.println(v1 +" is greater than "+ v2);
				return;
			}
			
		}
		System.out.println(v1 +" is equal to "+ v2);
	}
	
	public static void main(String[] args) {		
//		String v1="1.2";
//		String v2="1.1";
		
//		String v1="1.0.1";
//		String v2="1";
		
//		String v1="1.5.2";
//		String v2="1.6";
				
//		String v1="1.0";
//		String v2="1.0.0.0";
		
//		String v1="1.0.1";
//		String v2="1.0.0.0.1";

		String v1="1.01";
		String v2="1.000001";
		
		version(v1,v2);
	}

}
