import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Num1: ");
        double num1 = scanner.nextDouble();
        System.out.printf("Num2: ");
        double num2 = scanner.nextDouble();
        System.out.printf("Num3: ");
        double num3 = scanner.nextDouble();

        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers( double num1, double num2, double num3){
        double[] nums = new double[3];
        nums[0] = num1;
        nums[1] = num2;
        nums[2] = num3;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                if(nums[i]<nums[j]){
                    double temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(double db:nums){
            System.out.printf(db+" ");
        }
    }
}
