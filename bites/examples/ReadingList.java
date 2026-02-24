package bites.examples;

public class ReadingList {
    String[] unread = new String[4];//{"test", null, null, null};//

    private void add(String bookTitle) {

        for (Integer index = 0; index < unread.length; index ++) {
            if(unread[index] == null) {
                unread[index] = bookTitle;
                break;
            }
        //Boolean flag = true;
        //Integer index = 0;

//        while (flag) {
//            if (unread[index] == null) {
//                unread[index] = bookTitle;
//                flag = false;
//            }
//            else {
//                index ++;
//            }
        }

    }
    public static void main(String[] args) {
        ReadingList readingList = new ReadingList();
        readingList.add("Leviathon Wakes");
        readingList.add("The Martian");
        System.out.println(readingList.unread[0]);
        System.out.println(readingList.unread[1]);
        System.out.println(readingList.unread[2]);
        System.out.println(readingList.unread[3]);
    }
}
