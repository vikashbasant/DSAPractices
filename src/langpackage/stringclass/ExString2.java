package langpackage.stringclass;

public class ExString2 {
    public static void main(String[] args) {
        
        /*
        There are total 3 objects are created:
            -> 2 objects are created in Heap Area(s, s1 are referring that object)
            -> 1 object are created in SCP(String Constant Pool) Area(s2,s3 are referring that object)
         */
        String s = new String("Vikash");
        String s1 = new String("Vikash");
        String s2 = "Vikash";
        String s3 = "Vikash";

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
