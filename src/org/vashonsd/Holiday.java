package org.vashonsd;

public class Holiday {
    int month;
    int dayOfMonth;
    String name;
    String description;
    boolean federallyRecognized;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public boolean isFederallyRecognized() {
        return federallyRecognized;
    }

    public void setFederallyRecognized(boolean federallyRecognized) {
        this.federallyRecognized = federallyRecognized;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public void createHoliday(int month, int dayOfMonth, String name, String description, boolean federallyRecognized){
        System.out.println(name + " is on " + month + "/" + dayOfMonth + "." + " \nDescription: " + description + "\nFederally Recongnized? " + federallyRecognized);
    }
    public void celebrate(String celebration){
        System.out.println(celebration);
    }

}
