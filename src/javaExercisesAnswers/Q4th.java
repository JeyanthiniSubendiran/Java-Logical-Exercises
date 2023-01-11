package javaExercisesAnswers;

import java.util.Scanner;

public class Q4th {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Give the length of an Array: ");
		int len =scnr.nextInt();
		
		//int[]a= new int[len];
		char[] Array = new char[len];
		
		//System.out.println("Enter numbers: ");
		System.out.println("enter character into an array: ");
		for(int i=0; i<len;i++)
		{
			Array[i]=scnr.next().charAt(0);
			
			//a[i]=scnr.nextInt();
		}
		System.out.println("characters from array: ");
		for(int i=0;i<len;i++)
		{
			
			System.out.print(Array[i]+" ");
		}
		System.out.println("The array elements(characters) in reverse order: ");
		for(int i=len-1; i>=0; i--)
		{
			System.out.print(Array[i]+" ");
		}
	}

}
