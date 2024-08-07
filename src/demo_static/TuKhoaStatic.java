package demo_static;

public class TuKhoaStatic {
    public static int n;

    public final int m = 100;

    public void show(){
        System.out.println("n = "+n);
    }

    public void setN(int n){
        this.n = n;
    }

}
