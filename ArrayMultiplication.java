import java.util.*;

public class ArrayMultiplication{

	public static void main(String[] args)
	{
		int[][] inputArray1 = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		int[][] inputArray2 = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		int[][] outputArray;

		outputArray = arrayMultiply(inputArray1,inputArray2);
		
		if(outputArray == null)
		{
			System.out.println("Invalid inputs");
		}
		else{

			for(int i =0;i<outputArray.length;i++)
			{
				for(int j=0;j<outputArray[i].length;j++)
				{
					System.out.print(" " + outputArray[i][j]);
				}
			
				System.out.println("\n");
			}
		}	
	}

	private static int[][] arrayMultiply(int[][] inputArray1,int[][] inputArray2){
		
		if(inputArray1 == null || inputArray2 == null)
			return null;
		else if(inputArray1[0].length != inputArray2.length)
			return null;
		else
		{
			int[][] output = new int[inputArray1.length][inputArray2[0].length];
			for(int i=0;i<inputArray1.length;i++){
				for(int j=0;j<inputArray2[i].length;j++){
					output[i][j]=0;
					for(int k=0;k<inputArray2.length;k++)
					{
					output[i][j] = output[i][j] + inputArray1[i][k]*inputArray2[k][j];
					}
				}
			}
			
			return output;
		}
			
	}
}