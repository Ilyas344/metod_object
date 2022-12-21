public class Main {

    public static void main(String[] args) {
        Author george = new Author("Джордж", "Мартин");
        Author george2 = new Author("Джордж", "Мартин");
        Author philip = new Author("Филипп", "Пульман");
        Book bookOne = new Book("Темные начала", 1995, philip);
        Book bookTwo = new Book("Игра престолов", 1996, george);
        Book bookThre = new Book("Игра престолов", 1996, philip);
        Book bookFor = new Book("Игра престолов", 1996, george2);
        System.out.println(bookOne);
        System.out.println(bookTwo);
        bookOne.setPublishingYear(1997);
        bookTwo.setPublishingYear(1999);
        System.out.println("Измененный год = " + bookOne.getPublishingYear());
        System.out.println("Измененный год = " + bookTwo.getPublishingYear());
        System.out.println(bookOne);
        System.out.println(bookTwo);
        System.out.print("Одинаковые книги: " + bookTwo.getBookName() + " и " + bookThre.getBookName() + " ");
        System.out.println(bookThre.equals(bookTwo));
        System.out.print("Одинаковые книги: " + bookTwo.getBookName() + " и " + bookFor.getBookName() + " ");
        System.out.println(bookFor.equals(bookTwo));
        System.out.print("Имена авторов совпадают ");
        System.out.println(george.equals(george2));


    }
}