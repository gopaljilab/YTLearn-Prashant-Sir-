package challanges;

public class SmallLarge {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < small) small = num;
            if (num > large) large = num;
        }
        System.out.println("Smallest : "+small);
        System.out.println("Largest : "+large);

    }
}
