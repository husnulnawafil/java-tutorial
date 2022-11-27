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
    }
}
