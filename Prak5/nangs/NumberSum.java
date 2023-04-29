package Prak6.nangs;

public class NumberSum {
    public Number[] numberSum(Number[] numArr) {
        Number[] result = new Number[numArr.length];
        long sumLong = 0;
        float sumFloat = 0f;
        double sumDouble = 0.0;
        int sumInt = 0;
        short sumShort = 0;
        byte sumByte = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] instanceof Long) {
                sumLong += ((Long) numArr[i]).longValue();
            } else if (numArr[i] instanceof Integer) {
                sumInt += ((Integer) numArr[i]).intValue();
            } else if (numArr[i] instanceof Short) {
                sumShort += ((Short) numArr[i]).shortValue();
            } else if (numArr[i] instanceof Byte) {
                sumByte += ((Byte) numArr[i]).byteValue();
            } else if (numArr[i] instanceof Double) {
                sumDouble += ((Double) numArr[i]).doubleValue();
            } else if (numArr[i] instanceof Float) {
                sumFloat += ((Float) numArr[i]).floatValue();
            }
        }

        return result;
    }
}
