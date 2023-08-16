package org.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
    static final String fileName = "test.txt";
    public static Book deserialize() throws Exception {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Book book = (Book) inputStream.readObject();
        fileInputStream.close();
        inputStream.close();
        return book;
    }
}
