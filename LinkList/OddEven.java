class OddEven {

    // Definition for singly-linked list.

    public static class ListNode {
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

    public static ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(0);
        ListNode tempO = odd;
        ListNode tempE = even;
        int count = 1;
        while (temp != null) {
            ListNode tmp = new ListNode(temp.val);
            if (count % 2 != 0) {
                tempO.next = tmp;
                tempO = tempO.next;
                temp = temp.next;
            } 
            else {
                tempE.next = tmp;
                tempE = tempE.next;
                temp = temp.next;
            }
            count = count+1;
        }
        even = even.next;
        tempO.next = even;
        return odd.next;
    }

    static void display(ListNode hd){
        System.out.println("The list is : ");
        ListNode temp = hd;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode a = new ListNode(8);
        ListNode b = new ListNode(9);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(12);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        display(head);
        ListNode res = oddEvenList(head);
        display(res);
    }
}