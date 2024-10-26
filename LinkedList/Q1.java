package LinkedList;

public class Q1 {
       
         static  ListNode head;
         static ListNode tail;
           public static void main(String[] args) {
               
                    // System.out.println("code run well");
                    addData(40);  
                    addData(12);
                    addData(32);
                    addData(23);

                    int x = 12;

                    if(checkElement(x)) System.out.println("Yes");

                    else System.out.println("No");
        
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

         static  boolean checkElement(int x) {
                      
                     
                    ListNode temp = head;
                    while(temp != null) {
                         if(temp.data == x) {
                                return true;
                         }       
                         temp = temp.next;
                    }

                    return false;

          }
}
