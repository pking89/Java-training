package TestClasses;

import TestClasses.Main;

public class Main {

    public static void main(String[] args) {

        // This is the main entry point to th program
        System.out.println("CharAndBoolean output");
        TestClasses.CharAndBoolean.test();
        System.out.println("**********************");

        System.out.println("FloatAndDouble output");
        TestClasses.FloatAndDouble.test();
        System.out.println("**********************");

        System.out.println("FloatingChallenge output");
        TestClasses.FloatingChallenge.test();
        System.out.println("**********************");

        System.out.println("IntByteShortLong output");
        TestClasses.IntByteShortLong.test();
        System.out.println("**********************");

        System.out.println("StringData output");
        TestClasses.StringData.test();
        System.out.println("**********************");

        System.out.println("Operators output");
        TestClasses.Operators.test();
        System.out.println("**********************");

    }
}