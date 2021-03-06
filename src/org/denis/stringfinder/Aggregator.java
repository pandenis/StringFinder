package org.denis.stringfinder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Aggregator {

    String fileName;

    private List<Integer> lineOffsetsCalculator (String inputString, Integer numberOfLines) throws IOException {
        List<Integer> lineOffsets = new ArrayList<>();
        String line;
        try (LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(fileName))) {
            while ((line = lineNumberReader.readLine()) != null) {
                if (line.contains(inputString))
                //TODO: Add verification by first word in text, last word in text and string + punctuation and spaces;
                {
                    Integer offset = numberOfLines - lineNumberReader.getLineNumber();
                    lineOffsets.add(offset);
                }
            }
        }

        return lineOffsets;
    }
}
