package person;

import java.util.LinkedList;

public class Person {
    private String firstName;
    private String lastName;
    private LinkedList<String> contactlist;
    private String email;

    public Person(String firstName, String lastName, LinkedList<String> contactlist, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactlist = contactlist;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedList<String> getContactlist() {
        return contactlist;
    }

    public void setContactlist(LinkedList<String> contactlist) {
        this.contactlist = contactlist;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}