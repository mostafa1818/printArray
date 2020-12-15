package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] int_array={1,2,3,4};
        Character[] char_array={'a','b'};
        Double[] double_array={1.1,2.2,3.3,4.4};
        String[] string_array={"ab","ac","ad","af","ah"};

        PrintClass printClass=new PrintClass();
        printClass.printArray(int_array);
        System.out.println("********************");
        printClass.printArray(double_array);
        System.out.println("********************");
        printClass.printArray(char_array);
        System.out.println("********************");
        printClass.printArray(string_array);
        System.out.println("********************");
        printClass.printArray(string_array,2,4);

    }
}
