package main;

import entities.Author;
import entities.Book;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Book> books;
        books = new ArrayList<>();
        int menu;

        do {
            menu = 0;
            try {

                menu = Integer.parseInt(JOptionPane.showInputDialog("========= Library ========="
                        + "\nSelect a menu:"
                        + "\n 1- Add books"
                        + "\n 2- Borrow books"
                        + "\n 3- List of books"));

            } catch (HeadlessException | NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Exiting");

            }

            switch (menu) {
                case 1:
                    books.add(insertBook());
                    break;
                case 2:
                    borrowBook(books);
                    break;
                case 3:
                    listOfBooks(books);
                    break;
                default:
                    if (menu != 0) {
                        JOptionPane.showMessageDialog(null, "Not found");
                    }
                    break;

            }

        } while (menu != 0);
    }

    public static void listOfBooks(List<Book> books) throws HeadlessException {
        books.forEach((book) -> {
            JOptionPane.showMessageDialog(null, book);
        });
    }

    public static boolean borrowBook(List<Book> books) throws HeadlessException {

        var title = JOptionPane.showInputDialog("Enter the title of book");

        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setSituation("Borrowed");
                JOptionPane.showMessageDialog(null, "Successfully borrowed");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Not found");
        return false;
    }

    public static Book insertBook() {

        var title = JOptionPane.showInputDialog("Enter the title of book");
        var year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year of book"));
        var publishingCompany = JOptionPane.showInputDialog("Enter the publishing company of book");
        var name = JOptionPane.showInputDialog("Enter the name of author");
        var birth = Integer.parseInt(JOptionPane.showInputDialog("Enter the birth of author"));

        Author autor = new Author(birth, name);

        Book book = new Book(year, autor, title, publishingCompany);

        return book;
    }
}
