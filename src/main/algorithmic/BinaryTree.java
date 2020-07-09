package main.algorithmic;
/*
Size() function recursively calculates the size of a tree. It works as follows:

        Size of a tree = Size of left subtree + 1 + Size of right subtree.

*/

public class BinaryTree {

  Node root;


  private int size(Node node) {
    if(node == null)
      return 0;
    else
      return (size(node.left) + 1 + size(node.right));
  }


  public static void main(String[] args) {

    BinaryTree bt = new BinaryTree();

    Node root = new Node(1);
    bt.root = new Node(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);


    System.out.println("\n Postorder traversal of binary tree is ");     // postorder prints left - right - root
    bt.printPostorder();

System.out.println("Size of tree is " + bt.size(bt.root));

}

   void printPostorder() {
    printPostorder(root);
  }

  void printPostorder(Node node) {

    if(node == null)
      return;

    printPostorder(node.left);

    printPostorder(node.right);

    System.out.println(node.data);

  }


}


class Node {
  int data;
  Node left,right;

  public Node(int data) {
    this.data = data;
    left = right = null;
  }

}

