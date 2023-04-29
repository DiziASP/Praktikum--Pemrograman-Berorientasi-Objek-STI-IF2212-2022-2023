import java.util.ArrayList;

public class MinOp {
    public int minimumOperationsNeeded(Number[] arrNum) {
        // mengembalikan operasi minimum untuk mencapai array yang diinginkan
        int[] arrInt = new int[arrNum.length];
        for (int i = 0; i < arrNum.length; i++) {
            arrInt[i] = arrNum[i].intValue();
        }

        int numOps = 0; // total operations

        for (int i = arrInt.length - 1; i >= 0; i--) {
            int tmp = arrInt[i];
            while (tmp > 0) {
                if (tmp % 2 == 0) {
                    tmp /= 2;
                } else {
                    tmp--;
                    numOps++;
                }
            }
            numOps++;
        }

        return (numOps == 0) ? 0 : numOps - 1;
    }
}