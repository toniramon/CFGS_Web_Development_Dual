package org.lasencinas.dniRegex.utilities;

import java.util.*;

public class RegularExpression {

    private static RegularExpression myRegularExpression = null;
    private Map<String, String> regexDictionary = new HashMap<String, String>();

    // Generamos patron Singleton. Comprobamos que el objeto existe. sino lo generamos UNA vez.
    public  static RegularExpression getMyRegularExpression() {

        if (myRegularExpression==null) {

            myRegularExpression=new RegularExpression();
        }
        return myRegularExpression;
    }

    private RegularExpression() {
    }



    public void addRegex(String key, String value) {
        this.regexDictionary.put(key, value);
    }

    public Map<String, String> getRegex() {
        return this.regexDictionary;
    }

    public String getRegexValue(String key) {
        return this.regexDictionary.get(key);
    }

    public Collection<String> getValues() {
        return this.regexDictionary.values();
    }


}
