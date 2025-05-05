package syntax.vars;

public class variables {
    public static void main(String[] args) {

        byte nnn = 127; //-128...127
        System.out.println(Integer.parseInt("11111111", 2));
        System.out.println("The byte number: "+nnn);


        short nns = 32767; //-32768...32676
        System.out.println("The short number: "+nns);

        int nnw = 1400303030; //-2kkk...2kkk
        System.out.println("The int number: "+nnw);

        long nnq = 1_922_337_203_342L; //для наглядности
        System.out.println("The long number: "+nnq);

        float nnp = 3.14f;
        System.out.println("The float number: "+nnp);

        double nnr = 3.14;
        System.out.println("The double number: "+nnr);
        System.out.println(Double.isNaN(23/0.0));

        char nnc = 'A';
        System.out.println("The char symbol: "+nnc);

        boolean nnb = true;
        System.out.println("The boolean value: "+nnb);

        var somevar = 10L;

        short varForCasting = nnn;
        System.out.println("The casted variable: "+varForCasting);

        int intVarForCasting = 257;
        byte byteVarForCasting = (byte)intVarForCasting; //в скобках, потому что раньше шорт было больше чем байт а сейчас наоборот
        System.out.println("The byte variable after casting: "+byteVarForCasting);

        var doubleVar = 4.89;
        int intCastDouble = (int)doubleVar;
        System.out.println("The double variable after casting: "+intCastDouble);
    }
}
