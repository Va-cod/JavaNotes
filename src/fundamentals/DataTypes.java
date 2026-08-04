package fundamentals;

public class DataTypes {
    public static void main(String[] args) {

        System.out.println("* * * * * * * Data Types * * * * * * * ");

        // Integers | default value -> 0
        byte typeByte = 127;
        short shortType = 32767;
        int intType = 2147483647;
        long longType = 9223372036854775807L;

        System.out.println("Type byte: " + typeByte);
        System.out.println("Type short: " + shortType);
        System.out.println("Type int: " + intType);
        System.out.println("Type long: " + longType);

        // Decimal Numbers | default value -> 0.0
        float floatType = 3.45F;
        double doubleType = 3.879D;

        System.out.println("Type float: " + floatType);
        System.out.println("Type double: " + doubleType);

        // Character | default value -> \u0000
        char charType = 'A';
        char charType2 = 65;

        System.out.println("Type char: " + charType);
        System.out.println("Type char: " + charType2);

        // Boolean | default value -> false
        boolean booleanType = true;
        System.out.println("Type boolean: " + booleanType);

        //String | default value -> null
        String stringType = null;
        System.out.println("Type string: " + stringType);
    }
}
