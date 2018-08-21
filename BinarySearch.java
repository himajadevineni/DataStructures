import java.util.*;

public class BinarySearch{
	public static void main(String[] args){
		int[] input = {2,5,7,9,11,14,16,17};
		int key = 9;
		int index = GetBinarySearch(input,key,0,input.length-1);
		if(index == -1)
			System.out.println("Empty Array");
		System.out.println(key + " is at "+ index +" position");
	}
	
	public static int GetBinarySearch(int[] input,int key,int min,int max){
		if(input.length==0)
		{
			return -1;
		}
                int l = max-min;
		int n = input[l/2];
		if(key==n)
			return l/2;
		else if(key < n)
			return GetBinarySearch(input,key,min,l/2-1);
		else
			return GetBinarySearch(input,key,l/2+1,max); 
	}
}
