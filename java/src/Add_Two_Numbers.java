public class Add_Two_Numbers {

    public static void main(String[] args) {

        int[] a1 = {2,4,9};
        int[] a2 = {5,6,4,9};

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        ListNode c = l1;

        for (int i = 0; i < a1.length; i++) {
            c.val = a1[i];
            if (i < a1.length - 1) c.next = new ListNode();
            c = c.next;
        }

        c = l2;

        for (int i = 0; i < a2.length; i++) {
            c.val = a2[i];
            if (i < a2.length - 1) c.next = new ListNode();
            c = c.next;
        }

        ListNode l3 = addTwoNumbers(l1, l2);
        c = l3;

        while (c != null) {
            System.out.println(c.val);
            c = c.next;
        }

    }

    public static ListNode updateCurrentNode(ListNode current, int val) {
        current.val = val;
        current.next = new ListNode(-1);
        current = current.next;
        return current;

    }

    static int updateCarry(int val){
        int carry = 0;
        if(val >= 10){
            carry = val/10;
        }
        return carry;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode prev = l3;
        ListNode current = l3;
        int carry = 0;
        while ((l1 != null) && (l2 != null)) {
            int val = l1.val + l2.val + carry;
            carry = updateCarry(val);
            val = carry> 0 ? val%10 : val;
            prev = current;
            current = updateCurrentNode(current, val);
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int val = l1.val + carry;
            carry = updateCarry(val);
            val = carry> 0 ? val%10 : val;
            prev = current;
            current = updateCurrentNode(current, val);
            l1 = l1.next;
        }

        while (l2 != null) {
            int val = l2.val + carry;
            carry = updateCarry(val);
            val = carry> 0 ? val%10 : val;
            prev = current;
            current = updateCurrentNode(current, val);
            l2 = l2.next;
        }
        current.val = carry > 0 ? carry : current.val;
        if(current.val == -1) prev.next = null;
        return l3;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}




