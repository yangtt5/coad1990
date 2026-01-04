import java.util.Scanner;

public class T06 {
    public static void main(String[] args) {
        //整数大小比较
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num2 = input.nextInt();
        if(num>num2){
            System.out.println(">");
        } else if (num==num2) {
            System.out.println("=");
        }else  {
            System.out.println("<");
        }
    }
}
