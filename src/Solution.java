import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        ArrayList<Integer> NewList = new ArrayList<Integer>();
        while (list1 != null)
        {
            NewList.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null)
        {
            NewList.add(list2.val);
            list2 = list2.next;
        }
        if (NewList.size() == 0)
        {
            return null;
        }
        Collections.sort(NewList);
        ListNode head = new ListNode(NewList.get(0));
        ListNode current = head;
        for (int i = 1; i < NewList.size(); i++)
        {
            current.next = new ListNode(NewList.get(i));
            current = current.next;
        }
        return head;
    }
}