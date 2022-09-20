package bridgelabz;

public class Runner {
	 public static void main(String[] args) {
	        LinkedList<Integer> numberList = new LinkedList<>();
	        numberList.add(56);
	        numberList.add(70);
	        numberList.addAtIndex(1, 30);
	        numberList.show();
	        System.out.println("After Inserting");
	        numberList.searchAndInsert(30,40);
	        numberList.show();
	        System.out.println();
	        numberList.searchValueAndDelete(40);
	        numberList.show();
	        System.out.println("Size of list is : " + numberList.size());

	    }
}
