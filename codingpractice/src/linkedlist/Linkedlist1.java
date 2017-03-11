package linkedlist;


//linked list class
public class Linkedlist1 {
	
	Node head;
	// class to declare node structure
	class Node{
		
		int data;
		Node next;
		
		
		//constructor of node class
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}// end of class node
	
	
	//function to add node at beginnig of link list
	public void insertAtbeg(int data){
		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}
	
	//functiom to print nth node from last
	
	//method1 take two pointers
	public void printNfromLast(int n){
		Node t1,t2;
		
		
	}
	
	public void printList(){
		Node temp;
		temp = head;
		
		while(temp != null){
			
			System.out.print(temp.data+"->");
			temp = temp.next;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linkedlist1 list1 = new Linkedlist1();
		
		list1.insertAtbeg(10);
		list1.insertAtbeg(11);
		list1.printList();
		//test

	}

}
