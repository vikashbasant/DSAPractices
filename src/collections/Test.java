package collections;

public class Test {
    private int a;
    private int b;

    public Test() {
    }

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Test other = (Test) obj;
        return this.a == other.a;
    }



    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test);


        Test test1 = new Test();
        System.out.println((test).equals(test1));
    }

}



