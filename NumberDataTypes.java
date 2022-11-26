public class NumberDataTypes {
    public static void main(String[] args) {
        // variables declaration
        int number;

        number = 100000;

        byte thisByte = 100;
        short thisShort = 1000;
        int thisInt = 1000000000;
        long thisLong = 1000000000;
        long thisLong2 = 1000000000L;

        float thisFloat = 10.10F;
        double thisDouble = 10.10;

        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        long balance = 1_000_000_000L;  // for easy reading

        // ============================
        // number data type conversion
        // ============================
        // 1. Widening Casting (automatic)
        // byte -> short -> int -> long -> float -> double
        byte sum = 25;
        short total = sum;
        int totalCost = total;

        // 2. Narrowing Casting (manual)
        // double -> float -> long -> int -> char -> short -> byte
        byte male = (byte)totalCost;
    }
}
