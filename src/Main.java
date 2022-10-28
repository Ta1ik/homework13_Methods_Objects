public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Schewitche");
        Author author2 = new Author("Karl", "Sagan");
        Author author3 = new Author("Joan", "Roaling");
        Author author4 = new Author("John", "Boyn");

        Book book1 = new Book("Scada-system", author1, 2013);
        Book book2 = new Book("Contact", author2, 1985);
        Book book3 = new Book("Harry Potter", author3, 2003);
        Book book4 = new Book("Boys in the striped pijam", author4, 1951);
        Book book5 = new Book("Harry Potter", author3, 2003);

        book2.setPublishingYear(2018);

        System.out.println("Книга 1. Название: " + book1.getBookName() + ". Автор: " + author1.getAuthorName() + " " + author1.getAuthorSurname() + ". Год издания: " + book1.getPublishingYear());
        System.out.println("Книга 2. Название: " + book2.getBookName() + ". Автор: " + author2.getAuthorName() + " " + author2.getAuthorSurname() + ". Год издания: " + book2.getPublishingYear());
        System.out.println("Книга 3. " + book3);
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());
        System.out.println(book3.equals(book5));
        System.out.println(author3.equals(author2));
    }
}
