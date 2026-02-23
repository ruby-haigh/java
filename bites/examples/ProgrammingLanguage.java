package bites.examples;

public class ProgrammingLanguage {
    String name;
    Integer yearOfCreation;
    String creator;

    public ProgrammingLanguage(String name, Integer yearOfCreation, String creator) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;
    }

    public String getName() {
        return this.name;
    }

    public Integer getYear() {
        return this.yearOfCreation;
    }

    public String getCreator() {
        return this.creator;
    }

    public static void main(String[] args) {
        ProgrammingLanguage python = new ProgrammingLanguage("Python", 1991, "Guido van Rossum");
        ProgrammingLanguage java = new ProgrammingLanguage("Java", 1995, "James Gosling");
        ProgrammingLanguage C = new ProgrammingLanguage("C", 1972, "Dennis Ritchie");

        System.out.println(python.getName());
        System.out.println(python.getYear());
        System.out.println(python.getCreator());
        System.out.println("##################");
        System.out.println(java.getName());
        System.out.println(java.getYear());
        System.out.println(java.getCreator());
        System.out.println("##################");
        System.out.println(C.getName());
        System.out.println(C.getYear());
        System.out.println(C.getCreator());
    }
}
