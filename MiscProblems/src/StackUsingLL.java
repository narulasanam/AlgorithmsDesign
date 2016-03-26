import java.util.LinkedList;

public class StackUsingLL<T> {
	static LinkedList<Integer> ll = new LinkedList<>();
	public static void main(String[] args) {
		StackUsingLL<Integer> stackll = new StackUsingLL<>();
		stackll.push(2);
		stackll.push(3);
		stackll.push(4);
		
		while(ll.size()!=0)
		System.out.println(stackll.pop());		
	}
	
	void push(int num) {
		ll.addFirst(num);
	}
	
	int pop() {
		return ll.removeFirst();	
	}
}
