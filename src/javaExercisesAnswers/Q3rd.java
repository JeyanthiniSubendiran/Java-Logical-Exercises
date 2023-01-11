package javaExercisesAnswers;

public class Q3rd {

	public static void main(String[] args) {
		//int len;
		int[] A = {1,2,3,4,5,6,7,8,9,10};
		int sumA =0;
		for(int i=0; i<A.length;i++)
		{
			sumA = A[i]+sumA;
		}
		System.out.println("The sum of array elements is "+sumA);
	}

}
