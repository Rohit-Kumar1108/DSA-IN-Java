public class implementation{

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        
    }

    public static class linkedList {
        Node head=null;
        Node tail=null;
        void insertAtEnd(int data){                           // Insert data at the end 
            Node temp = new Node(data);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
        }

        void display(){                                      // Display Linked list
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
         int sizeOfLinkedList(){                             //Check size of linked list     
            int count=0;
            Node temp=head;
            while (temp!=null) {
                count++;
                temp=temp.next;
            }
            return count;
         }

         void insertAtBegning(int data){                      // Insert elements in the linked list at begning
            Node temp=new Node(data);
            if (head==null) {
               insertAtEnd(data);
            }else{
                temp.next=head;
            }
            head=temp;
         }

         int getAt(int val){                                //get elements 
            Node temp = head;
            for(int i=0; i<val; i++){
                temp=temp.next;
            }
          return temp.data;
         }
  
        void insertAtIdx(int idx, int data){                             // insert elements at the given index
            Node temp =  new Node(data);
            Node t=head;
            if (idx==0) {
                insertAtBegning(data);
            }
            else if(idx>sizeOfLinkedList()||idx<0){
                System.out.println("Wrong index ");
                return;
            }

            for(int i=1; i<idx-1; i++){
                t=t.next;
            }
            temp.next=t.next;
            t.next=temp;

        }

        void deleteAtIndex(int idx){                                 // delete node 
            Node temp = head;
            for(int i=0; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next=temp.next.next;
        }
        
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        ll.insertAtIdx(4, 20);
        ll.insertAtEnd(15);
        ll.insertAtBegning(1);
        ll.display();

        ll.deleteAtIndex(4);
        ll.display();

    }
}