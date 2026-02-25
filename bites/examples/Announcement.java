package bites.examples;

//public class Announcement {
//    public static void celebration(String message) {
//        System.out.println("Next announcement: " + message);
//    }
//    public static void main(String[] args) {    #playing with passing in command line arguments
//        for (String arg : args) {
//            Announcement.celebration(arg);
//        }
//    }
//}
public class Announcement {
    public static String celebration() {
        return "Congratulations!";
    }
    public static String changeOfPlan() {
        return "I took a wrong turn on the way and now I'm in France! La semaine prochaine?";
    }
    public static String apology() {
        return "So sorry I mistook your baby for a rabbit";
    }
    public static String politeNotice() {
        return "Please stop drinking my cup of tea";
    }
    public static String helpNeeded() {
        return "Help I've eaten all the cheese!";
    }
    public static void main(String[] args) {
        System.out.println(Announcement.celebration());
        System.out.println(Announcement.changeOfPlan());
        System.out.println(Announcement.apology());
        System.out.println(Announcement.politeNotice());
        System.out.println(Announcement.helpNeeded());
    }
}