package declarationsAndAccess.interf;

interface Left1 {
    int x = 777;
}

interface Right1 {
    int x = 999;
}

class Test1 implements Left1, Right1 {
    public static void main(String[] args) {
        // System.out.println(x);
        // CE: reference of x is ambiguous
        System.out.println(Left1.x);
        System.out.println(Right1.x);
    }
}

