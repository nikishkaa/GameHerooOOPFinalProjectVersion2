package by.itstep.goutor.finaloopproject.model.entity.container;

import by.itstep.goutor.finaloopproject.model.entity.Person;

import java.util.Arrays;

public class Army {
    private static final int DEFAULT_SIZE = 10;

    private Person[] persons;

    public Army() {
        persons = new Person[DEFAULT_SIZE];
    }

    public Army(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public int getSize() {
        return persons.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of person: \n");

        for (int i = 0; i < persons.length; i++) {
            builder.append(persons[i]).append("\n");
        }

        return builder.toString();
    }
}
