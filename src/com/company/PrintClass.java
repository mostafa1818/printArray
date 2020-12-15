package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class PrintClass {

    public <T> void printArray  ( T[] array)
    {
        Arrays.stream(array).forEach(System.out::println);
    }
    public <T> void printArray  (  T[] array,int lowSubscript,int highSubscript)
    {
        if((lowSubscript>highSubscript)||(lowSubscript<0)||(highSubscript>array.length))
            try { throw  new IllegalAccessException("wrong "); } catch (IllegalAccessException e) { e.printStackTrace(); }
        Arrays.stream(array) .skip(lowSubscript).limit(highSubscript-lowSubscript+1).forEach(System.out::println);
    }
    public  <S extends String> void printArray  ( S[] array)
    {
        Arrays.stream(array).forEach(System.out::println );
    }


}
