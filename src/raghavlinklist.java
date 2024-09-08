public class raghavlinklist {
   public static int count=0;
    public static void display(Node head){
       if (head==null){
//           System.out.println("Count="+count);
           return;}
        System.out.println(head.data+" ");
//        count++;
       display(head.next);
//        System.out.println(head.data+" ");
    }
    public static class Node{
     int data;
     Node next;
     Node(int data){
         this.data=data;
     }
    }
public static void insertatend(Node head,int data){
        Node demo=new Node(data);
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=demo;
}
    public static void main(String[] args) {
        Node x=new Node(1);
//        System.out.println(x.next);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
       x.next=a;
//        System.out.println(x.data);
//        System.out.println(x.next.data);
        a.next=b;
        b.next=c;
        c.next=d;
        insertatend(x,11);
        display(a);
//        Node temp=x;
//        for (int i=0;i<5;i++)
//        {
//            System.out.println(temp.data+" ");
//            temp=temp.next;
//        }
//          while (temp!=null)
//          {
//              System.out.println(temp.data+" ");
//              temp=temp.next;
//          }



    }
}
