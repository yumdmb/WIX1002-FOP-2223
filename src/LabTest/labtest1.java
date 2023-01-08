package LabTest;

public class labtest1 {

    // Object variables
    private String author, title;
    private long ISBN;
    private boolean isValid;

    // Class-based variables
    static int authorMaxLength = 0, titleMaxLength = 0, ISBNMaxLength = 13;

    // Constructor
    public labtest1(String author, String title, String ISBN) {
        this.author = author;
        this.title = title;
        this.ISBN = Long.parseLong(ISBN);
        this.isValid = true;
    }

    // Static methods
    public static void setMaxLength(labtest1[] arr) {
        for (labtest1 elem: arr) {
            authorMaxLength = Math.max(authorMaxLength, elem.author.length());
            titleMaxLength = Math.max(titleMaxLength, elem.title.length());
        }
    }

    private static boolean isGreater(labtest1 elem1, labtest1 elem2, String by) {
        if (by.equalsIgnoreCase("author")) { return elem1.author.compareToIgnoreCase(elem2.author) > 0; }
        else if (by.equalsIgnoreCase("title")) { return elem1.title.compareToIgnoreCase(elem2.title) > 0; }
        else if (by.equalsIgnoreCase("ISBN")) { return elem1.ISBN > elem2.ISBN; }
        return false;
    }

    public static void sortArray(labtest1[] arr, String by) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean noSwap = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (isGreater(arr[j], arr[j + 1], by)) {
                    labtest1 temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp; 
                    noSwap = false;
                }
            }
            if (noSwap) { break; }
        }
    }

    public static void displayTable(labtest1[] arr, String by) {
        
        System.out.printf("Data (sorted by %s):\n", by);
        System.out.printf("┌%s┬%s┬%s┐\n", "─".repeat(authorMaxLength), "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength));
        System.out.printf("│Author%s│Title%s│ISBN%s│\n", " ".repeat(authorMaxLength - 6), " ".repeat(titleMaxLength - 5), " ".repeat(ISBNMaxLength - 4));
        System.out.printf("├%s┼%s┼%s┤\n", "─".repeat(authorMaxLength), "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength));

        for (labtest1 elem: arr) {
            System.out.printf(
                "│%s%s│%s%s│%s│\n", 
                elem.author, " ".repeat(authorMaxLength - elem.author.length()), 
                elem.title, " ".repeat(titleMaxLength - elem.title.length()), 
                elem.ISBN
            );
        }
        System.out.printf("└%s┴%s┴%s┘\n\n", "─".repeat(authorMaxLength), "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength));
    }

    // ISBN validation
    private static void checkISBN(labtest1[] arr) {
        for (labtest1 elem: arr) {
            int sum = 0;
            long isbn = elem.ISBN;
            while (isbn != 0) {
                sum += isbn % 10; isbn /= 10;
                sum += (isbn % 10) * 3; isbn /= 10;
            }
            elem.isValid = (sum % 10 == 0) ? true : false;
        }
    }

    public static void displayISBN(labtest1[] arr) {

        checkISBN(arr);

        System.out.println("Data (sorted by ISBN with validation):");
        System.out.printf("┌%s┬%s┬%s┐\n", "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength), "─".repeat(8));
        System.out.printf("│Title%s│ISBN%s│Validity│\n", " ".repeat(titleMaxLength - 5), " ".repeat(ISBNMaxLength - 4));
        System.out.printf("├%s┼%s┼%s┤\n", "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength), "─".repeat(8));

        for (labtest1 elem: arr) {
            System.out.printf(
                "│%s%s│%s│%s%s│\n", 
                elem.title, " ".repeat(titleMaxLength - elem.title.length()), 
                elem.ISBN,
                elem.isValid, " ".repeat(8 - String.valueOf(elem.isValid).length())
            );
        }
        System.out.printf("└%s┴%s┴%s┘\n\n", "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength), "─".repeat(8));
    }


    public static void main(String[] args) {
        
        // Initialize data entries
        labtest1[] data = {
            new labtest1("Daniel Liang", "Introduction to Java Programming", "9780136520238"),
            new labtest1("Cay Horstmann", "Core Java: Fundamentals", "9780135166307"),
            new labtest1("Joshua Block", "Effective Java", "9780134685991"),
            new labtest1("Herbert Schildt", "Java: A Beginner's Guide", "9781260440218"),
            new labtest1("Kathy Sierra", "Java : Head First", "9780596009206")
        };

        setMaxLength(data);

        // Sort by author
        sortArray(data, "author");
        displayTable(data, "author");

        // Sort by title
        sortArray(data, "title");
        displayTable(data, "title");

        // Sort by ISBN
        sortArray(data, "ISBN");
        displayISBN(data);
    }
}