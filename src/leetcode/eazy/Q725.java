package leetcode.eazy;

/**
 * Created by user on 2017/12/26.
 */
public class Q725 {
    public class ListNode {
          int val;
          ListNode next;
         ListNode(int x) { val = x; }
    }
    public ListNode[] splitListToParts(ListNode root, int k) {
        int len = 0;
        for(ListNode node = root;node != null; node = node.next)
            len++;
        ListNode[] parts = new ListNode[k];
        int n = len / k, r = len % k;
        ListNode node = root, prev = null;
        for (int i = 0; node != null && i < k; i++, r--) {
            parts[i] = node;
            for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) {
                prev = node;
                node = node.next;
            }
            prev.next = null;
        }
        return parts;
    }
}
