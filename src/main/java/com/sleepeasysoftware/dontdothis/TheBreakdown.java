package com.sleepeasysoftware.dontdothis;

/**
 * Created by Daniel Kaplan on behalf of Sleep Easy Software.
 */
public class TheBreakdown {

    static {
        System.out.println("I run first");
    }

    public static void main(String[] args) {
        new TheBreakdown();
    }

    {   //This is an Instance Initializer
        System.out.println("I run second");
    }

    public TheBreakdown() {
        System.out.println("I run third");
    }
}
