package leetcode.swordToOffer;

public class problem24 {

    /**
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
     *
     *  
     *
     * 示例:
     *
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     * */
    public ListNode reverseList(ListNode head) {
        ListNode temp;
        ListNode last = null;
        while (head != null) {
            temp = head.next;
            head.next = last;
            last = head;
            head = temp;
        }
        return last;
    }
}
