package Challenges;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {

        //Challenge
        // Create a byte variable and set it to any valid byte number
        // Create a short variable and set it to any valid short number
        // Create a int variable and set it to any valid int number
        // Create a variable type long and make it equal to
        // 50000 + (10 * SUM) of the byte + short + int values

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println(longTotal);






    }
}
