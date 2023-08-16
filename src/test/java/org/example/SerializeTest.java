package org.example;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class SerializeTest {
    private Book book;
    private static final String fileName = "test.txt";
    @Test
    void shouldThrowAnException_whenSerialize() throws IOException {
        // Given
        book = new Book();
        book.setBookName("Java Reference");
        book.setDescription("This should be set to null");
        book.setCopies(25);
        // When
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        // Then
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(book);
            assertNotNull(book);
        }
    }
}