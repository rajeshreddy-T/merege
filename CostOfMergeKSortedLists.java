// Merge K sorted lists
import java.util.*;

public class CostOfMergeKSortedLists {
	public static void main(String[] args) {
  		int[] a = new int[3];

		for (int i = 0; i < a.length; i++) {
			a[i] = getRandomVal(1, 1000);
		}
		
		System.out.println("array a =>" + Arrays.toString(a));

		long startTime = System.currentTimeMillis();
		placeAinMinHeap(a);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: " + (endTime - startTime) + "ms");

	}


	public static void placeAinMinHeap(int[] a) {
		Queue<Integer> minHeap = new PriorityQueue<>();
		
		int noOfComparisions = 0;

		if(a.length == 1) {
			System.out.println("There is  only element in a=>" + a[0]);
			return;
		}
		System.out.println("a.length =>" + a.length);
		for (int i = 0; i < a.length; i++) {
			minHeap.add(a[i]);
		}

		System.out.println("minHeap =>" + minHeap);
		noOfComparisions = minHeap.poll();
		
		System.out.println("noOfComparisions =>" + noOfComparisions);
		int i=0;
		System.out.println("--------------------------------" );
		while (!minHeap.isEmpty()&&minHeap.size() > 1) {
			System.out.println("Comparing " + noOfComparisions + " and " + minHeap.peek());		
			noOfComparisions = noOfComparisions + minHeap.poll();
			if(minHeap.size()>0) {
				minHeap.add(noOfComparisions);
			}
			i++;		
			System.out.println("minHeap =>" + minHeap);
			System.out.println("noOfComparisions =>" + noOfComparisions);
			System.out.println("--------------------------------" );
			if(i>5){
				break;
			}
		}

	}

	private static int getRandomVal(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}



}
