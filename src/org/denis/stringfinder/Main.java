package org.denis.stringfinder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        TextReader textReader = new TextReader();
        textReader.FileNameReader();
        textReader.SegmentFromText(3);
    }
}
