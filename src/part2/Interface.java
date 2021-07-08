/**
 * 当一个抽象类没有字段的时候，所有的方法都是抽象方法；此时可以将抽象类改写为接口interface；
 *
 *注意：在java中，一个类只能继承自另一个类，但是以一个类可以实现多个接口；
 *
 * 接口中定义的方法前面加上default时，此时可以在方法中加入主体；
 *
 * interface接口是一个纯抽象类，它不能定义实例字段，但是interface可以有静态字段，并且静态字段必须为final类型
 */

package part2;

public class Interface {
    public static void main(String[] args) {
        Primaryincome p = new Income(3000);
        Primaryincome m = new Salaryincome(7500);
        Primaryincome n = new Specialincome(15000);
    p.run();
    System.out.println(p.getTax() + m.getTax() + n.getTax());
    }
}

//定义了一个原始的收入接口

interface Primaryincome{
    default public void run() {
        System.out.println("请输出最后的税收结果:");
    }
        public double getTax();
}

class Income implements Primaryincome{
    protected double income;

    public Income(double income){
        this.income = income;
    }

    public double getTax(){
        return this.income * 0.1;
    }
}

class Salaryincome implements Primaryincome{
    protected double income;

    public Salaryincome(double income){
        this.income = income;
    }

    @java.lang.Override
    public double getTax(){
        if (income < 5000){
            return income;
        }
        return (income - 5000) * 0.1;
    }
}

class Specialincome implements Primaryincome{
    protected double income;

    public Specialincome(double income){
        this.income = income;
    }

    @java.lang.Override
    public double getTax(){
        return 0;
    }
}


