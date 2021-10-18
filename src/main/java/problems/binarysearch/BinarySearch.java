package problems.binarysearch;

//The cost of this algorithm is O = log N worst case.
public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println("Solution: " + search(nums, target));
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, target);
    }
    //We could do it recursive very easily adding left and right params
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            // Tenemos que hacer esta operacion para encontrar el mid. (right - left) / 2 seria la el valor en medio
            // del array ya separado por la izquierda o derecha. Hay que sumarle left + para obtener el indice real.
            int mid = left + ((right - left) / 2);
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
