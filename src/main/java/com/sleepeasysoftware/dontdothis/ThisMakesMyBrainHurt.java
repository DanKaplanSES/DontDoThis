package com.sleepeasysoftware.dontdothis;

/**
 * Created by Daniel Kaplan on behalf of Sleep Easy Software.
 */
public class ThisMakesMyBrainHurt {

    public static void main(String[] args) {
        new Child();    //this constructor calls Parent()
        new Child("bye");  //this constructor calls Parent(String)
    }

    static class Parent {
        private String something = null;

        public Parent() {
            something = "hi";
        }

        public Parent(String param) {
            something = param;
        }

        public void saySomething() {
            System.out.println(something);
        }
    }

    static class Child extends Parent {
        {
            saySomething();
        }

        public Child() {
            super();
        }

        public Child(String childParam) {
            super(childParam);
        }
    }

}
