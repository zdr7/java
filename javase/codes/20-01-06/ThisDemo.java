/**
 * this：表示当前对象的指针
 *  指向当前对象，表示当前对象的引用
 *  用处：
 *      1.构造方法，当构造方法中的参数名称与类的成员变量名称一致时，可以使用this代表当前对象
 *          注意：使用this之后，构造方法参数可以与成员变量参数名保持一致
 *          当构造方法中需要调用其他构造方法是，可以使用this()调用其他构造方法，但是必须位于方法体的第一行
 *      2.普通方法中：
 *          当多个普通方法之间需要调用的时候，可以使用this进行调用，指的是当前对象的其他方法
 *      3.成员变量的使用：
 *          当方法中的参数名称与成员变量一致时，使用 this. 表示的是对象的值；而使用变量名称，表示的是形参列表的值
 *
 */
public class ThisDemo {
    String name;
    int age;

    public ThisDemo(){

    }
    public ThisDemo(String name){
        System.out.println("one");
        this.name = name;
    }

    public ThisDemo(String name,int age){
        this(name);
        this.name = name;
//        this(name);
        this.age = age;
    }
    public void test1(){
        System.out.println("test1");
    }
    public void test2(String name){
        System.out.println("test2");
        test1();
        this.test1();
        System.out.println(name);
        System.out.println(this.name);
    }


    public static void main(String[] args) {
        ThisDemo td = new ThisDemo("zs",13);
        System.out.println(td.name);
        System.out.println(td.age);

        td.test2("lisi");
    }
}
