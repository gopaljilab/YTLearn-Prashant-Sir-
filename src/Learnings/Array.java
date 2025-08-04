package Learnings;

public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int[] arrayValues = {12,23,24,43,25};

//        System.out.println(arrayValues[2]);
//        System.out.println(arrayValues[4]);
//        for(int index=0; index < arrayValues.length;index++){
//            System.out.println(arrayValues[index]);
//        }
        for (int arr : arrayValues) {
            System.out.println(arr);
        }

        String[] arrString = {"First","Second","Third"};
        System.out.println(arrString[0]);
        System.out.println(arrString[1]);
        System.out.println(arrString[2]);
    }
}
