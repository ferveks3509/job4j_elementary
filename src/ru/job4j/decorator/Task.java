package ru.job4j.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        Developer developer1 = new SeniorJavaDeveloper(developer);
        Developer developer2 = new JavaTeamLead(developer1);
        System.out.println(developer.makeJob());
        System.out.println(developer1.makeJob());
        System.out.println(developer2.makeJob());

    }
}
