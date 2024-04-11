package by.itstep.goutor.finaloopproject.model.entity.container;

import by.itstep.goutor.finaloopproject.model.entity.Person;


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
        StringBuilder builder = new StringBuilder("\nList of person: \n");

        for (Person person : persons) {
            builder.append(person).append("\n");
        }

        return builder.toString();
    }
}
