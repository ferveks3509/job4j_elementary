package ru.job4j.decorator;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String secdWeekReport() {
        return " Send Week report to customer.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + secdWeekReport();
    }
}
