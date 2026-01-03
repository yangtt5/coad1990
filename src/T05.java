import java.util.Scanner;

public class T05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if(score>=90){
            System.out.println("成绩优秀");
        }else if (score>=80){
            System.out.println("成绩良好");
                    } else if (score>=70) {
            System.out.println("成绩中等");

        } else if (score>=60) {
            System.out.println("成绩及格");

        }else{
            System.out.println("不及格");
        }

    }
}
