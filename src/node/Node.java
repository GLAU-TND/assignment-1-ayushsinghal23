package node;

import person.Person;

public class Node {
    Person data;
    Node next;

    public Node(Person data) {
        this.data = data;
    }

    public Person getData() {
        return data;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
