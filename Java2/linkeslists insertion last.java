class L {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String d){
            this.data=d;
            this.next=null;
        }
    }
    public void addlast(String data){
        Node newnode=new Node(data);
                if(head==null){
                    head=newnode;
                    return;
                 }
                 else{
                   Node currentnode=head;
                   while(currentnode.next!=null){
                    currentnode=currentnode.next;
                   }
                   currentnode.next=newnode;

                 }

    }
    public void printlist(){
       
        if(head==null){
            System.out.println("null");
            
        }
        else{
            Node currentnode=head;
            while(currentnode!=null){
                System.out.print(currentnode.data+ "--> ");
                currentnode=currentnode.next;                           

            }
            System.out.println("null");
        }
    }
    public static void main(String args[]){
        L list=new L();
        list.addlast("hello");
           list.addlast("hell");
              list.addlast("hel");
              list.printlist();

    }
    
}
