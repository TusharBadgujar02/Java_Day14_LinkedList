package bridgelabz;

public class Runner {
	 public static void main(String[] args) {
		 LinkedList<Integer> numberList = new LinkedList<>();
	        numberList.add(56);
	        numberList.add(70);
	        numberList.addAtIndex(1, 30);
	        numberList.show();
	        String searchResult = (numberList.searchByValue(30) == -1) ? "value not found in the list" : "value found at index " + numberList.searchByValue(30);
	        System.out.println(searchResult);
	        System.out.println("After Inserting");
	        numberList.searchAndInsert(30,40);
	        numberList.show();
	    }
	}