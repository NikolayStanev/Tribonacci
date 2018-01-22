package PACKAGE_NAME;

public class Numbers {
    int t1;
    int t2;
    int r3;
    int n;

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public int getT2() {
        return t2;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public int getR3() {
        return r3;
    }

    public void setR3(int r3) {
        this.r3 = r3;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public long count (long t1 , long t2 , long t3 , int n){
    long sum = t3;
    long sum2 = t2+t3;

        for (int i = 3 ; i< n; i++){

            sum = t1+t2+t3;
            t1=t2;
            t2=t3;

            t3=sum;


        }
        return sum;
    }

}

