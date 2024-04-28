package by.itstep.goutor.finaloopproject.util;

import by.itstep.goutor.finaloopproject.model.entity.Person;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class PersonXMLSerializer {
    public static void serializer(String fileName, Person[] persons) {
        try (XMLEncoder stream = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(fileName)))) {

            for (int i = 0; i < persons.length; i++) {
                stream.writeObject(persons[i]);
            }

            stream.flush();
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }

    public static Person deserializer(String filename) {
        Person person = null;
        try (XMLDecoder stream = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)))) {
            person = (Person) stream.readObject();
        } catch (IOException exception) {
            System.out.println(exception);
        }
        return person;
    }
}
