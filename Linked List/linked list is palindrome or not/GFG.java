
class  GFG{

    // Structure of node
    static class Node {
        char data;
        Node next;
        Node prev;
    };


    /* Given a reference (pointer to pointer) to the head of a list and an int, inserts  new node on the front of the list. */

    static Node push(Node head_ref, char new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        new_node.prev = null;
        if (head_ref != null)
            head_ref.prev = new_node;
        head_ref = new_node;
        return head_ref;
    }

    // Function to check if list is palindrome or not
    static boolean isPalindrome(Node left) {
        if (left == null)
            return true;

        // Find rightmost node
        Node right = left;
        while (right.next != null)
            right = right.next;

        while (left != right) {
            if (left.data != right.data)
                return false;

            left = left.next;
            right = right.prev;
        }

        return true;
    }
}
