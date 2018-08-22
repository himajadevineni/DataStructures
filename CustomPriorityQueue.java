import java.util.*;

public class CustomPriorityQueue{

	public static void main(String[] args){
		
		PriorityQueue<String> pq = new PriorityQueue<String>();

		pq.add("Himaja");
		pq.add("nextHimaja");
		
		while(!pq.isEmpty())
			System.out.println(pq.remove());
	}

}