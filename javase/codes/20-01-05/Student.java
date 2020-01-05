/**
 * 所有类定义的时候可以添加属性和方法，但不是必须
 *  一个java文件中可以定义N多个class，但只能有一个public class并且public class类名与文件名保持一致
 *
 * 属性：
 *  语法：
 *  [访问修饰符]   数据类型    属性名称 = 值；
 *
 *  注意：
 *      定义属性的时候，可以有值也可以没有值
 *
 * 方法：表示行为
 *  语法：
 *      [访问修饰符] 返回值类型(任何类型) 方法名称(形参列表){
 *          逻辑代码
 *      }
 *   注意：
 *      1.方法的访问修饰符可以不写
 *      2.方法可以有返回值，亦可没有，void表示无返回值
 *      3.形参列表可以有，亦可没有
 *      4.java中方法的传参都是值传递
 *
 * 对象的创建和使用
 *      1.使用new关键字创建对象
 *      ClassName objectName = new ClassName();
 *      2.对象的使用
 *          使用对象的时候可以通过  对象名称.属性 或者 对象名称.方法 来使用对象的属性和方法
 */
public class Student {
    //属性的定义
    int stuNumber;
    int age = 20;
    String name;

    //方法定义
    void study(){
        System.out.println("学习");
    }

    void eat(String food){
        System.out.println("吃"+food);
    }

    public static void main(String[] args) {
        //创建对象
        Student student = new Student();
        //使用属性
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stuNumber);

        //修改属性值，给属性赋值
        student.name = "张三";
        student.age = 18;
        student.stuNumber = 123456;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stuNumber);
        //调用方法
        student.study();
        student.eat("apple");
    }
}