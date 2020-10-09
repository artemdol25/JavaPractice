package Task3;

public class TestBook {

    public static void main(String[] args) {

        Book book1 = new Book(504, 1967);
        Book book2 = new Book();

        book1.setName("The Master and Margarita");

        book2.setName("Doctor Zhivago");
        book2.setNumberOfPages(592);
        book2.setYearOfPublication(1957);

        System.out.println(book1.getName());
        System.out.println(book1);
        System.out.println(book2.getName());
        System.out.println(book2);
    }
}
