import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxProductInterpreter {

    public int maximumProduct(int[] arr) {
        int length = arr.length;
        int max = Integer.MIN_VALUE;

        if(length < 2 ) {
            System.out.println("No maximum exists, returning sentinel value.");
            return max;
        }

        for (int i = 0; i < length;i++) {
            for (int j = i+1;j < length;j++) {
                if (arr[i] * arr[j] > max) {
                    max = arr[i] * arr[j];
                }
            }
        }
        return max;
    }

    public int maximumProduct2(int[] arr) {
        int length = arr.length;

        if (length < 2) {
            System.out.println("No maximum exists, returning sentinel value");
            return Integer.MIN_VALUE;
        }

        Arrays.sort(arr);

        int maxProduct = arr[length - 2] * arr[length - 1];
        int minProduct = arr[0] * arr[1];

        if(maxProduct > minProduct) {
            return maxProduct;
        } else {
            return minProduct;
        }
    }

    public int maximumProduct3(int[] arr) {
        int length = arr.length;

        if(length < 2) {
            System.out.println("No maximum exists, returning sentinel value.");
            return Integer.MIN_VALUE;
        }

        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;

        int min1 = arr[0];
        int min2 = Integer.MAX_VALUE;

        for (int i = 1; i < length;i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if(arr[i] < min2) {
                min2 = arr[i];
            } else if(arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if(arr[i] > max2) {
                max2 = arr[i];
            }
        }

        int maxProduct = max1 * max2;
        int minProduct = min1 * min2;

        if(maxProduct > minProduct) {
            return maxProduct;
        } else  {
            return minProduct;
        }
    }
}
