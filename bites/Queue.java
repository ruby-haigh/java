package bites;

import java.util.ArrayList;

public class Queue {
    ArrayList<String> people;

    public Queue() {
        this.people = new ArrayList<>();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("Fred");
        queue.add("Barry");
        queue.add("Peter");
        System.out.println(queue.next());
        System.out.println(queue.state());

    }

    public void add(String person) {
        this.people.add(person);
    }

    public String next() {
        String nextPerson = this.people.get(0);
        this.people.remove(0);
        return nextPerson;
    }

    public ArrayList<String> state() {
        return this.people;
    }


}
