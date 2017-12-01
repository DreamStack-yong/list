package a1;

import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class example {
	Node head=null;
	public void addNode(int d) {
		Node newNode=new Node(d);
		if(head==null) {
			head=newNode;
			return;
		}
		Node tem=head;
		while (tem.next!=null) {
			tem=tem.next;
		}
		tem.next=newNode;
	}
	public void printList() {
		Node tem=head;
		System.out.print("打印列表：");
		while(tem!=null) {
			System.out.print(" "+tem.data+" " );
			tem=tem.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example list=new example();
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(6);
		list.addNode(7);
		
		list.printList();

	}

}
//class Node{
//	Node next=null;
//	int data;
//	public Node(int data) {
//		this.data=data;
//	}
//}