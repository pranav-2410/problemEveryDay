import java.util.Arrays;
import java.util.LinkedList;

/*LEETCODE:: 206
REVERSE LINKED LIST
 */
public class problem5 {

    public static void main(String[] args) {

        problem5 problem = new problem5();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(4, node3);
        System.out.println("BEFORE:: ");
        problem.printLinkedList(node4);
        ListNode ans = problem.reverseList(node4);
        System.out.println("AFTER:: ");
        problem.printLinkedList(ans);
    }
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode cur = head;

        ListNode next = null;
        while(cur!= null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public void printLinkedList (ListNode head){
        ListNode temp = head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}

