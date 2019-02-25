package ormuco;

public class A {
	public static void overlap(int[] line1, int[] line2){
		if ((line1.length!=2)||(line2.length!=2)||(line1[0] >= line1[1])||(line2[0] >= line2[1])){
			System.out.println("invalid input: not 2 lines");
		}else{
			if((line2[0]<=line1[0]) && (line2[1]>line1[0])){
				System.out.println("overlap");
			}else if((line1[0]<line2[0]) && (line2[0]<line1[1])){
				System.out.println("overlap");
			}else{
				System.out.println("not overlap");
			}
		}
	}	
	public static void main(String[] args) {
		int[] line1 = {-6,-2};
		int[] line2 = {-5,-3};
		overlap(line1,line2);
	}
}

