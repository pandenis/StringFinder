package org.denis.stringfinder;

import java.util.ArrayList;
import java.util.List;


public class Matcher {

    public List<Integer> Matcher (String text, String inputString) {
        List<Integer> indexes = new ArrayList<>();
/*        String lcText = text.toLowerCase();
        String lcInputString = inputString.toLowerCase();*/

        int index = 0;
        while (index != -1) {
            index = text.indexOf(inputString, index);
            indexes.add(index);
            index++;
        }

        return indexes;
    }
}
