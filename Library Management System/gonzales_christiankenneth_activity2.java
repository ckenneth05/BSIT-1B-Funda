import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gonzales_ChristianKenneth_Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Book> bookMap = new HashMap<>();

        bookMap.put("Book1", new Book("C++ for Beginners", 2, false, null));
        bookMap.put("Book2", new Book("Java Programming Language", 1, false, null));
        bookMap.put("Book3", new Book("Web Development using PHP and MySQL", 2, false, null));
        bookMap.put("Book4", new Book("HTML and CSS: Creating a Website from Scratch", 2, false, null));
        bookMap.put("Book5", new Book("Kali Linux Tutorial", 3, false, null));
        bookMap.put("Book6", new Book("Python for Beginners", 1, false, null));
        bookMap.put("Book7", new Book("Heads up Java", 2, false, null));
        bookMap.put("Book8", new Book("Raspberry Pi guide", 2, false, null));
        bookMap.put("Book9", new Book("Arduino Geeks for Geeks", 2, false, null));
        bookMap.put("Book10", new Book("One on One: Java Advance Book", 2, false, null));

        System.out.println("***Welcome to CK'S Library!***");

        while (true) {
            System.out.println("Enter 1 to Borrow a book");
            System.out.println("Enter 2 to Return a book");
            System.out.println("Enter 3 to Search for a book");
            System.out.println("Enter 4 to Quit");

            int user_choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (user_choice) {
                case 1:
                    borrowBook(scanner, bookMap);
                    break;
                case 2:
                    returnBook(scanner, bookMap);
                    break;
                case 3:
                    searchBook(scanner, bookMap);
                    break;
                case 4:
                    System.out.println("Thank you for using my system");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    private static void borrowBook(Scanner scanner, Map<String, Book> bookMap) {
        System.out.println("Enter the book title:(ex.Book1,Book2,etc.)");
        String bookTitle = scanner.nextLine();

        Book book = bookMap.get(bookTitle);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (book.getCopies() > 0 && !book.isBorrowed()) {
            book.setBorrowed(true);
            book.setCopies(book.getCopies() - 1);
            System.out.println("Enter the borrow due date(ex. 2023-12-31):");
            String dueDate = scanner.nextLine();
            book.setDueDate(dueDate);
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book not available!");
        }
    }

    private static void returnBook(Scanner scanner, Map<String, Book> bookMap) {
        System.out.println("Enter the book title:(ex.Book1,Book2,etc.)");
        String bookTitle = scanner.nextLine();

        Book book = bookMap.get(bookTitle);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (book.isBorrowed()) {
            System.out.println("Enter the return date(ex. 2023-12-31):");
            String returnDate = scanner.nextLine();
            String dueDate = book.getDueDate();
            if(returnDate.compareTo(dueDate) > 0) {
                System.out.println("Late return!");
            }
            book.setBorrowed(false);
            book.setCopies(book.getCopies() + 1);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book is not borrowed!");
        }
    }

    private static void searchBook(Scanner scanner, Map<String, Book> bookMap) {
        System.out.println("Enter the book title:(ex. Book1,Book2,etc.)");
        String bookTitle = scanner.nextLine();

        Book book = bookMap.get(bookTitle);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        System.out.println("Book Found:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Copies: " + book.getCopies());
        System.out.println("Borrowed: " + (book.isBorrowed() ? "Yes" : "No"));
    }
}

class Book {
    private String title;
    private int copies;
    private boolean isBorrowed;
    private String dueDate;

    public Book(String title, int copies, boolean isBorrowed, String dueDate) {
        this.title = title;
        this.copies = copies;
        this.isBorrowed = isBorrowed;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}