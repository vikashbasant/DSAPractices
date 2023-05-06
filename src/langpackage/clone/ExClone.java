package langpackage.clone;

public class ExClone implements Cloneable{
    int i = 10;
    int j = 20;

    public static void main(String[] args) throws CloneNotSupportedException {
        ExClone ex = new ExClone();
        ExClone ex1 = (ExClone) ex.clone();
        ex1.i = 888;
        ex1.j = 999;

        System.out.println(ex.i + "..." + ex.j);
        System.out.println(ex1.i + "..." + ex1.j);
    }
}
