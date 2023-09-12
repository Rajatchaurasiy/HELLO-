class LLL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String d){
            this.data=d;
            this.next=null;
        }
    }
    public void addmid(int index,String data){
        Node newnode=new Node(data);
        if(head==null || index==0){
            head=newnode;
            return;
        }
        else{
            Node currnode=head;
            for(int i=1;i<6;i++){
                if(i==index){
                    Node nextnode=currnode.next;
                    currnode.next=newnode;
                    newnode.next=nextnode;
                    break;
                }



            }
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
    public static void main(String args)
    
}
