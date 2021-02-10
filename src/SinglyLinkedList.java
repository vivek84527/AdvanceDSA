import java.util.LinkedList;

public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void Display(){
        ListNode current =head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;

        }
        System.out.println("null");
    }
    public int Length(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current =head;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;

    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        if (head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;

        }
        current.next=newNode;
    }
    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third =new ListNode(8);
        ListNode fourth =new ListNode(11);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        sll.insertFirst(5);
        sll.insertLast(25);
        sll.deleteFirst();
        sll.Display();
        System.out.println(sll.Length());


    }
}
