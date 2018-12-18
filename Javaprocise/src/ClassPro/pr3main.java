package ClassPro;

import java.util.Scanner;

public class pr3main {
		public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	//120^120^240
	double a= Math.pow(120,120 );
	System.out.println(a);
	int b=(int) Math.pow(a, 240);
	System.out.println(b);
	System.out.println(b>Integer.MAX_VALUE);
		}
}