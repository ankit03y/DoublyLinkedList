      /* Doubly Linked list Node*/
 class Node<T> {
        Node head; // head of list
        T data;
        Node<T> previous;
        Node<T> next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(T d) {
            data = d;
        }
    }