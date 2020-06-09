package ru.job4j.ex;

public class ElementNotFoundException extends java.lang.Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException();
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] arr = new String[] {"java", "python", "ruby"};
        String key = "1";
        try {
            indexOf(arr, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

