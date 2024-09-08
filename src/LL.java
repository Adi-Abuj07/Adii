public class LL {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data) {
         this.data=data;
         this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
         Node currnode=head;
        while (currnode.next !=null){
            currnode=currnode.next;
        }
        currnode.next=newNode;
    }
    public void printList(){
        if (head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currnode=head;
        while (currnode !=null){
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }
        System.out.println("NULL");
    }
    public void deletefirst(){
        if (head==null)
        {
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    public void deletelast(){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        if (head.next==null)
        {
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }
    public void reverseIterate(){
        if (head==null||head.next==null)
        {
         return;
        }
        Node prev=head;
        Node curr=head.next;
        while (curr!=null)
        {
            Node nextnode=curr.next;
            curr.next=prev;
            prev=curr.next;
            curr=nextnode;
        }
        head.next=null;
        head=prev;
    }
public Node revrecursive (Node head)
{
    if (head==null||head.next==null)
    {
        return head;
    }
    Node newHead=revrecursive(head.next);
    head.next.next=head;
    head.next=null;
    return  newHead;
}


    public static void main(String[] args) {
      LL list=new LL();
      list.addFirst("a");
      list.addFirst("is");
      list.addLast("List");
      list.deletefirst();
      list.deletelast();
      list.printList();

    }
}

