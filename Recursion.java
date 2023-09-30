package Sorting;

public class Recursion {
    public static void main(String[] args) {

        // System.out.println(add(2,3));

        // System.out.println();

        // Recursion obj = new Recursion();

        // int ans = obj.sub(4, 2);
        // System.out.println(ans);

        // recursion
        // printnum(1);
        // nums(10);

        // int arr[] = {1,2,3,4,5,6,7,8,44,66};
        // System.out.println(binarySearch(arr, 9));

        System.out.println("ans "+sqrt(100006));
    }

    // addition static function
    public static int add(int a, int b) {
        return a + b;
    }

    // subraction non static function needs obj cration
    public int sub(int a, int b) {
        return a - b;
    }

    // recursion
    public static void printnum(int x) {
        if (x > 10) {
            return;
        }
        x += 1;
        printnum(x);
        System.out.println(x);

    }

    public static void nums(int x) {
        if (x > 0) {

            return;
        }
        x -= 1;

        nums(x);
        System.out.println(x);

    }

    // binary search
    public static int binarySearch(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int k = arr[mid];

            if (k == target) {
                return k;
            }
            if (k < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            

        }
        return -1;
    }

    public static int sqrt(int x){

        int ans = 0;
        int i = 1;
        while(i * i <= x){
            System.out.println(i);
            ans = i;
            i++;
        }
        return ans;
    }

    
    public static int optimizedsqrt(int x){

        int ans = 0;
        int i = 1;
        int start = 1;
        int end = x;

        while(start <= end){

            int mid = (start + end)/2;

            int sqrt = mid * mid;

            if(sqrt <= x){
                ans = mid;
                start++;
                end--;
            }

            if(sqrt > x){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
            System.out.println(i++);

        }
        return ans;
    }





}
