public class NumberSum {
    public Number[] numberSum(Number[] numArr) {
        Number[] res = new Number[numArr.length];
        boolean[] visited = new boolean[numArr.length];

        int it=0;
        for(int i=0;i<numArr.length;i++) {
            if(visited[i]) continue;
            res[it] = numArr[i];
            for(int j=i+1;j<numArr.length;j++) {
                if(numArr[j].getClass().equals(numArr[i].getClass())) {
                    if(numArr[j] instanceof Byte) res[it] = (byte)(res[it].byteValue() + numArr[j].byteValue());
                    if(numArr[j] instanceof Integer) res[it] = (int)(res[it].intValue() + numArr[j].intValue());
                    if(numArr[j] instanceof Double) res[it] = (double)(res[it].doubleValue() + numArr[j].doubleValue());
                    if(numArr[j] instanceof Float) res[it] = (float)(res[it].floatValue() + numArr[j].floatValue());
                    if(numArr[j] instanceof Short) res[it] = (short)(res[it].shortValue() + numArr[j].shortValue());
                    if(numArr[j] instanceof Long) res[it] = (long)(res[it].longValue() + numArr[j].longValue());
                    
                    visited[j] = true;
                }
            }
            it++;
        }

        return res;
    }

    // public static void main(String[] args) {
    //     Number[] num = {Byte.valueOf((byte)2), Byte.valueOf((byte)5), Byte.valueOf((byte)7)};

    //     NumberSum numSum = new NumberSum();
        
    //     Number[] res = numSum.numberSum(num);

    //     for(Number n: res) {
    //         if(n == null) continue;
    //         System.out.println(n.getClass());
    //         System.out.println(n);
    //     }
    // }
}
