public class SolutionTaskTwo {
    public int solution(int[] A, String[] D) {

        int[] payment = new int[12]; //total card payments per month
        int[] transfer = new int[12]; // total incoming transfer per month
        int[] count = new int[12];  //number of payments per month

        for (int i = 0; i < 12; i++) {
            payment[i] = 0;
            transfer[i] = 0;
            count[i] = 0;
        }

        for (int i = 0; i < A.length; i++) {
            String[] date = D[i].split("-", 3);
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            if (year == 2020) {
                if (A[i] < 0) {
                    payment[month - 1] -= A[i];
                    count[month - 1]++;
                } else {
                    transfer[month - 1] += A[i];
                }
            }
        }
//        Empty account at the beginning of the year
            int balance = 0;

            for (int k = 0; k < 12; k++) {
                balance += transfer[k] - payment[k];
                if (count[k] < 3 || payment[k] < 100) { //if 3 payments of < 100 total cost
                    balance -= 5;
                    // fee deduction
                }
            }

        return balance;
    }
}