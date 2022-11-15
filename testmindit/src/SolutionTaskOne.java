public class SolutionTaskOne {
    public int solution(int[] A) {
        // write your code in Java SE 8
     //First Exercise
        int sum = 0;
        int count = 0;
        for (int i = 0; i < A.length;i++)  {
            if(A[i] > 0)  {
                sum += A[i];
                count++;
                if(count == 3) {
                    return sum;
                }
            }
        }
        return sum;
    }
}
