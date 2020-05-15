package ru.job4j.oop.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 100);
        Book book2 = new Book("java", 200);
        Book book3 = new Book("python", 300);
        Book book4 = new Book("ruby", 300);

        Book[] arr = new Book[4];
        arr[0] = book1;
        arr[1] = book2;
        arr[2] = book3;
        arr[3] = book4;

        for (int i = 0; i < arr.length; i++) {
            Book rsl = arr[i];
            System.out.println(rsl.getName() + " - " + rsl.getPage());
        }
        System.out.println();
        Book temp = new Book("temp", 0);
        temp = arr[0];
        arr[0] = arr[3];
        arr[3] = temp;

        for (int i = 0; i < arr.length; i++) {
            Book rsl = arr[i];
            System.out.println(rsl.getName() + " - " + rsl.getPage());
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            Book rsl = arr[i];
            if (rsl.getName().equals("Clean code")) {
                System.out.println(rsl.getName() + " - " + rsl.getPage());
            }
        }
    }
}
