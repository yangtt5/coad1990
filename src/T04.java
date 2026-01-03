import java.util.Scanner;

public class T04 {
    public static void main(String[] args) {
        System.out.println("请随机输入一个整数");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("odd");
        }
    }
}