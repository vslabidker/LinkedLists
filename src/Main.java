import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;

        ListNode s1 = new ListNode(1);
        ListNode s2 = new ListNode(3);
        ListNode s3 = new ListNode(4);
        s1.next = s2;
        s2.next = s3;

        ArrayList<String> example1 = new ArrayList<>();
        ListNode listSolution1 = Solution.mergeTwoLists(l1, s1);
        while (listSolution1 != null) {
            example1.add(listSolution1.toString());
            listSolution1 = listSolution1.next;
        }
        System.out.println(example1);

        ListNode b1 = null;
        ListNode d1 = null;

        ListNode listSolution2 = Solution.mergeTwoLists(b1, d1);
        ArrayList<String> example2 = new ArrayList<>();
        while (listSolution2 != null) {
            example2.add(listSolution2.toString());
            listSolution2 = listSolution2.next;
        }
        System.out.println(example2);

        ListNode c1 = null;
        ListNode g1 = new ListNode(0);


        ListNode listSolution3 = Solution.mergeTwoLists(c1, g1);
        ArrayList<String> example3 = new ArrayList<>();
        while (listSolution3 != null) {
            example3.add(listSolution3.toString());
            listSolution3 = listSolution3.next;
        }
        System.out.println(example3);
    }
}
