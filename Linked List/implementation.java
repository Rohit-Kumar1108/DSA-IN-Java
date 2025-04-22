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
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
        }

        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
         int sizeOfLinkedList(){
            int count=0;
            Node temp=head;
            while (temp!=null) {
                count++;
                temp=temp.next;
            }
            return count;
         }

         void insertAtBegning(int data){
            Node temp=new Node(data);
            if (head==null) {
               insertAtEnd(data);
            }else{
                temp.next=head;
            }
            head=temp;
         }

         int getAt(int val){
            Node temp = head;
            for(int i=0; i<val; i++){
                temp=temp.next;
            }
          return temp.data;
         }

        void insertAtIdx(int idx, int data){
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

        void deleteAtIndex(int idx){
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