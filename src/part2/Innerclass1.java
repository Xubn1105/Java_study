package part2;

public class Innerclass1 {
    public static void main(String[] args){
        Outerr outer = new Outerr("liming");
        outer.asyncHello();
    }
}

class Outerr{
    private String name;

    public Outerr(String name){
        this.name = name;
    }

    void asyncHello(){
        Runnable r = new Runnable() {
            @java.lang.Override
            public void run() {
                System.out.println("Hello, " + Outerr.this.name);
            }
        };
        new Thread(r).start();
    }
}
