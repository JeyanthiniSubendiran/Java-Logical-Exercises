package javaExercisesAnswers;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		double std;
		double average;
		double var = 0;
		double variance=0;
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

		 average= arraySum/Array.length;
		System.out.println("average of 10 numbers: "+average);
		
		
		for(int i=0; i<arrayLength; i++)
		{
			var = Math.pow(Array[i]-average, 2);
			
			
			variance= var+variance;
			
		}
		System.out.println("variance is: "+variance);
		
		
		std = Math.sqrt(variance)/Array.length;
		System.out.println("Standard deviation of 10 numbers in the array list is "+std);
	}

}
