package demo_static;

public class TestStatic {
    public static void main(String[] args) {
        TuKhoaStatic obj1, obj2;
        TuKhoaStatic.n = 100;

        obj1 = new TuKhoaStatic();
        obj2 = new TuKhoaStatic();

        obj1.show();
        obj2.show();

        TuKhoaStatic.n = 200;

        obj1.show();
        obj2.show();

        obj1.setN(1000);
        obj1.show();
        obj2.show();

        System.out.println("Lay gia tri m: "+ obj1.m);

    }
}
