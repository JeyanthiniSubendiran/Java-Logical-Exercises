package javaExercisesAnswers;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//
		
		int arrayLength =10;
		int[] Array = new int[arrayLength];
		System.out.print("Enter numbers: ");
		for(int i=0; i<arrayLength; i++)
		{
			Array[i]=scnr.nextInt();
			//Array[i] =10*i+i;
		}
		int arraySum=0;
		for(int i=0; i<arrayLength; i++)
		{
			//System.out.print(Array[i]+" ");
			arraySum = Array[i]+arraySum;
			
			
		}
		System.out.println("Array sum "+arraySum);

		double average= arraySum/Array.length;
		System.out.println("average of 10 numbers: "+average);
		
		double var = 0;
		for(int i=0; i<arrayLength; i++)
		{
			var= Array[i]-average;
		}
		System.out.println("variance is: "+var);
		double std;
	}

}
