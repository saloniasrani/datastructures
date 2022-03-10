import java.util.Scanner;

public class LL {
    public static node<Integer> takeInput() {
        node<Integer> head=null , tail=null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while(data!=-1){
        node<Integer> newNode=new node<Integer>(data);
        if(head==null) {
            head=newNode;
            tail=newNode;

        }
        else{

            // node<Integer> temp=head;
            // while(temp.next!=null){
            //     temp=temp.next;

            // }
            // temp.next=newNode;
            
            tail.next=newNode;
            tail=tail.next;
            
        
        }
        data=sc.nextInt();

        // sc.close();

    }
    sc.close();
    return head; 
    
    
}
public static void print(node<Integer> head) {
    while(head!=null){
        System.out.print(head.data+ " ");
        head=head.next;
    }
    System.out.println();
    
}
public static void printmid(node<Integer> head) {
    
    node<Integer> slow=head;
    node<Integer> fast=head.next;
    while(fast!=null && fast.next!=null){
        
        fast=fast.next.next;
        slow=slow.next;
    }
    System.out.println(slow.data);
    
}

public static void main(String[] args) {

    node<Integer> head=takeInput();
    print(head);
    printmid(head);
}


}
