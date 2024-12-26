package challanges;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter Your Second Number : ");
        int secondNum = input.nextInt();

        int lcm = lcm(firstNum, secondNum);
        System.out.println("LCM of two number is : "+lcm);
    }

    public static int lcm(int firstNum, int secondNum){
        int i=1;
        while (true){
            int factor = firstNum * i;
            if(factor % secondNum == 0){
                return factor;
            }
            i++;
        }
    }
}
