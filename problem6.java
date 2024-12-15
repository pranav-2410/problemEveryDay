/*LEETCODE::876
MIDDLE OF THE LINKED LIST
 */
/*LEETCODE::876
MIDDLE OF THE LINKED LIST
 */
public class problem6 {
    public static void main(String[] args) {
        problem6 problem = new problem6();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(4, node3);
        System.out.println("ENTIRE LIST:: ");
        problem.printLinkedList(node4);
        ListNode ans = problem.middleNode(node4);
        System.out.println("FROM MIDDLE:: ");
        problem.printLinkedList(ans);
    }
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode two = temp;
        while(two!=null && two.next!=null){
            temp = temp.next;
            two = two.next.next;
        }
        return temp;
    }
    public void printLinkedList (ListNode head){
        ListNode temp = head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
