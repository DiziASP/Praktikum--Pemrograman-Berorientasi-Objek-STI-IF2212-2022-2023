import java.util.ArrayList;

public class MinOp {

    public int minimumOperationsNeeded(Number[] arrNum) {
        Integer lenArrNum = arrNum.length;
        Integer[] Arr = new Integer[lenArrNum];
        Integer res = 0, maxLen = 1;
        for (Integer i = 0; i < lenArrNum; i++) {
            Arr[i] = arrNum[i].intValue();
        }

        for (Integer a : Arr) {
            Integer bits = 0;
            while (a > 0) {
                res += a & 1;
                bits++;
                a >>= 1;
            }
            maxLen = Math.max(maxLen, bits);
        }
        return res + maxLen - 1;
    }
}
