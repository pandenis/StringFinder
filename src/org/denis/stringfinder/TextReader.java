package org.denis.stringfinder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextReader {

    String fileName;

    public void FileNameReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        {
            this.fileName = bufferedReader.readLine();
        }
    }

    public StringBuilder SegmentFromText (int numberOfLines) {

        ///home/pun/TEMP/input.txt
        StringBuilder segment = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            for (int i = 0; i < numberOfLines; i++) {
                String line = br.readLine();

 //                   System.out.println(line);
                    segment.append(line + "\n");
            }

           System.out.println(segment);
        }
        catch(IOException e){
            System.out.println(e);
        }
        return segment;
    }

    public long contFileLines(String fileName) {

        Path path = Paths.get(fileName);

        long lines = 0;

        try {
            lines = Files.lines(path).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

}
