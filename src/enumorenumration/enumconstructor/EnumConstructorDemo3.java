package enumorenumration.enumconstructor;

enum BeerDemo3 {

    // enum constant:
    KF(100), KO(70), RC(65), Fo(90), KALYANI;

    // Instance Variable of enum Constant:
    int price;

    // Parameterized Constructor:
    BeerDemo3(int price) {
        this.price = price;
    }

    // No-Args Constructor:
    BeerDemo3() {
        this.price = 125;
    }

    // Instance Method of enum:
    public int getPrice() {
        return price;
    }
}

public class EnumConstructorDemo3 {
    public static void main(String[] args) {
        BeerDemo3[] values = BeerDemo3.values();
        for (BeerDemo3 value : values) {
            System.out.println(value + "----" + value.getPrice());
        }
    }
}
