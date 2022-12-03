public class Array {
    public static void main(String[] args) {
        // FIRST
        String[] arrayString;

        arrayString = new String[3];
        
        arrayString[0]="Husnul";
        arrayString[1]="Nawafil";
        arrayString[2]="Ganteng";
        
        System.out.println(arrayString);
        
        // SECOND
        String[] arrayString2 = new String[3];
        
        // THIRD
        int[] arrayInt = new int[]{1,2,3,4};

        // FOURTH
        long[] arrayLong = {10000,23400000,1234567890};

        System.out.println(arrayInt.length);

        // NESTED ARRAY IS DECLARABLE
        int[][] nestedArray = {
            {2, 4, 6, 8},
            {1, 3, 5, 9}
        };
    }
}
