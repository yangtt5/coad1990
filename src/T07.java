import java.util.Scanner;

public class T07 {
    public static void main(String[] args) {
     final String UNAME="微冷的雨";
     final String PASS="666666";
        System.out.println("请输入用户名");
     Scanner input=new Scanner(System.in);
     String uname= input.next();
        System.out.println("请输入密码");
        String pass = input.next();
        if (uname.equals(UNAME)) {
          if(pass.equals(PASS)) {
              System.out.println("欢迎");
          }else{
              System.out.println("密码不正确");
          }
        }else{
            System.out.println("用户名不正确");
        }

    }
}
