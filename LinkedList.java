package bridgelabz;

public class LinkedList<T> {
	 Node<T> head;

	    /**
	     * Method for Appending the specified element to the end of this list.
	     *
	     * @param value
	     */
	    public void add(T value) {
	        Node<T> newNode = new Node<T>();
	        newNode.data = value;
	        newNode.next = null;
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node<T> last = head;
	            while (last.next != null) {
	                last = last.next;
	            }
	            last.next = newNode;
	        }
	    }

	    /**
	     * Method for printing the data inside the linkedlist.
	     */
	    public void show() {
	        Node<T> node = head;
	        while (node.next != null) {
	            System.out.println(node.data);
	            node = node.next;
	        }
	        System.out.println(node.data);
	    }

	    /**
	     * Method for Inserting the specific element at the start of the list.
	     *
	     * @param value
	     */
	    public void addAtStart(T value) {
	        Node<T> newNode = new Node<>();
	        newNode.data = value;
	        newNode.next = head;
	        head = newNode;
	    }

	    /**
	     * Method for Inserting the data at specific index of the list.
	     *
	     * @param index : position at which to be inserted
	     * @param data  : data to be inserted
	     */
	    public void addAtIndex(int index, T data) {
	        Node<T> newNode = new Node<>();
	        newNode.data = data;

	        if (index == 0) {
	            addAtStart(data);
	        } else {
	            Node<T> node = head;
	            for (int i = 0; i < index - 1; i++) {
	                node = node.next;
	            }
	            newNode.next = node.next;
	            node.next = newNode;
	        }
	    }

	    /**
	     * Method for removing the first element from the list.
	     */
	    public void pop() {
	        if (null != head) {
	            Node<T> newHead = head.next;
	            head = newHead;
	        }
	    }

	    /**
	     * Method for removing the last element from the list.
	     */
	    public void popLast() {
	        Node<T> tail = head;
	        Node<T> prevNode = head;
	        while (tail.next != null) {
	            prevNode = tail;
	            tail = tail.next;
	        }
	        prevNode.next = null;
	    }

}
 