package exercise;

public class Test {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.printElements();
		System.out.println();
		
		System.out.println("number of elements: " + list.size());
		
		list.add(5);
		list.add(3);
		
		list.printElements();
		System.out.println();
		
		System.out.println("number of elements: " + list.size());
		
		LinkedList list2 = new LinkedList();
		list2.add(103);
		System.out.println("number of elements in list2: " + list2.size());
		list2.printElements();
		System.out.println();
		
		list.add(12);
		System.out.println("number of elements in list: " + list.size());
		list.printElements();
		System.out.println();
		
		System.out.println("remove 3 from list");
		list.remove(3);
		System.out.println("number of elements in list: " + list.size());
		list.printElements();		
		System.out.println();
		System.out.println("remove 5 from list");
		list.remove(5);
		System.out.println("number of elements in list: " + list.size());
		list.printElements();		
	}

}
