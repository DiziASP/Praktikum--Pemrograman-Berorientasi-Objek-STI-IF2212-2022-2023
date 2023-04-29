import java.util.ArrayList;

public class MinOp {
    public int minimumOperationsNeeded(Number[] arrNum) {
        // mengembalikan operasi minimum untuk mencapai array yang diinginkan
        int[] arrInt = new int[arrNum.length];
        for (int i = 0; i < arrNum.length; i++) {
            arrInt[i] = arrNum[i].intValue();
        }

        int numOps = 0, maxLen = 1; // total operations

        for (Integer a : arrInt) {
            Integer bits = 0;
            while (a > 0) {
                numOps += a & 1;
                bits++;
                a >>= 1;
            }
            maxLen = Math.max(maxLen, bits);
        }

        return numOps + maxLen - 1;
    }
}