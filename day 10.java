

//User function Template for Java



 class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}

//This function should return head to the DLL

class Solution
{
    Node head = null; // Head of the DLL
    Node prev = null; // Previous node in DLL
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here
	if (root == null) return null;

        // Recursively convert the left subtree
        bToDLL(root.left);

        // Now convert this node
        if (prev == null) {
            // If this is the first node, set it as head of the DLL
            head = root;
        } else {
            // Adjust the pointers
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        // Finally, recursively convert the right subtree
        bToDLL(root.right);

        return head;
    }
    
    
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        Node head = sol.bToDLL(root);
        printList(head);
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }
}
