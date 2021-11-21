package problems.algoexpert.easy;

public class RemoveDuplicatesFromLinkedList {

    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        if (linkedList == null) {
            return null;
        }
        LinkedList head = linkedList;
        LinkedList tmp;
        LinkedList duplicated = null;
        boolean endList = false;
        boolean isDuplicated = false;
        while (!endList) {
            if (head.next != null) {
                tmp = head;
                if (tmp.value != tmp.next.value) {
                    if (isDuplicated) {
                        duplicated.next = tmp.next;
                        isDuplicated = false;
                    }
                } else {
                    if (!isDuplicated) {
                        duplicated = tmp;
                        isDuplicated = true;
                    }
                }
            } else {
                if (isDuplicated)
                    duplicated.next = null;
                endList = true;
            }
            head = head.next;
        }
        return linkedList;
    }

}
