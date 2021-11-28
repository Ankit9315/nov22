package nov22;

import java.util.Scanner;

public class midle {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a[]= new int[10];
		int i;
		for( i=0;i<a.length;i++) {
				 a[i]=sc.nextInt();
				
		}
		int b=(a.length)/2;
		if(a.length%2!=0) {
			System.out.println("middle element of array is  "+a[b]);
		}else {
			System.out.println("middle element of array is  "+a[b-1]+" & "+ a[b]);
		}
		
		}
}
