package com.company.weekEight;

import java.io.*;
import java.util.*;


public class Books {
    public static void main(String args[]) throws IOException {
        String FILE_PATH = "G:\\bansodeshreyas\\Java Assignments\\src\\com\\company\\weekEight\\book.dat";
        File file = new File(FILE_PATH);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        Scanner input = new Scanner(System.in);

        if (randomAccessFile.length() > 0) {
            ArrayList<Book> books = new ArrayList<>();
            while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
                books.add(Book.getInstance(randomAccessFile.readLine()));
            }

            while (true) {
                System.out.println("Enter choice:\n1.Search by name\n2.Display All");
                switch (input.nextInt()) {

                    case 1: {
                        System.out.println("Enter book name");
                        System.out.println(Book.search(books, input.next()));
                        break;
                    }
                    case 2: {
                        Book.display(books);
                        break;
                    }
                }
            }
        } else {
            System.out.println("no records");
        }
    }
}

class Book {
    public int id;
    public String name;
    public int price;
    public String quantity;

    public Book(int id, String name, int price, String quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    static Book getInstance(String line) {
        String[] columns = line.split(" ");
        if (columns.length == 4) {
            return new Book(Integer.parseInt(columns[0]), columns[1], Integer.parseInt(columns[2]), columns[3]);
        }
        System.out.println("Invalid format of data");
        return null;
    }

    static String search(ArrayList<Book> books, String name) {

        for (Book book : books) {
            if (book.name.equals(name)) {
                return "Result: " + book;
            }
        }
        return name + " Not found";
    }

    static void display(ArrayList<Book> books) {
        int totalCost = 0;
        for (Book book : books) {
            System.out.println(book);
            totalCost+=book.price;
        }
        System.out.println("Total cost:"+totalCost);
    }

    @Override
    public String toString() {
        return "\tBook" +
                "\tid:" + id +
                "\tname:" + name +
                "\tprice=" + price +
                "\tquantity=" + quantity;
    }
}
