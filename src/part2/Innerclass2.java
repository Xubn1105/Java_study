package part2;

public class Innerclass2 {
    public static void main(String[] args){

    }
}

class Outerrr{
    private static String NAME = "OUTER";

    private String name;

    public Outerrr(String name){
        this.name = name;
    }

    //静态内部类可以访问外部类的 private静态字段和静态方法
    static class StaticNested {
        void hello(){
            System.out.println("Hello, " + Outerrr.NAME);
        }
    }
}
