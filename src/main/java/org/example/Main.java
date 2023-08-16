package org.example;

public class Main
{
    public static void main(String[] args) throws Exception {
        Book book = new Book();
        book.setBookName("Java Reference");
        book.setDescription("This should be set to null");
        book.setCopies(25);

        Serialize.serialize(book);

        System.out.println(Deserialize.deserialize().getBookName());
        System.out.println(Deserialize.deserialize().getDescription());
        System.out.println(Deserialize.deserialize().getCopies());
    }
}