package problems.binarysearch;

public class FirstBadVersion {

    static int badVersion;

    public static boolean isBadVersion(int n) {
        return n >= badVersion;
    }

    public static void main(String[] args) {
        badVersion = 4990000;
        System.out.println(firstBadVersion(5000000));
    }
// TODO revisitar
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            boolean checkLeft = isBadVersion(mid-1);
            boolean checkMid = isBadVersion(mid);
            boolean checkRight = isBadVersion(mid + 1);

            if (checkLeft != checkMid) {
                if (checkLeft) {
                    return mid - 1;
                } else {
                    return mid;
                }
            }
            if (checkMid != checkRight) {
                if (checkRight) {
                    return mid + 1;
                } else {
                    return mid;
                }
            }

            if (checkMid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 1;
    }

}
