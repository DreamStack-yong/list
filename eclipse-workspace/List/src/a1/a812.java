package a1;

import java.awt.HeadlessException;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class a812 {
	Node head = null;

	public void addNode(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
			return;
		}
		Node tem = head;
		while (tem.next != null) {
			tem = tem.next;
		}
		tem.next = newNode;
	}

	public void printList() {
		Node tem = head;
		System.out.print("打印列表：");
		while (tem != null) {
			System.out.print(" " + tem.data + " ");
			tem = tem.next;
		}
	}
	public void print() {
		System.out.println(head.data);
	}
	
//======================================为什么空指针异常	
//	public void delDuplete() {
//		for(Node node=head;node!=null;node=node.next) {
//			Node tem=node;
//			while(tem!=null) {
//				if(node.data==tem.next.data) {
//					tem.next=tem.next.next;
//				}else {
//					tem=tem.next;
//				}
//				
//			}
//		}
//	}
	
	
	public void delDuplete() {
		Node tem=head;
		while(tem!=null) {
			Node p=tem;
			while(p!=null) {
				if(tem.data==p.next.data) {
					tem.next=tem.next.next;
				}else {
					p=p.next;
				}
				
			}
			tem=tem.next;
		}
	}
	
//=========================下面方法正确	
//	public void delDuplete() {
//		for(Node node=head;node!=null;node=node.next) {
//			for(Node tem=node.next;tem!=null;tem=tem.next) {
//				if(tem.data==node.data) {
//					node.next=tem.next;
//				}
//			}
//		}
//	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a812 list = new a812();
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(6);
		list.addNode(7);
		list.printList();
		
		System.out.println("\n"+list.head.data);
		list.delDuplete();
		list.printList();
	}
	

}

class Node {
	Node next = null;
	int data;

	public Node(int data) {
		this.data = data;
	}
}