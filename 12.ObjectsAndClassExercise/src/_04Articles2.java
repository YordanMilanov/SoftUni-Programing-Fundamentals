import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];
            Article article = new Article(title, content, author);
            articles.add(article);
        }
        String input = scanner.nextLine();
        if (input.equals("title") || input.equals("content") || input.equals("author")) {
            System.out.println(articles.toString().replace(",", "")
                    .replace("[", "")
                    .replace("]", "")
                    .replace(", ", ""));
        }
    }

    private static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s%n", this.title, this.content, this.author)
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", "")
                    .replace(", ", "");
        }
    }
}




