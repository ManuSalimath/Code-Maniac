public class Sum {
    int val;
    Sum next;
    sum(int x) { val = x; }
}

public Sum addTwoNumbers(Sum l1, Sum l2) {
    Sum dummy = new Sum(0);
    Sum curr = dummy;
    int carry = 0;
    while (l1 != null || l2 != null) {
        int x = (l1 != null) ? l1.val : 0;
        int y = (l2 != null) ? l2.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new Sum(sum % 10);
        curr = curr.next;
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
    }
    if (carry > 0) {
        curr.next = new Sum(carry);
    }
    return dummy.next;
}