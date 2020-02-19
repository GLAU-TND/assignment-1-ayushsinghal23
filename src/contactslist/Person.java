package contactslist;

import java.util.*;

public class Person {
    String first_name;
    String last_name;
    List<Long> contact_list = new ArrayList<>();
    String email;

    public Person(String first_name, String last_name, List<Long> contactlist, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.contact_list = contactlist;
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<Long> getContact_list() {
        return contact_list;
    }

    public void setContact_list(List<Long> contact_list) {
        this.contact_list = contact_list;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
