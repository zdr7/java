import java.util.Scanner;

public class Administrator {
    String loginName = "admin";
    String password = "123";

    public void introduce(){
        System.out.println(loginName);
        System.out.println(password);
    }

    public static void main(String[] args) {
        Administrator admin = new Administrator();
        System.out.println(admin.loginName);
        System.out.println(admin.password);

        System.out.println("修改密码");
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String pwd = sc.nextLine();

            if (name.equals(admin.loginName) && pwd.equals(admin.password)){
                System.out.println("请输入新用户名");
                admin.loginName = sc.nextLine();
                System.out.println("请输入新密码");
                admin.password = sc.nextLine();
                break;
            }else{
                System.out.println("用户名或密码错误，请重新输入");
            }
        }
        admin.introduce();
    }
}
