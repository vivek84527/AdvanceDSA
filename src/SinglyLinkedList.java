import javafx.scene.control.skin.SliderSkin;

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
    public  ListNode deleteLast(){
        if(head==null||head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;

        }
        previous.next=null;
        return current;
    }

    public void insertPosition(int position,int value){
        ListNode node=new ListNode(value);
        if(position==1){
            node.next=head;head=node;
        }
        else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=node;
            node.next=current;

        }

    }
    public void deletePostion(int postion){
        if(postion==1){
            head=head.next;
        }
        else {
            ListNode previous=head;
            int count=1;
            while (count<postion-1){
                previous=previous.next;
                count++;
            }
            ListNode current =previous.next;
            previous.next=current.next;
        }
    }
    public boolean find(int searchKey){
        if(head==null){
            return false;
        }
        ListNode current=head;
        while(current!=null){
            if(current.data==searchKey){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public ListNode reverse(){
        ListNode current=head;
        ListNode previous=null;
        ListNode next= null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;


        }
        return previous;
    }
    public ListNode getMiddleNode(){
        if(head==null){
            return null;
        }
        ListNode slowPtr=head;
        ListNode fastptr=head;
        while(fastptr!=null&&fastptr.next!=null){
            slowPtr=slowPtr.next;
            fastptr=fastptr.next.next;
        }
        return slowPtr;
    }
    public void removeDublicate(){
        if(head==null){
            return ;
        }
        ListNode current=head;
        while(current!=null&&current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
    }
    public void DeleteNode(int key){
        ListNode current=head;
        ListNode temp=null;
        if(current!=null &&current.data!=key){
            head=current.next;
            return;

        }
        while(current!=null && current.data!=key){
            temp=current;
            current=current.next;


        }
        if(current==null){
            return;
        }
        temp.next=current.next;

    }
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third =new ListNode(1);
        ListNode fourth =new ListNode(11);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        sll.insertFirst(5);
        sll.insertLast(25);
//        sll.deleteFirst();
//        sll.Display();
//        sll.deleteLast();
        sll.Display();
        sll.removeDublicate();
        sll.Display();
        sll.insertPosition(3,20);
        sll.DeleteNode(11);
        sll.Display();
//        System.out.println(sll.Length());
//        boolean f=sll.find(11);
//        if(f){
//            System.out.println("Search key find!!!");
//        }
//        else{
//            System.out.println("Search key Not Find!!!");
//        }
//        System.out.println(sll.reverse().data);
//        System.out.println(sll.getMiddleNode().data);



    }

}
