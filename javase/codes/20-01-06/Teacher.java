/**
 * 构造方法：
 *  创建对象时默认会调用构造方法来创建对象，（在堆中开辟空间），可以完成成员变量的某些初始化操作
 *  构造方法的语法：
 *      方法名称：构造方法的方法名称必须跟类的方法名称保持一致
 *      访问修饰符：
 *      形参：可以用户自定义添加，与方法普通参数一样
 *      方法体：完成对象的初始化功能
 *      返回值：没有返回值
 *  注意：
 *      1.创建完类之后，如果没有手动调用构造方法，会有一个默认的无参构造方法供调用
 *      2.当用户自定义了构造方法之后，默认的无参构造方法不能使用，必须手动定义无参构造方法
 *      3.同一个类中可以包含多个同名构造方法
 *  方法重载：
 *      在一个类中可以包含多个重名方法，但是注意方法的参数列表不能相同
 *          1.参数的个数不同
 *          2.参数的类型不同
 *          3.参数的顺序不同
 *      注意：
 *          一般构造方法都会进行重载（一个类中可能包含多个属性值，当只需要给部分属性初始化时需要调用不同构造方法）
 */
public class Teacher {
    String name;
    int age;

    //构造方法
    public Teacher(){
        System.out.println("new.....");
    }
    public Teacher(String xname,int xage){
        name =  xname;
        age = xage;
    }

    //方法重载
    public void teach(){
        System.out.println("上课");
    }
    public void teach(String a){

    }
    public void teach(String a,int b){

    }
    public void teach(int b,String a){

    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("li",12);
    }
}
