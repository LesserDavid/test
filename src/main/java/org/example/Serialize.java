package org.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {
    static final String fileName = "test.txt";
    public static void serialize(Book book) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(book);
        outputStream.close();
        fileOutputStream.close();
    }
}
