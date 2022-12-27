package com.example.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultStaticExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Mike","Syed","Jenny","Gene","Rajeev");
        //Collections.sort(names);
        //System.out.println("names = " + names);

        names.sort(Comparator.naturalOrder());
        System.out.println("names = " + names);

    }
}
