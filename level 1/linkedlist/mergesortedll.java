public class mergesortedll {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }
    }

    public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
        Node one = l1.head;
        Node two = l2.head;
        LinkedList ans = new LinkedList();
        while(one!=null && two!=null){
            if(one.data<two.data){
                ans.addLast(one.data);
                one= one.next;
            }
            else{
                ans.addLast(two.data);
                two=two.next;
            }
            while(one!=null){
                ans.addLast(one.data);
                one = one.next;
            }
            while(two!=null){
                ans.addLast(two.data);
                two = two.next;
            }
        } return ans;
    }
}
    

