package com.sleepeasysoftware.dontdothis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel Kaplan on behalf of Sleep Easy Software.
 */
public class DontDoThis {

    public static void main(String[] args) {
        List<String> wat = new ArrayList<String>() {{ add("a"); add("b"); add("c"); }};

        System.out.println(wat.contains("a"));
        System.out.println(wat.contains("b"));
        System.out.println(wat.contains("c"));
    }

}
