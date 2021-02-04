public class Test{
//1. Add node first
    public void push(int new_data)
    {
        /* 1. allocate node
         * 2. put in the data */
        Node<T> new_Node = new Node(new_data);

        /* 3. Make next of new node as head and previous as NULL */
        new_Node.next = head;
        new_Node.previous = null;

        /* 4. change prev of head node to new node */
        if (head != null)
            head.previous = new_Node;

        /* 5. move the head to point to the new node */
        head = new_Node;
    }
    // 2. Add a node at the end of the list
    void append(int new_data)
    {
        /* 1. allocate node
         * 2. put in the data */
        Node new_node = new Node(new_data);

        Node last = head; /* used in step 5*/

        /* 3. This new node is going to be the last node, so
         * make next of it as NULL*/
        new_node.next = null;

        /* 4. If the Linked List is empty, then make the new
         * node as head */
        if (head == null) {
            new_node.previous = null;
            head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;

        /* 7. Make last node as previous of new node */
        new_node.previous = last;
    }
 //3.   /* Given a node as prev_node, insert a new node after the given node */
    public void InsertAfter(Node prev_Node, int new_data)
    {

        /*1. check if the given prev_node is NULL */
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        /* 2. allocate node
         * 3. put in the data */
        Node new_node = new Node(new_data);

        /* 4. Make next of new node as next of prev_node */
        new_node.next = prev_Node.next;

        /* 5. Make the next of prev_node as new_node */
        prev_Node.next = new_node;

        /* 6. Make prev_node as previous of new_node */
        new_node.previous = prev_Node;

        /* 7. Change previous of new_node's next node */
        if (new_node.next != null)
            new_node.next.previous = new_node;
    }
    //4. Remove first Node
    //Represent the head and tail of the doubly linked list
    Node tail = null;

    //addNode() will add a node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //If list is empty
        if(head == null) {
            //Both head and tail will point to newNode
            head = tail = newNode;
            //head's previous will point to null
            head.previous = null;
            //tail's next will point to null, as it is the last node of the list
            tail.next = null;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode's previous will point to tail
            newNode.previous = tail;
            //newNode will become new tail
            tail = newNode;
            //As it is last node, tail's next will point to null
            tail.next = null;
        }
    }

    //deleteFromStart() will delete a node from the beginning of the list
    public void deleteFromStart() {
        //Checks whether list is empty
        if(head == null) {
            return;
        }
        else {
            //Checks whether the list contains only one element
            if(head != tail) {
                //head will point to next node in the list
                head = head.next;
                //Previous node to current head will be made null
                head.previous = null;
            }
            //If the list contains only one element
            //then, it will remove node and now both head and tail will point to null
            else {
                head = tail = null;
            }
        }
    }


    //5. Remove Last Node
    void removeLastNode() {
        if(this.head != null) {

            //1. if head in not null and next of head
            //   is null, release the head
            if(this.head.next == null) {
                this.head = null;
            } else {

                //2. Else, traverse to the second last
                //   element of the list
                Node temp = new Node();
                temp = this.head;
                while(temp.next.next != null)
                    temp = temp.next;

                //3. Change the next of the second
                //   last node to null and delete the
                //   last node
                Node lastNode = temp.next;
                temp.next = null;
                lastNode = null;
            }
        }
    }

    //6. Remove node at an index
    // Function to delete a node
    // in a Doubly Linked List.
    // head_ref --> pointer to head node pointer.
    // delete --> pointer to node to be deleted.
    Node deleteNode(Node delete)
    {
        // base case
        if (head == null || delete == null)
            return null;

        // If node to be deleted is head node
        if (head == delete)
            head = delete.next;

        // Change next only if node to be
        // deleted is NOT the last node
        if (delete.next != null)
            delete.next.previous = delete.previous;

        // Change prev only if node to be
        // deleted is NOT the first node
        if (delete.previous != null)
            delete.previous.next = delete.next;

        delete = null;

        return head;
    }
    void deleteNodeAtGivenPos(int n)
    {
        Node head = null;
        /* if list in NULL or
          invalid position is given */
        if (head == null || n <= 0)
            return;

        Node current = head;
        int i;

        /*
        * traverse up to the node at
          position 'n' from the beginning
        */
        for (i = 1; current != null && i < n; i++)
        {
            current = current.next;
        }

        // if 'n' is greater than the number of nodes
        // in the doubly linked list
        if (current == null)
            return;

        // delete the node pointed to by 'current'
        deleteNode(current);
    }

    //7. find the node in O(1)
    // Function to find the position of
    // an integer in doubly linked list
    static int search(Node head_ref, int x)
    {

        // Stores head Node
        Node temp = head_ref;

        // Stores position of the integer
        // in the doubly linked list
        int pos = 0;

        // Traverse the doubly linked list
        while (temp.data != x
                && temp.next != null)
        {
            // Update pos
            pos++;

            // Update temp
            temp = temp.next;
        }

        // If the integer not present
        // in the doubly linked list
        if (temp.data != x)
            return -1;
        // If the integer present in
        // the doubly linked list
        return (pos + 1);
    }
}
