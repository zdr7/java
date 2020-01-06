

/**
 * 变量：
 *  局部变量：
 *      定义在方法中的变量
 *          作用域：从定义的位置开始到整个方法结束
 *          局部变量不包含默认值，如果没有使用当前变量的话可以不赋值
 *          注意：局部变量只能在当前方法中使用，其他地方无法使用
 *
 *  成员变量：
 *      定义在方法外，类内的变量
 *      成员变量包含初始值：int-0，String-null，boolean-false
 *          作用域：整个类体内
 */
public class VarDemo {
    static int age = 20;
    public void show(){
        int a = 20;
        String name = "张三";
    }
    public static void main(String[] args) {
        System.out.println(age);
    }
}
