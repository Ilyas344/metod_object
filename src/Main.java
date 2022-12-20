public class Main {

    public static void main(String[] args) {
        Author george = new Author("George", "Martin");
        Author philip = new Author("Philip", "Pullman");
        Book bookOne = new Book("Темные начала", 1995, philip);
        Book bookTwo = new Book("Игра престолов", 1996, george);
        System.out.println("Author = " + philip.getName() + " " + philip.getSurname()
                + " Книга " + bookOne.getBookName() + " Год издания " + bookOne.getPublishingYear());

        System.out.println("Author = " + george.getName() + " " + george.getSurname()
                + " Книга " + bookTwo.getBookName() + " год издания " + bookTwo.getPublishingYear());

        bookOne.setPublishingYear(1997);
        bookTwo.setPublishingYear(1999);

        System.out.println("Измененный год = " + bookOne.getPublishingYear());
        System.out.println("Измененный год = " + bookTwo.getPublishingYear());

    }
}