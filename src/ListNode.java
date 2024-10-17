public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(final int val) {
        this.val = val;
    }

    ListNode(final int val, final ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return Integer.toString(this.val);
    }
}
