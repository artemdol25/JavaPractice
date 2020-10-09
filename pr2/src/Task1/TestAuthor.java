package Task1;

public class TestAuthor {

    public static void main(String[] args) {

        Author author1 = new Author("Oleg Petrovich", "petrovich007@mail.ru", 'm');
        Author author2 = new Author("Artyom Dolgopolov", "", 'm');

        author2.setEmail("artemka2001@mail.ru");

        System.out.println(author1);
        System.out.println(author2);
    }
}
