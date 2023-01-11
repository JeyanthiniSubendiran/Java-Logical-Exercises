package javaExercisesAnswers;

import java.util.Scanner;

public class Q2ndPalindrome {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("length of array: ");
		int len = scnr.nextInt();
		
		char[] cArray = new char[len];
		for(int i=0;i<len;i++)
		{
			cArray[i]= scnr.next().charAt(0);
		}
		//System.out.println(len);
		char[] bArray = new char[len];
		for(int i=len-1; i>=0;i--)
		{
		
			System.out.print(cArray[i]+" ");
		}
		System.out.println();
		for(int i=0; i<len; i++)
		{
			bArray[i]=cArray[(len-1)-i];
			System.out.print(bArray[i]+" ");
			//len =len-1;
		}
		for(int i=0; i<len;i++) {
			//System.out.println("Array B: ");
		
		if(cArray[i]==bArray[i])
		{
		System.out.println("palindrome");
		}
		else
		
			System.out.println("not palindrome");
		}
	}
	}


