class LL{
    Node head;
    //creation of node//
class Node{
    String data;
    Node next; 

//constructor for adding data//
Node(String d){
    this.data=d;
    this.next=null;

}}

public void addfirst(String data){
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
        return;
    }
    else{
        newnode.next=head;
        head=newnode;

    }

}
public void print(){
   
     
    if(head==null){
        System.out.println("list is null");

    }
   
    else{
         Node currentnode=head;
        while(currentnode!=null){
            System.out.print(currentnode.data + "-->");
            currentnode=currentnode.next;
        }
        

    }
}



public static void main(String args[]){
    
   LL list=new LL();
    list.addfirst("hello");
     list.addfirst("jj");
    list.print();
   

}
}

