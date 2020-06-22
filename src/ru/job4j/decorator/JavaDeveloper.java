package ru.job4j.decorator;

public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write Java Code.";
    }
}
