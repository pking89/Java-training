package PrimitiveTypes;

public class FloatingChallenge {

    public static void main(String[] args) {

        //Challenge

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue =" + myFloatValue);
        System.out.println("MyDoubleValue = " +  myDoubleValue);

        //more precision when using the float and double "1.66666" and 1.66666667"

        //Challenge
        // 1 - Create a variable with the appropriate type to store the number of lbs to be
        //     converted into kilos
        // 2 - Calculate the result [number of kilo based on contents of the variable] and store
        //      the results in a 2nd appropriate variable
        // 3 - Print out result [HINT: 1 lb = 0.45359237 kilo ]

        int myLBSValue = 1;
        double myKiloValue =0.45359237;
        System.out.println("The amount of kilos within 1 lb = " + myLBSValue / myKiloValue);

        //Class Creation

        double numberofPounds = 220d;
        double convertedKilograms = numberofPounds * 0.45359237d;
        System.out.println("Converted kilograms =" + convertedKilograms);


        }
    }
