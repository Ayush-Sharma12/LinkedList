package LinkedList;



public class Q5 {
          static ListNode head;
          static ListNode tail; 

          static ListNode head1;
          static ListNode tail1;


          public static void main(String[] args) {
                      
                    addData1(1);
                    addData1(2);
                    addData1(3);
                    addData1(4);
                    
                    addData2(3);
                    addData2(2);
                    addData2(1);
                    addData2(3);
                    


                    displayResult(getSum(head, head));

          }

          static  void addData1(int data) {
                   
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

          static  void addData2(int data) {
                   
                    if(head1 == null) {
                       ListNode newNode = new ListNode(data);
                       head1 = newNode;
                       tail1 = head1;
                       return;
                   }     
                    
                   ListNode temp = new ListNode(data);
                   tail1.next = temp;
                   tail1 = temp;
                   



          }

          static ListNode getSum(ListNode h1, ListNode h2) {
                     

                  int v1 = 0;
                  ListNode p1 = h1;
                  while(p1 != null) {
                      v1 = (v1 * 10) + p1.data;
                      p1 = p1.next;
                  }


                  int v2 = 0;
                  ListNode p2 = h2;
                  while(p2 != null) {
                      v2 = (v2 * 10) + p2.data;
                      p2 = p2.next;
                  }

                int sum = v1 + v2;

                StringBuilder sb = new StringBuilder();

                while(sum > 0) {
                     
                      sb.append(sum%10);
                      sum /= 10;
                }

               String str  = sb.reverse().toString();

                ListNode newNode = null;
                ListNode tail = null;
                for(int i=0; i<str.length(); i++) {
                           
                    if(newNode == null) {
                              newNode  = new ListNode(str.charAt(i) - '0');
                              tail = newNode;  
                    }
                    else{
                                ListNode temp = new ListNode(str.charAt(i) - '0');
                                tail.next = temp;
                                tail = temp;
                    }
                       
                }





                    return newNode;
                      
          }

          static void displayResult(ListNode pointer) {
                     

                      while(pointer != null){
                                System.out.print(pointer.data + " ");
                                pointer = pointer.next;
                      }
          }
}
