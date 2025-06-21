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
        public static int mySqrt(int x) {
                if (x < 2)
                        return x;
                int l = 0;
                int r = x;
                 
                while (l <= r) {
                        int mid = l + (r - l) / 2;
                        long squart = (long) mid * mid;                 
                        if (squart == x) {
                                return mid;
                        }

                        if (squart > x) {
                                r = mid - 1;
                        } else {
                                l = mid + 1;
                        }
                }
                return r;

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

                System.out.println(mySqrt(8));

        }
}