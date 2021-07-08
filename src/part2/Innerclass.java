/**
 * 直接在类内部新建一个class类，注意在调用时要加上外部类
 */
package part2;

public class Innerclass{
    public static void main(String[] args){
        Outer outer = new Outer("liming");
        Outer.Inner inner = outer.new Inner();
        inner.hello();
    }
}

class Outer{
    private String name;

    public Outer(String name){
        this.name = name;
    }

    class Inner{
        void hello(){
            System.out.println("Hello, " + Outer.this.name);
        }
    }
}