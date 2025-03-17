import java.util.Scanner;

public class FriendlyPair{
    public static int sumofDevisors(int num){
        int sum = 0;
        for(int i = 1;i < num; i++){
            if (num % i ==0){
                sum += i;
            }
        }
        return sum;
    }

    public static boolean areFriendly(int num1 ,int num2){
        double index1 = (double)sumofDevisors(num1)/num1;
        double index2 = (double)sumofDevisors(num2)/num2;
        return index1 == index2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int num1 = sc.nextInt();
        System .out.print("Enter the second number:");
        int num2 = sc.nextInt();

        if(areFriendly(num1,num2)){
            System.out.println(num1 + " and " + num2 + " are Friendly numbers.");
        }
        else{
            System.out.println(num1 + " and " + num2 + " are not Friendly numbers.");
        }
    }
}