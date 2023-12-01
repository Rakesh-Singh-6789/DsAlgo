package linkedList;

public class Node {
	
	public int data;
	 public Node next;
	
	 Node()
	 {
	     this.data = 0;
	     this.next = null;
	 }
	
	 Node(int data)
	 {
	     this.data = data;
	     this.next = null;
	 }
	 
	public static Node arrayToList(int[] arr) {
		
		Node head = new Node(arr[0]);
		Node current = head;
		
		for(int i=1; i<arr.length; i++) {
			Node temp = new Node(arr[i]);
			current.next = temp;
			current = temp;
		}
		
		return head;
	}
	
	public static void printLL(Node head) {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + ", ");
			current = current.next;
		}
		System.out.println();
	}
	public static Node oddEvenList(Node head) {
        // Write your code here.
        if(head.next == null) {return head;}
        Node even = head.next;
        Node odd = head;
        Node oddHead = head;
        Node evenHead = head.next;

        while(even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next; 
        }

        odd.next = evenHead;

        return oddHead;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,6,1,7,3};
		Node head = arrayToList(arr);
		printLL(head);
		Node oddEvenHead = oddEvenList(head);
		printLL(oddEvenHead);
	}

}
