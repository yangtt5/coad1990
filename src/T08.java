import java.util.Scanner;

public class T08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num >1&&num <100) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
