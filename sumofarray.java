package nov22;

import java.util.Scanner;

public class sumofarray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a[]= new int[10];
		int sum=0;
		int i;
		for( i=0;i<a.length;i++) {
				 a[i]=sc.nextInt();
				
		}
		for( i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		}
}
