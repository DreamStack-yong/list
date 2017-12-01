package a1;

public class add_i_node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add_i_node ad=new add_i_node();
		Node a1=new Node(1);
		Node a2=new Node(2);
		Node a3=new Node(3);
		Node a4=new Node(4);
		int i=2,count=0;
		Node a8=new Node(123);
		a1.next=a2;
		a2.next=a3;
		a3.next=a4;
		
		for(Node node=a1;node!=null;node=node.next) {
			count++;
			if(count==i-1) {
				a8.next=node.next;
				node.next=a8;
			}
		}
		for(Node node=a1;node!=null;node=node.next) {
			System.out.println(node.data);
		}
		count=0;
		for(Node node=a1;node!=null;node=node.next) {
			count++;
			if(count==i-1) {
				Node p=node.next;
				node.next=p.next;
			}
		}
		for(Node node=a1;node!=null;node=node.next) {
			System.out.println(node.data);
		}
		
	}


}
//class Node{
//	int data;
//	Node next=null;
//	public Node(int data) {
//		this.data=data;
//	}
//}
