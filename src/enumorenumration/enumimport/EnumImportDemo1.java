package enumorenumration.enumimport;

enum Beer {
    KF, RC, KO, FO
}

public class EnumImportDemo1 {
    public static void main(String[] args) {
        
        System.out.println(Beer.FO == Beer.RC);
        System.out.println(Beer.KF.equals(Beer.KO));

        /*// =>> Operator '<' cannot be applied to 'enumorenumration.enumimport.Beer', 'enumorenumration.enumimport.Beer'
        System.out.println(Beer.RC < Beer.KO);*/

        System.out.println(Beer.KF.ordinal() < Beer.RC.ordinal());
    }
}
