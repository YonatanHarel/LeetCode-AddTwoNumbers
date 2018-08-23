
public class Main {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0); //head
        ListNode current = result;
        int div = 0;
        while (null != l1 || null != l2) {
            int x = null != l1 ? l1.val : 0;
            int y = null != l2 ? l2.val : 0;
            int sum = x + y + div;
            div = sum / 10; //can be only 1
            current.next = new ListNode(sum % 10);
            if (null != l1)  {
                l1 = l1.next;
            }
            if (null != l2) {
                l2 = l2.next;
            }
            current = current.next;
        }
        return result.next;
    }

    public static String printList(ListNode list) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        ListNode current = list;
        while (null != current) {
            sb.append(current.val);
            if (null == current.next) {
                sb.append("]").toString();
                break;
            }
            sb.append(',').append(' ');
            current = current.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // l1 = [2,4,3]
        // l2 = [5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        System.out.println(printList(result));
    }
}