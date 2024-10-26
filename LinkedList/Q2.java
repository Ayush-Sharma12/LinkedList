package LinkedList;

public class Q2 {
          
       static ListNode head;
       static ListNode pointer;
       static ListNode tail;
       public static void main(String[] args) {
           
           addData(1);
           addData(2);
            addData(4);
           addData(5);
           addData(6);

           insert(pointer, 3);
           display();

              
       }
          static  void addData(int data) {
                   
                    if(head == null) {
                       ListNode newNode = new ListNode(data);
                       head = newNode;
                       tail = head;
                       return;
                   }     
                    
                   ListNode temp = new ListNode(data);
                   tail.next = temp;
                   tail = temp;

                   if(data == 2) pointer = temp;



          }

          static void insert(ListNode prev, int data){
                        if(prev == null) return;

                        ListNode temp = prev.next;
                        ListNode newNode = new ListNode(data);
                        prev.next = newNode;
                        newNode.next = temp;
          }
          static void display(){
                      ListNode temp = head;

                      while(temp != null) {
                                System.out.println(temp.data + " ");
                                temp = temp.next;
                      }
          }
}

