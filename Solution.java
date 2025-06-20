import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

// class ListNode {
//         int val;
//         ListNode next;

//         ListNode() {
//         }

//         ListNode(int val) {
//                 this.val = val;
//         }

//         ListNode(int val, ListNode next) {
//                 this.val = val;
//                 this.next = next;
//         }
// }

class Solution {
        public static String addBinary(String a, String b) {
                        StringBuilder sb = new StringBuilder();
                       int i = a.length() - 1;
                       int j = b.length() - 1;
                       int carry = 0;
                       
                       while(i>=0 || j >=0){
                                int sum = carry;
                                if(i >= 0) sum += a.charAt(i) - '0';
                                if(j >= 0) sum += b.charAt(j) - '0';
                                sb.append(sum % 2);
                                carry = sum / 2;

                                i--;
                                j--;
                       }

                       if(carry != 0) sb.append(carry);

                       return sb.reverse().toString();

        }

        // public static void printList(ListNode head) {

        // ListNode temp = head;

        // while (temp != null) {
        // System.out.print(temp.val);
        // if (temp.next != null) {
        // System.out.print("->");
        // }

        // temp = temp.next;

        // }

        // }

        public static void main(String[] args) {

                // ListNode n1 = new ListNode(1);
                // ListNode n2 = new ListNode(1);
                // ListNode n3 = new ListNode(1);
                // ListNode n4 = new ListNode(3);
                // ListNode n5 = new ListNode(3);
                // n1.next = n2;
                // n2.next = n3;
                // n3.next = n4;
                // n4.next = n5;

                // Solution solution = new Solution();
                // solution.deleteDuplicates()
                // printList(deleteDuplicates(n1));


                System.out.println(addBinary("11","1"));
                        // System.out.println(0 + '1');

        }
}