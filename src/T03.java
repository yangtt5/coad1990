import com.sun.jdi.PathSearchingVirtualMachine;
import java.util.Scanner;
public class T03 {
    public static void main(String[] args) {
        System.out.println("请输入一份跳绳次数");
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        if (num>=2000){
            System.out.println("跳绳高高高手");
        }else {
            System.out.println("还得加油哦！");
        }
    }
    }
