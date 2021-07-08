package xyz;

public class Main {
    public static void main(String[] agrs){
        Inner i = new Inner();
        i.hi();
    }

    private static void hello(){
        System.out.println("private hello!");
    }

    //静态内部类，该类称为嵌套类，定义在类class内部
    static class Inner{
        public void hi(){
            //嵌套类有访问private的权限
            Main.hello();
        }
    }
}
