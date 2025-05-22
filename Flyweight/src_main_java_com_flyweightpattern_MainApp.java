package com.flyweightpattern;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/qscOsQV-K14
     */
    private static final int BOOK_TYPES = 2;
    private static final int BOOKS_TO_INSERT = 100;

    public static void main(String[] args) {

        Store store = new Store();
        for (int i = 0; i < BOOKS_TO_INSERT / BOOK_TYPES; i++) {
            store.storeBook(getRandomName(), getRandomPrice(), "Math", "NXB BGD", "200 trang");
            store.storeBook(getRandomName(), getRandomPrice(), "Novel", "William", "1024 trang");
        }
        store.displayBooks();
        System.out.println(BOOKS_TO_INSERT + " quyển sách đã được thêm");
        System.out.println("==========================================");
        System.out.println("Memory Usage: ");
        System.out.println("Book Size (20 bytes) * " + BOOKS_TO_INSERT + " + BookTypes Size (30 bytes) * " + BOOK_TYPES + "");
        System.out.println("==========================================");
        System.out.println("Total: " + ((float)(BOOKS_TO_INSERT * 20 + BOOK_TYPES * 30) / 1024 / 1024) + "MB (instead of " + ((float)(BOOKS_TO_INSERT * 50) / 1024 / 1024) + "MB)");

    }

    private static String getRandomName() {
        List<String> books = Arrays.asList("book_1", "book_2", "book_3", "book_4", "book_5", "book_6", "book_7", "book_8", "book_9", "book_10");
        return books.get(new Random().nextInt(books.size()));
    }

    private static int getRandomPrice() {
        return new Random().nextInt(1000);
    }

}

