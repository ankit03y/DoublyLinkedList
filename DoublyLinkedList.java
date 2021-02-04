public class DoublyLinkedoublyLinked extends Test{
    public static void  main(String args[]) {
        /* Start with the empty list */
        Test doublyLinkedoublyLinked = new Test();
 
        // Insert 6. So linked list becomes 6->NULL
        doublyLinkedoublyLinked.append(6);
 
        // Insert 7 at the beginning. So linked list becomes 7->6->NULL
        doublyLinkedoublyLinked.push(7);
 
        // Insert 1 at the beginning. So 
        // linked list becomes 1->7->6->NULL
        doublyLinkedoublyLinked.push(1);
 
        // Insert 4 at the end. So linked 
        // list becomes 1->7->6->4->NULL
        doublyLinkedoublyLinked.append(4);
 
        // Insert 8, after 7. So linked 
        // list becomes 1->7->8->6->4->NULL
        doublyLinkedoublyLinked.InsertAfter(doublyLinkedoublyLinked.head.next, 8);
 
        System.out.println("Created doubly linked list is: ");
        doublyLinkedoublyLinked.printlist(doublyLinkedoublyLinked.head);

        Test doublyLinkedoublyLinked = new Test();  
        //Add nodes to the list  
        doublyLinked.addNode(1);  
        doublyLinked.addNode(2);  
        doublyLinked.addNode(3);  
  
        //Printing original list  
        System.out.println("Original List: ");  
        doublyLinked.display();  
        while(doublyLinked.head != null) {  
            doublyLinked.deleteFromStart();  
            //Printing updated list  
            System.out.println("Updated List: ");  
            doublyLinked.display();  
        }  
    }

    Test newList = new Test();

    //Add four elements in the list.
    newList.removeLastNode(10);
    newList.removeLastNode(20);
    newList.removeLastNode(30);
    newList.removeLastNode(40);
    newList.PrintList(); 

    //Delete the last node
    newList.removeLastNode();
    newList.PrintList();
    }
}