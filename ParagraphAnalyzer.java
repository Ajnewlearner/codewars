import java.util.Scanner;

public class ParagraphAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph (type 'END' on a new line to finish):");

        StringBuilder paragraph = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).equals("END")) {
            paragraph.append(line).append("\n");
        }

        int lineCount = paragraph.toString().split("\n").length;
        int wordCount = paragraph.toString().split("\\s+").length;
        int charCount = paragraph.toString().replaceAll("\s", " ").length();

        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters (excluding spaces): " + charCount);

        scanner.close();
    }
}
