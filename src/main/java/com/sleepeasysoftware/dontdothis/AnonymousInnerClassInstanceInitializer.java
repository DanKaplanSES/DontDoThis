package com.sleepeasysoftware.dontdothis;

/**
 * Created by Daniel Kaplan on behalf of Sleep Easy Software.
 */
public class AnonymousInnerClassInstanceInitializer {

    public static void main(String[] args) {
        new InnerClass() {
            {
                System.out.printf("I am constructing an Anonymous Inner Class Now!");
            }
        };
    }

    static class InnerClass {

    }

}
