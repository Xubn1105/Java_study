package part2;

public class Staticmethod {
    public static void main(String[] args){
        //类可以直接调用方法
        Person.setNumber(12);

        //类调用变量
        System.out.println(Person.number);
    }
}

class Person{
    public static int number;

    public static void setNumber(int value){
        //静态方法内部无法访问this变量，this.number = number是错误的
        number = value;
    }
}
