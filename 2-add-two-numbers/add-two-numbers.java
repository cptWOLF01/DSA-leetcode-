class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node to help build the result list
        ListNode dummy = new ListNode(0);

        // Pointer to build the list
        ListNode current = dummy;

        // Carry for addition
        int carry = 0;

        // Loop while nodes exist or carry remains
        while (l1 != null || l2 != null || carry != 0) {

            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int total = val1 + val2 + carry;

            int digit = total % 10;
            carry = total / 10;

            current.next = new ListNode(digit);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}