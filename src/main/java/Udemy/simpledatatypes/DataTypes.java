
/*
 * Primitive Data Types Demo
 */
public class DataTypes {

    public static void main(String[] args) {

        // byte:
        // Min Value: -128
        // Max Value: 127
        byte b = 10;
        System.out.println("btye: " + b);

        // short:
        // Min Value: -32,768
        // Max Value: 32,767
        short s = 10000;
        System.out.println( "Short.MAX_VALUE");
        System.out.println(Short.MAX_VALUE);


        // int:
        // Min Value: -2,147,483,648 (-2^31)
        // Max Value 2,147,483,647 (2^31 - 1)
        System.out.println( "Min Value: -2,147,483,648 (-2^31),Max Value 2,147,483,647 (2^31 - 1),Integer.MAX_VALUE,Integer.MIN_VALUE");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int i = 2_147_483_647;
        System.out.println(i);

        // long:
        // Min Value: -9,223,372,036,854,775,808 (2^63)
        // Max Value: 9,223,372,036,854,775,807 (2^63 – 1)
        System.out.println( "Min Value: -9,223,372,036,854,775,808 (2^63),Max Value: 9,223,372,036,854,775,807 (2^63 – 1),Long.MAX_VALUE,Long.MIN_VALUE");
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        long l = 100342342342342324L;

        // float: 32-bits IEEE floating points (single precision)
        // Min Value: 1.4E-45
        // Max Value: 3.4028235E38
        System.out.println( "32-bits IEEE floating points (single precision),Float.MAX_VALUE,Float.MIN_VALUE");
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        float f = 1.25F;
        System.out.println( "  float f = 1.25F;       "+f);

        // double:64-bit IEEE floating points (double precision)
        // Min Value: 4.9E-324
        // Max Value: 1.7976931348623157E308
        System.out.println( " double:64-bit IEEE floating points (double precision),Float.MAX_VALUE,Float.MIN_VALUE");
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        double d = 1.25;
        System.out.println( " double d = 1.25;;       "+d);

        // char: character or unicode
        char c = 'c';

        // boolean: true or false
        boolean bool = false;

    }

}
