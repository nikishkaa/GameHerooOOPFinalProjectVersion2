package by.itstep.goutor.finaloopproject.model.entity.container;

import by.itstep.goutor.finaloopproject.model.entity.Person;

public class Army {
    private static final int DEFAULT_SIZE = 10;
    public static final int FINAL_STAT = 3;

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
}
