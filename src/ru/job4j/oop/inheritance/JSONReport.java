package ru.job4j.oop.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return   "{" + System.lineSeparator() + "name: " +  name
                + System.lineSeparator() + "body " + body + System.lineSeparator() + "}";
    }

    public static void main(String[] args) {
        JSONReport one = new JSONReport();
        String rsl = one.generate("project", "text");
        System.out.println(rsl);
    }
}
