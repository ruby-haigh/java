package bites.examples;

public interface GenericDiary {
    void addEntry(String entry);
    void removeEntry(int index);
    String readEntry(int index);
}
