package problems.algoexpert.hard;

import java.util.HashMap;

public class FindLoop {

    public static void main(String[] args) {
        System.out.println(solve("5A"));
    }

    public static boolean solve(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            char a = s.charAt(l);
            char b = s.charAt(r);
            while(s.charAt(l) < 'a' || s.charAt(l) > 'z') {
                l++;
            }
            while(s.charAt(r) < 'a' || s.charAt(r) > 'z') {
                r--;
            }
            if (s.charAt(r) != s.charAt(l)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
        }

    public static LinkedList findLoop(LinkedList head) {
        LinkedList slow = head;
        LinkedList fast = head;
        int cycleLength = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { //has cycle
                cycleLength = getLength(slow);
                break;
            }
        }
        if (cycleLength > 0) {
            return getCycleHead(cycleLength, head);
        }
        return head;
    }

    private static LinkedList getCycleHead(int length, LinkedList head) {
        LinkedList p1 = head;
        LinkedList p2 = head;
        for (int i = 0; i < length; i++) {
            p2 = p2.next;
        }
        while (p2 != p1) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    private static int getLength(LinkedList node) {
        int counter = 0;
        LinkedList p1 = node;
        LinkedList p2 = node;
        HashMap<Integer, Integer> map = new HashMap<>();
        do {
            counter++;
            p2 = p2.next;
        } while (p1 != p2);
        return counter;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

}
