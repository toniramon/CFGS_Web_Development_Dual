package org.lasencinas.chapter16;

public class EarlyBindingSub extends EarlyBindingSuper{

    // An instance variable
    public String str = "EarlyBindingSub";

    // A static variable
    public static int count = 200;

    public static void print() {
        System.out.println("Inside EarlyBindingSub.print()");
    }

}
