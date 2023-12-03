package P1;

import java.util.ArrayList;
import java.util.HashMap;

public class Books {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Amadoka");
        books.add("Nature of All Things");
        books.add("City of Girls");
        books.add("Kire Runner");
        books.add("Again and Again");

        HashMap<Integer, String> bookMap = createBookMap(books);

        System.out.println("HashMap based on list of books:");
        for (Integer index : bookMap.keySet()) {
            String book = bookMap.get(index);
            System.out.println("Index: " + index + ", Book: " + book);
        }
    }

    public static HashMap<Integer, String> createBookMap(ArrayList<String> books) {
        HashMap<Integer, String> bookMap = new HashMap<>();

        for (int i = 0; i < books.size(); i++) {
            bookMap.put(i, books.get(i));
        }

        return bookMap;
    }
}