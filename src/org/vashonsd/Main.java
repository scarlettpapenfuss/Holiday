package org.vashonsd;

public class Main {

    public static void main(String[] args) {
        Holiday christmas = new Holiday();
        christmas.createHoliday(12,25, "Christmas","Get presents and spend time with family and Santa" , true );
        christmas.celebrate("Merry Christmas");

        Holiday halloween = new Holiday();
        halloween.createHoliday(10,31,"Halloween" , "Get candy from strangers", true);
        halloween.celebrate("Happy Halloween.");

    }
}
