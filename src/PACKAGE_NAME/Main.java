package PACKAGE_NAME;

public class Main {


    public static void main (String[] args) {
        Numbers tN = new Numbers();
    long begin = System.currentTimeMillis();
        System.out.println(tN.count(5,10,20,4));
        System.out.println("Time:" + (System.currentTimeMillis() - begin));

    }
}



