package javaExercisesAnswers;

import java.util.Scanner;

public class Q4th {

	public static void main(String[] args) {
		int len =4;
		Scanner scnr = new Scanner(System.in);
		
		int[]a= new int[len];
		//char[] Array = scnr.next().toCharArray();
		
		System.out.println("Enter numbers: ");
		for(int i=0; i<len;i++)
		{
			//Array[i];
			a[i]=scnr.nextInt();
		}
		System.out.println("The array elements: ");
		for(int i=0;i<len;i++)
		{
			
			System.out.print(a[i]+" ");
		}
		System.out.println("The array elements in reverse order: ");
		for(int i=len-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
