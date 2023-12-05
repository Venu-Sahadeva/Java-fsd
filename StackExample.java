import java.util.Stack;
public class StackExample {
	 public static void main(String[] args) {
	        // Creating a stack
	        Stack<Integer> stack = new Stack<>();

	        // Inserting elements (push) into the stack
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);

	        System.out.println("Stack after pushing elements: " + stack);

	        // Removing elements (pop) from the stack
	        int poppedElement = stack.pop();
	        System.out.println("Popped element: " + poppedElement);
	        System.out.println("Stack after popping element: " + stack);

	        // Inserting another element after popping
	        stack.push(50);
	        System.out.println("Stack after pushing another element: " + stack);
	       
	    }
	}

