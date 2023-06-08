package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class CommonElementsLinkedList {
    public static List<Integer> findCommonElements(ListNode head1, ListNode head2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> commonElements = new ArrayList<>();

        ListNode curr = head1;
        while (curr != null) {
            set.add(curr.val);
            curr = curr.next;
        }

        curr = head2;
        while (curr != null) {
            if (set.contains(curr.val)) {
                commonElements.add(curr.val);
            }
            curr = curr.next;
        }

        return commonElements;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(7);
        head1.next.next.next.next = new ListNode(8);
        head1.next.next.next.next.next = new ListNode(9);

        ListNode head2 = new ListNode(11);
        head2.next = new ListNode(12);
        head2.next.next = new ListNode(13);
        head2.next.next.next = new ListNode(6);
        head2.next.next.next.next = new ListNode(7);
        head2.next.next.next.next.next = new ListNode(8);
        head2.next.next.next.next.next.next = new ListNode(9);

        List<Integer> commonElements = findCommonElements(head1, head2);
        System.out.println("Common Elements: " + commonElements);
    }
}
