package bites.examples;
import java.util.ArrayList;

public class LeapYears {
    public static Boolean isLeap(int year) {
//        if (year % 400 == 0) {
//            return true;
//        }else if (year % 100 == 0) {
//            return false;
//        }else if (year % 4 == 0) {
//            return true;
//        }else {
//            return false;
//        }
        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }

    public static ArrayList<Integer> leapYearsBetween(int startYear, int endYear){
        ArrayList<Integer> leapYears = new ArrayList<Integer>();

        for (int years = startYear; years <= endYear; years++){
            if (isLeap(years)) {
                leapYears.add(years);
            }
        }
        return leapYears;
    }

    public static int closestLeapYearTo(int year){
        if(isLeap(year)) {
            return year;
        }

        int difference = 1;

        while (true){
            if (isLeap(year - difference)) { //check years before incrementally
                return year - difference;
            }

            if (isLeap(year + difference)){ //check years after incrementally
                return year + difference;
            }
            difference++;
        }

    }

    public static void main(String[] args) {
        System.out.println(isLeap(2000));
        System.out.println(isLeap(1970));
        System.out.println(isLeap(1900));
        System.out.println(isLeap(1988));
        System.out.println(isLeap(1500));
        System.out.println("==========================");

        System.out.println(leapYearsBetween(1999, 2001));
        System.out.println(leapYearsBetween(1987, 2001));
        System.out.println("==========================");
        System.out.println(closestLeapYearTo(1999));
        System.out.println(closestLeapYearTo(2001));
    }



}