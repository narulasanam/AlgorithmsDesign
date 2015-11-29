import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianProblem {

	static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
			Collections.reverseOrder());

	public static void main(String arg[]) {
		File file = new File("Median.txt");
		Scanner in;
		long sumMedian = 0;
		try {
			in = new Scanner(file);

			sumMedian = 0;

			while (in.hasNextInt()) {
				addNewNum(in.nextInt());

				if (Math.abs(minHeap.size() - maxHeap.size()) > 1) {
					makeBalance();
				}
				sumMedian += reportMedian();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sumMedian%10000);
	}

	private static int reportMedian() {
		if(maxHeap.size() >= minHeap.size())
			return maxHeap.peek();
		else
			return minHeap.peek();

	}

	private static void makeBalance() {
		if (minHeap.size() < maxHeap.size()) {
			int temp = maxHeap.poll();
			minHeap.add(temp);
		} else {
			maxHeap.add(minHeap.poll());
		}

	}

	private static void addNewNum(int nextInt) {

		if (minHeap.isEmpty() && maxHeap.isEmpty()) {
			minHeap.add(nextInt);
		} else {
			if (nextInt < minHeap.peek()) {
				maxHeap.add(nextInt);
			} else {
				minHeap.add(nextInt);
			}
		}
	}
}
