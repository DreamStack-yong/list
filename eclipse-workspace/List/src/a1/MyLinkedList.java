package a1;

import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class MyLinkedList {
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
	public int lengthList() {
		Node tem=head;
		int len=0;
		while(tem!=null) {
			len++;
			tem=tem.next;
		}
		return len;
	}
	public Node orderList() {
		for(Node curNode=head;curNode.next!=null;curNode=curNode.next) {
			for(Node aem=curNode.next;aem!=null;aem=aem.next) {
				int tem;
				if(aem.data>curNode.data) {
					tem=curNode.data;
					curNode.data=aem.data;
					aem.data=tem;
				}
			}
		}
		return head;
	}
	
	public boolean delteNode(int index) {
		int i=1;
		Node tem=head;
		if(index<1 || index>lengthList()) {
			return false;
		}
		else if(index==1) {
			head=head.next;
			return true;
		}
		else{
			
			while(i<index-1) {
				i++;
				tem=tem.next;
			}
			Node preNode=tem;
			Node curNode=tem.next;
			preNode.next=curNode.next;
//			tem.next=tem.next.next;
			return true;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list=new MyLinkedList();
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(6);
		list.addNode(7);
		
		list.printList();
		System.out.println("链表长度为："+list.lengthList());
		
		list.delteNode(3);
		
		list.printList();
		list.orderList();
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