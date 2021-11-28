package geekster;

public class Implement_BST {
	public static void main(String[] args) {
		BST obj1 = new BST();
		obj1.insert(5);
		obj1.insert(8);
		obj1.insert(4);
		
		obj1.printeInOrder();
		
		BST obj2 = new BST();
		obj2.insert(62);
		obj2.insert(264);
		obj2.insert(2);
		
		obj2.printeInOrder();
		
		BST obj3 = new BST();
		obj3.insert(10);
		obj3.insert(8);
		obj3.insert(6);
		obj3.insert(9);
		obj3.insert(13);
		obj3.insert(12);
		obj3.insert(15);
		
		obj3.printeInOrder();
		
		obj3.delete(13);
		System.out.println();
		
		obj3.printeInOrder();
		
		System.out.println();
		System.out.println(obj3.searchElement(100));
	}

}
