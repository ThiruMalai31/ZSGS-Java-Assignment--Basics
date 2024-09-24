public class TypeConversion {
    public static void main(String[] args) {

        byte byteDigit=100;
        short shortDigit=1234;
        int intDigit=1234;
        float floatDigit=1234.44f;
        double doubleDigit=2332.22;
        long longDigit=100003223;



        //Explicit Conversion
        System.out.println("Explicit Conversion (Narrowing)");

        byteDigit=(byte) shortDigit;
        System.out.println(byteDigit);

        intDigit=60;
        shortDigit=(short) intDigit;
        System.out.println(shortDigit);

        intDigit=(int)floatDigit;
        System.out.println(intDigit);

        floatDigit=(float) doubleDigit;
        System.out.println(floatDigit);

        longDigit=10000;
         intDigit=(int)longDigit;
        System.out.println(intDigit);

         doubleDigit=1024.34;
         longDigit=(long)doubleDigit;
        System.out.println(longDigit);


        //Implicit Conversion

        System.out.println("Implicit Conversion ( Widening)");

        byteDigit=100;
        shortDigit=byteDigit;
        System.out.println(shortDigit);

        intDigit=shortDigit;
        System.out.println(intDigit);

        longDigit=intDigit;
        System.out.println(longDigit);

        floatDigit=longDigit;
        System.out.println(floatDigit);

        doubleDigit=floatDigit;
        System.out.println(doubleDigit);


    }
}
