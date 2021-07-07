package part2;

public class Test {
    public static void main(String[] args){
        Mxy n = new Mxy();
        String m = n.hello("XBN");
        System.out.println(m);
    }
}

class Xbn{
    protected String name;

    public String hello(String name){
        return name;
    }
}

class Mxy extends Xbn{

    @java.lang.Override
    public String hello(String name){
        return super.hello(name) + "!";
    }
}