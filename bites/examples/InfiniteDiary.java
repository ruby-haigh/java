package bites.examples;

import java.util.ArrayList;

public class InfiniteDiary implements GenericDiary{
    ArrayList<String> entries = new ArrayList<String>();

    public static void main(String[] args) {
        InfiniteDiary diary = new InfiniteDiary();
        diary.addEntry("hello");
        diary.addEntry("goodbye");
        System.out.println(diary.readEntry(1));
        diary.removeEntry(0);
        System.out.println(diary.readEntry(0));
    }
    @Override
    public void addEntry(String entry) {
        entries.add(entry);
    }

    @Override
    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String readEntry(int index) {
        return entries.get(index);
    }
}
