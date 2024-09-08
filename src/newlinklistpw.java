public class newlinklistpw {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
public static class linklist{
    Node head = null;
    Node tail = null;
    int size=0;
    void insertAtFirst(int data)
    {
        Node temp=new Node(data);
        if (head==null)
        {
            head=temp=tail;
        }
        temp.next=head;
        head=temp;
        size++;
    }
    void insertAt(int idx, int data)
    {
        Node t=new Node(data);
        Node temp=head;
        if (idx==size){
            inserAtEnd(data);
            return;
        }
        else if(idx==0){
            insertAtFirst(data);
            return;
        } else if (idx>size||idx<0) {
            System.out.println("Wrong index");
            return;
        }
        for (int i=0;i<idx-1;i++)
        {
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
        size++;
    }
    void inserAtEnd(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
        size++;
    }
    int get(int idx)
    {
        Node temp=head;
        for (int i=0;i<idx;i++)
        {
            temp=temp.next;
        }
        return temp.data;
    }
    void deletAt(int idx){
        if (idx==0)
        {
            head=head.next;
            size--;
            return;
        }
        Node temp=head;
        for (int i=0;i<idx-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;
        size--;
    }
    void deletFirst(){
        if (head==null)
        {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    
    void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
//    int size(){
//        Node temp=head;
//        int count=0;
//        while (temp!=null)
//        {
//            count++;
//            temp=temp.next;
//        }
//        return count;
//    }
}
    public static void main(String[] args) {
     linklist ll=new linklist();
     ll.inserAtEnd(6);
     ll.inserAtEnd(5);
     ll.insertAtFirst(7);
     ll.insertAtFirst(1);
     ll.insertAt(2,9);
     ll.display();
        System.out.println();
     ll.insertAt(3,10);
        ll.display();
        System.out.println();
        System.out.println(ll.get(3));
        System.out.println(ll.size);
        ll.deletFirst();
        ll.display();
    }
}