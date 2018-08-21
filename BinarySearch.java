import java.util.*;

public class BinarySearchExample{
	public static void main(String[] args){
		int[] input = {2,5,7,9,11,14,16,17};
		int key = 15;
		int index = GetBinarySearch(input,key,0,input.length-1);
		if(index < 0)
			System.out.println("Not found");
               else
		        System.out.println(key + " is at "+ index +" position");
	}
	
	public static int GetBinarySearch(int[] input,int key,int min,int max){
                int l = min+(max-min)/2;
		if(max-min<0)
		        return -1;         
		if(key==input[l])
			return l;
		else if(key < input[l])
			return GetBinarySearch(input,key,min,l-1);
		else
			return GetBinarySearch(input,key,l+1,max); 
	}
}
