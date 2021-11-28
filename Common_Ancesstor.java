package geekster;


public class Common_Ancesstor {
	
public static class Node{
		
		public int data;
		public Node left;
		public Node right;
		
		public Node() {}
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}

	
	public static void main(String[] args) {
		Node head = new Node(5);
		head.left = new Node(3);
		head.left.left = new Node(2);
		head.left.right = new Node(4);
		head.right = new Node(6);
		head.right.right = new Node(7);
		
		Node p = head.left.left;
		Node q = head.left.right;
		
		Node temp = ancestor(head, p, q);
		System.out.println(temp.data);
	}
	private static Node ancestor(Node root, Node p, Node q) {
		
		if(p.data<root.data && q.data<root.data) {
			return ancestor(root.left , p, q);
		}
		else if(p.data>root.data && q.data>root.data) {
			return ancestor(root.right , p, q);
		}
		else return root;
	}

}
