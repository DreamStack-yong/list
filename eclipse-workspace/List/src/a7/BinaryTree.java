package a7;

import java.nio.file.attribute.AclEntry.Builder;
import java.sql.DatabaseMetaData;

import org.junit.Test;

public class BinaryTree {
	private Node root;

	public BinaryTree() {
		root = null;
	}

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree biTree = new BinaryTree();
		int[] data = {2,8,7,4,9,3,1,6,5};
		biTree.buildTree(data);
		System.out.print("中序遍历结果如下:");
		biTree.inOrder();
		System.out.print("\n"+"先序遍历结果如下：");
		biTree.preOrder();
		System.out.print("\n"+"后序遍历结果如下：");
		biTree.postOrder();

	}

	// =====================================中序遍历
	public void buildTree(int[] data) {
		for (int i = 0; i < data.length; i++) {
			insert(data[i]);
		}
	}
//==================为什么出错？
//	public void insert(int data) {
//		Node newNode = new Node(data);
//		if (root == null) {
//			root = newNode;
//		} else {
//			Node current = root;
//			
//			while (true) {
//				if (data < current.data) {
//					current = current.left;
//					if (current == null) {
//						current = newNode;
//						return;
//					}
//				} else {
//					current = current.right;
//					if (current == null) {
//						current = newNode;
//						return;
//					}
//
//				}
//			}
//		}
//	}
	
	
	public void insert(int data) {
		Node newNode=new Node(data);
		if(root==null) {
			root=newNode;
		}
		else {
			Node current=root;
			Node parent;
			while(true) {
				parent=current;
				if(data<current.data) {
					current=current.left;
					if(current==null) {
						parent.left=newNode;
						return;
					}
				}
				else {
					current =current.right;
					if(current==null) {
						parent.right=newNode;
						return;
					}
				}
			}
		}
	}

	// == ==================================中序遍历
	public void inOrder() {
		this.inOrder(this.root);
	}

	public void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.left);
			System.out.print(localRoot.data+" ");
			inOrder(localRoot.right);
		}
	}
	
//=======================================先序遍历
	public void preOrder() {
		this.preOrder(this.root);
	}
	public void preOrder(Node localRoot) {
		if(localRoot!=null) {
			System.out.print(localRoot.data+" ");
			preOrder(localRoot.left);
			preOrder(localRoot.right);
		}
	}
//========================================后续遍历
	public void postOrder() {
		this.postOrder(this.root);
	}
	public void postOrder(Node localRoot) {
		if(localRoot!=null) {
			postOrder(localRoot.left);
			postOrder(localRoot.right);
			System.out.print(localRoot.data+" ");
		}
	}
}

// ========================================创造Node类
class Node {
	Node left;
	Node right;
	public int data;

	public Node(int data) {
		this.right = null;
		this.left = null;
		this.data = data;
	}
}