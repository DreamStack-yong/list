package a1;

import java.util.List;

import javax.print.attribute.standard.PresentationDirection;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class a813 {
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
//=================需要改善
//	public int findKNode(int k) {
//		Node node=head;
//		Node preKNode=head;
//		for(int count=1;count<=k;count++) {
//			if(node==null) {
//				System.out.println("k超过数组长度");
//				return null;
//			}
//			node=node.next;
//			
//		}
//		
//		while(node!=null) {
//			node=node.next;
//			preKNode=preKNode.next;
//		}
//		return preKNode.data;
//	}
	public Node findKNode(int k) {
		Node node=head;
		Node preKNode=head;
		int count=0;
		while(node!=null) {
			count++;
			if(count>k) {
				preKNode=preKNode.next;
			}
			node=node.next;
		}
		if(count<k) {
			System.out.println("不合法");
			return null;
		}
		return preKNode;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a813 list=new a813();
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(6);
		list.addNode(7);
		
		list.printList();
		System.out.println("倒数第9个："+list.findKNode(9).data);
		
	}

}
class Node{
	Node next=null;
	int data;
	public Node(int data) {
		this.data=data;
	}
}