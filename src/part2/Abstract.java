/**
 * 如果父类的方法不需要实现任何功能，只想要子类去重写它，那么可以在类名和
 * 方法名前加上abstract；
 *
 * 如果父类定义了抽象方法，那么实现子类的时候，就必重写父类的方法
 */

package part2;

public class Abstract {
    public static void main(String[] args){
        Animal m = new Dog();
        m.run();
        Animal n = new Cat();
        n.run();
    }
}

abstract class Animal{
    public abstract void run();
}

class Dog extends Animal{
    @java.lang.Override
    public void run(){
        System.out.println("Dog class");
    }
}

class Cat extends Animal{
    @java.lang.Override
    public void run(){
        System.out.println("Cat class");
    }
}
