package langpackage.stringclass;

public class ExString {
    public static void main(String[] args) {

        String s = new String("Coding");
        s.concat("Ninjas"); // this object has no reference variable, so this eligible for GC:

        // output is Coding but not CodingNinjas because String is immutable:
        System.out.println(s);
    }
}
