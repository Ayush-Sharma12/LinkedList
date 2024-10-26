package LinkedList;

public class Q3 {
      
         static ListNode head;
         static ListNode tail;  
         
         public static void main(String[] args) {
                 addData(1);
                 addData(1);
                 addData(2);
                 addData(2);
                 addData(2);
                 addData(3);

                 removeDuplicates();
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
                   



          }

          static void removeDuplicates(){
                      
                      if(head == null) return;


                      ListNode temp = head;


                      while(temp.next != null) {
                                 
                               if(temp.next.data == temp.data) {
                                         temp.next = temp.next.next;
                               }

                              else  temp = temp.next;
                      }
          }

          static void display(){
                    ListNode temp = head;

                    while(temp != null) {
                              System.out.println(temp.data + " ");
                              temp = temp.next;
                    }
        }
}
