import java.util.ArrayList;
import java.util.Collections;


class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class _2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return arrToNode(addLists(listNodeToArrayList(l1), listNodeToArrayList(l2)));
    }
    
    private ListNode arrToNode(ArrayList<Integer> al) {
        ListNode out = null;
        Collections.reverse(al);
        for (int i = 0; i<al.size(); i++) {
            out = new ListNode(al.get(i), out);
        }
        return out;
    }
    
    private ArrayList<Integer> listNodeToArrayList(ListNode l) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        while (l != null) {
            out.add(l.val);
            l = l.next;
        }
        return out;
    }
        
    private ArrayList<Integer> addLists(ArrayList<Integer> al1, ArrayList<Integer> al2) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int isDecimal = 0;
        int addVal = 0;

        for (int i = 0; i<al1.size() || i <al2.size() || isDecimal > 0; i++) {
            addVal = tryGet(al1, i) + tryGet(al2, i) + isDecimal;
            isDecimal = 0;
            if (addVal > 9) {
                addVal -= 10;
                isDecimal = 1;
            }
            al.add(addVal);
        }
        return al;
    }
    
    private int tryGet(ArrayList<Integer> al, int index) {
        int v = 0;
        try {
            v = al.get(index);
        } catch (IndexOutOfBoundsException e) {
            v = 0;
        }
        return v;
    }
}

