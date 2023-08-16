package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeserializeTest {
    private Book book;
    @Test
    void shouldUseDefaultValuesForTransientFields_whenDeserialize() throws Exception {
        // Given
        book = new Book();
        book.setBookName("Java Reference");
        book.setDescription("This should be set to null");
        book.setCopies(25);
        // When
        book = Deserialize.deserialize();
        // Then
        assertEquals("Java Reference", book.getBookName());
        assertNull(book.getDescription());
        assertEquals(0, book.getCopies());
    }
}