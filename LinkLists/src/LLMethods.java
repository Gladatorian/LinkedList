
import java.util.Scanner;

public class LLMethods {
	LinkedList list = new LinkedList();
	Scanner reader = new Scanner(System.in);
	String input;
	int total;
	int going;
	
	public LLMethods() {
		input = " ";
		total = 1;
		going = 0;
		
	}

	public void input() {
		System.out.println("Add something to the list");
		while (going == 0) {
			System.out.println("Enter \"stop\" to stop");
			input = reader.nextLine();
			if (!(input.equals("stop"))) {
				list.addToStart(input, total);
				total++;
			}
			if (input.equals("stop"))
				going = 1;
		}
	}

	public void lister() {
//		if (list.contains("John"))
//			System.out.println("John is a cantaloupe.");
//		else
//			System.out.println("John is NOT a cantaloupe.");
//
//		list.deleteHeadNode();
		// while (list.deleteHeadNode())
		// ; // Empty loop body
//		System.out.println("Start of list:");
//		list.outputList();
//		System.out.println("End of list.");
		
		if (list.size() == 1) {
			System.out.println("List has " + list.size() + " node.");
			list.outputList();
		} else {
			list.outputList();
			System.out.println("List has " + list.size() + " nodes.");
		}
	}
	
	public void removeDupe() {
		for(int i = 0; i < list.size(); i++) {
			
		}
	}
	
	public void reverseList() {
		
	}
}