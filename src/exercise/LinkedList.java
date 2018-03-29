package exercise;

public class LinkedList {

	private Node first = null;
	private int currentSize = 0;

	// create an empty linked list
	public LinkedList() {
		
	}
	
	// adds value to the end of the list
	public void add(int value) {
		// this is the new last node!
		Node newNode = new Node(value, null);
		
		if (first == null) {
			first = newNode;
		} else {
			// find the last node
			Node current = first;
			while (current.next != null) {
				current = current.next;
			}
			// we know: current.next == null
			// therefore, current is the last node!
			current.next = newNode;
		}
		
		// keep cached size up-to-date!
		currentSize++;
	}
	
	// constant complexity
	// O(1)
	public int size() {
		return currentSize;
		
		/*
		int counter = 0;
		if (first != null) {
			Node current = first;
			while (current.next != null) {
				counter++;
				current = current.next;
			}
			counter++;
		}
		return counter;
		*/
	}
	
	// Removes first occurrence of value. 
	public boolean remove(int value) {
		if (first == null) {
			return false;
		} else {
			// first != null
			Node prev = first;
			Node current = prev.next;
			if (current == null) {
				// list has exactly one element!
				if (prev.value == value) {
					first = null;
					currentSize--;
					return true;
				} else {
					return false;
				}
			} else {
				if (prev.value == value) {
					first = current;
					currentSize--;
					return true;
				}
				// value is not contained in prev!
				while (current != null && current.value != value) {
					prev = current;
					current = current.next;
				}
				if (current == null) {
					return false;
				} else {
					// we know: current.value != value
					prev.next = current.next;
					currentSize--;
					return true;
				}
			}
		}
	}
	
	public void printElements() {
		if (first != null) {
			Node current = first;
			while (current.next != null) {
				System.out.print(current.value + ",");
				current = current.next;
			}
			// we know: current.next == null
			System.out.print(current.value);
		} else {
			System.out.print("<empty>");
		}
	}
}
