package PrimitiveTypes;

import TestClasses.MyNewClass;

public class Main {

    public static void main(String[] args) {

        // This is the main entry point to th program
        System.out.println("CharAndBoolean output");
        PrimitiveTypes.CharAndBoolean.test();
        System.out.println("**********************");

        System.out.println("FloatAndDouble output");
        PrimitiveTypes.FloatAndDouble.test();
        System.out.println("**********************");

        System.out.println("FloatingChallenge output");
        PrimitiveTypes.FloatingChallenge.test();
        System.out.println("**********************");

        System.out.println("IntByteShortLong output");
        PrimitiveTypes.IntByteShortLong.test();
        System.out.println("**********************");

        System.out.println("StringData output");
        PrimitiveTypes.StringData.test();
        System.out.println("**********************");

        MyNewClass.test();
    }
}