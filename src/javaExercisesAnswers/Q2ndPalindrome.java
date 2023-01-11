package javaExercisesAnswers;

import java.util.Scanner;

public class Q2ndPalindrome {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the word: ");
		String word = scnr.next();
		int len = word.length();
		
		String reverse="";
		
		for(int i=len-1; i>=0; i--)
		{
			reverse = reverse+word.charAt(i);
			//System.out.print(word.charAt(i)+" ");
		}
		System.out.print("The reverse string is: "+reverse);
		System.out.println();
		if(reverse.equals(word))
		{
			System.out.println("You entered a palindrome string");
		}
		else
			System.out.println("the string is not palindrome");
		
		
	}
	}


