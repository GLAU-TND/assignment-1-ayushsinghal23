package linkedlist;

import node.Node;
import person.Person;

public class LinkedlistImplement {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        return (first == null && last == null);
    }

    public void addLast(Person p) {
        Node node = new Node(p);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public int indexOf(String firstName) {
        Node currently = first;
        int response = 0;
        while (currently != null) {
            if (currently.getData().getFirstName().equals(firstName)) {
                return response;
            }
            response++;
            currently = currently.getNext();
        }
        return -1;
    }


    public void addFirst(Person p) {
        Node node = new Node(p);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.setNext(first);
            first = node;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("list is already empty");
        } else if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.getNext();
        }
    }

    private Node getPreviousNode(Node node) {
        Node current = first;
        while (current.getNext() != node) {
            current = current.getNext();
        }
        return current;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("list is already empty");
        } else if (first == last) {
            first = null;
            last = null;
        } else {
            last = getPreviousNode(last);
            last.setNext(null);
        }
    }

    public void deleteNode(int position) {
        if (first == null) {
            System.out.println("no node ");
        }
        Node temp = first;
        if (position == 0) {
            removeFirst();
        }
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.getNext();
        if (temp == null || temp.getNext() == null)
            return;
        Node next = temp.getNext().getNext();
        temp.setNext(next);
    }

    public int sizeOfContactList() {
        Node current = first;
        int index = 1;
        while (current.getNext() != null) {
            current = current.getNext();
            index++;
        }
        return index;
    }

    public void displayList() {
        Node current = first;
        System.out.println("Contact list--->");
        System.out.println();
        while (current != null) {
            System.out.println("-----------------------*-------------------------");
            System.out.println("Name:" + current.getData().getFirstName() + " " + current.getData().getLastName());
            System.out.println("Contacts:" + current.getData().getContactlist().toString());
            System.out.println("Email:" + current.getData().getEmail());
            System.out.println("------------------------*-------------------------");
            System.out.println();
            current = current.getNext();
        }
        System.out.println();
    }

    public void displayOne() {
        Node current = first;
        int count = 0;
        System.out.println("-----------------------*-------------------------");
        while (current != null) {
            System.out.println(count + " Name:" + current.getData().getFirstName() + " " + current.getData().getLastName());
            current = current.getNext();
            count++;
        }
        System.out.println("------------------------*-------------------------");
        System.out.println();
    }

    public void getNode(int pos) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (index == pos) {
                System.out.println();
                System.out.println("-----------------------*-------------------------");
                System.out.println("Name:" + current.getData().getFirstName() + " " + current.getData().getLastName());
                System.out.println("Contacts:" + current.getData().getContactlist().toString());
                System.out.println("Email:" + current.getData().getEmail());
                System.out.println("------------------------*-------------------------");
                System.out.println();
                break;
            }
            index++;
            current = current.getNext();
        }
    }
}