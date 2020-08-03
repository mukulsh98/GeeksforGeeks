package array;

import java.util.Scanner;

public class subarraywithgivensum {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,s;
		
		System.out.print("");
		n=sc.nextInt();
		s=sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		find_sum(n,s,arr);
	}
	
	public static void find_sum(int n,int s, int[] arr){
		
		int i=0,j=0;
		int temp=s;
		int flag =0;
		
		for(int m=0;m<n;m++) {
			for(int a=0;a<n;a++) {
				if(temp == 0) {
					flag=1;
					
					break;
				}
				else if(temp >0) {
					temp = temp - arr[j];
					j++;
				}
				else {
					break;
				}
			}
			if(flag == 1) {
				j=j-1; // since it checks for one wrong index...
				break;
				
			}
			else {
				temp =s;
				i++;
				j=i;
			}
		}
		
		
		if(flag == 1)
			System.out.println("Starting index: "+i+" Ending index: "+j);
		else
			System.out.println("-1");
	}

}
