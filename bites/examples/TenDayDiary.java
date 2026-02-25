package bites.examples;

public class TenDayDiary implements GenericDiary {

    String[] entries = new String[10];
//    public TenDayDiary(String[] entries) {
//        this.entries = entries;
//    }

    public static void main(String[] args) {
        TenDayDiary diary = new TenDayDiary();
        diary.addEntry("hello");
        diary.addEntry("goodbye");
        System.out.println(diary.readEntry(1));
        diary.removeEntry(0);
        System.out.println(diary.readEntry(1));
    }

    @Override
    public void addEntry(String entry) {
        for (Integer index = 0; index < this.entries.length; index ++) {
            if(this.entries[index] == null) {
                this.entries[index] = entry;
                break;
            }
        }
    }

    @Override
    public void removeEntry(int index) {
        this.entries[index] = null;
    }

    @Override
    public String readEntry(int index) {
        return this.entries[index];
    }

}
