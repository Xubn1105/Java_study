package part2;

public class Static {
    public static void main(String[] args){
        Personn m = new Personn("xiaoming", 12);
        Personn n = new Personn("lihong", 15);
        m.number = 88;
        System.out.println(n.number);
        n.number = 99;
        System.out.println(m.number);
    }
}

class Personn{
    private String name;
    private int age;

    public static int number;

    public Personn(String name, int age){
        this.name = name;
        this.age = age;
    }
}
