package LinkedList;

public class Q4 {
           
              static ListNode head;
              static ListNode tail;
              public static void main(String[] args) {
                      
                 addData(1);                     
                 addData(2);                     
                 addData(2);                     
                 addData(1);
                 addData(2);                     
                 addData(1);                     

 
                 if(isPalindrome()) System.out.println("palindrome List");
                 else System.out.println("Not a Palindrome"); 

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

          static boolean isPalindrome() {
                     
                       if(head == null) return false;


                       ListNode fast = head;
                       ListNode slow = head;

                       while(fast != null && fast.next!= null) {
                                 slow = slow.next;
                                 fast = fast.next.next;
                       }

                      // reversing second half linkedList
                      
                      ListNode revList = getReverse(slow); 

                      // comparing with first and second half portion
                      
                      ListNode firstPart = head;
                      while(firstPart != null && revList != null) {
                                  
                              if(firstPart.data != revList.data) {
                                          return false;
                              }
                              firstPart = firstPart.next;
                              revList = revList.next;
                                 
                      }

                      return true;

          }  


         static ListNode getReverse(ListNode pointer){ 
                      
                       ListNode next = null;
                       ListNode prev = null;
                       ListNode curr = pointer;
                       while(curr != null) {
                                next = curr.next;
                                curr.next = prev;
                                prev = curr;
                                curr = next;
                                  
                       }


                       return prev;
          }
} 
