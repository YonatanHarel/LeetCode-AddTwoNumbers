import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    public ListNode buildList(int[] elements) {
        ListNode list = new ListNode(0);
        ListNode tmp = list;
        for (int i = 0; i < elements.length; i++) {
            tmp.next = new ListNode(elements[i]);
            tmp = tmp.next;
        }
        return list.next;
    }

    @Test
    public void addTwoNumbersBasicTest() throws Exception {
        ListNode l1 = buildList(new int[] {1,3,4});
        ListNode l2 = buildList(new int[] {3,5,1});

        ListNode result = Main.addTwoNumbers(l1, l2);

        assertEquals("[4, 8, 5]", Main.printList(result));
    }

    @Test
    public void addTwoNumbersShortListTest() throws Exception {
        ListNode l1 = buildList(new int[] {1,3});
        ListNode l2 = buildList(new int[] {3,5,1});

        ListNode result = Main.addTwoNumbers(l1, l2);

        assertEquals("[4, 8, 1]", Main.printList(result));
    }

    @Test
    public void addTwoNumbersWithCurryTest() throws Exception {
        ListNode l1 = buildList(new int[] {1,3,9});
        ListNode l2 = buildList(new int[] {3,5,1});

        ListNode result = Main.addTwoNumbers(l1, l2);

        assertEquals("[4, 8, 0, 1]", Main.printList(result));
    }

    @Test
    public void addTwoNumbersWithEmptyListTest() throws Exception {
        ListNode l1 = buildList(new int[] {});
        ListNode l2 = buildList(new int[] {3,5,1});

        ListNode result = Main.addTwoNumbers(l1, l2);

        assertEquals("[3, 5, 1]", Main.printList(result));
    }
}