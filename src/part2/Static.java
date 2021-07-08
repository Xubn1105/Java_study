/**static value
 *
 */
package part2;

public class Static {
    public static void main(String[] args){
        Personn m = new Personn("xiaoming", 12);
        Personn n = new Personn("lihong", 15);
        //m.number = 88;
        Personn.number = 100;
        System.out.println(n.number);
        //n.number = 99;
        Personn.number = 200;
        System.out.println(m.number);
    }
}

class Personn{
    private String name;
    private int age;

    //定义的静态变量可以被类的所有实例所访问 一般用（类名.变量名）表示
    public static int number;

    public Personn(String name, int age){
        this.name = name;
        this.age = age;
    }
}
