
//This Java program to check if doubly linked list is palindrome or not

public class Main {

    // Driver program
    public static void main(String[] args)
    {
        Node head = null;
        head = push(head, 'l');
        head = push(head, 'e');
        head = push(head, 'v');
        head = push(head, 'e');
        head = push(head, 'l');

        if (isPalindrome(head))
            System.out.printf("It is Palindrome");
        else
            System.out.printf("Not Palindrome");
    }
}

