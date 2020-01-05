import java.util.Scanner;

/**
 * 字符串做比较时
 * ==：比较的是地址
 * equals：比较具体的值
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = str1;
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        Scanner sc = new Scanner(System.in);
        String str3 = sc.nextLine();
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

        String str4 = new String("abc");
        System.out.println(str1 == str4);
        System.out.println(str1.equals(str4));
    }
}
