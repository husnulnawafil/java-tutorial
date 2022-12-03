public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        // string is defaultly non primitive data types
        // thus string default value will be null, because it is actually an object
        // non-primitive data type could have method/function

        // But all other data type have their own representative of non-primitive types, example:

        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // bool --> Boolean
        
        Integer thisInteger = 100;
        Long thisLong = 10000L;

        Byte thisByte;
        thisByte = null;
        
        System.out.println(thisByte);

        // primitive to non primitive with same data type
        
        int thisInt = 100;
        Integer thisInt2 = thisInt;

        int intAgain = thisInt2;
        
        // non-primitive to primitive with different data type
        short shortAge = thisInt2.shortValue();
        byte byteAge = thisInt2.byteValue();
        String stringAge = thisInt2.toString();

        System.out.println(shortAge);
        System.out.println(byteAge);
        System.out.println(stringAge);

    }
}
