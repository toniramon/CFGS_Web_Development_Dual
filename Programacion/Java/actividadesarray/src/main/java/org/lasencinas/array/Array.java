package org.lasencinas.array;

import java.util.Arrays;
import java.util.List;

public class Array {


    public static void main(String[] args) {

        String[] stringArray = {"foo", "bar", "baz"};
        List<String> stringList = Arrays.asList(stringArray);
        System.out.println(stringArray.length);

        stringArray[2] = "juasjuas";

        // iterando sobre el array
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] += "2";
            //System.out.println(stringArray[i]);
        }

        for (String item : stringArray) {
            // fruit is an element of the `fruits` array.
            //System.out.println(item);
        }

        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }

        //System.out.println(stringList);

    }

}
