package org.danny;

public class MyListOfStrings {


    /**
     * This method converts list to String
     *
     * @return converted string
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        if (head != null) {
            MyStringListElement nextElem = head;
            sb.append(" " + nextElem.value + " ");
            while (nextElem.next != null) {
                nextElem = nextElem.next;
                sb.append(" " + nextElem.value + " ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    /**
     * Checks if list is empty
     *
     * @return True if list is empty
     */
    boolean isEmpty(){
        return head == null;
    }

    /**
     * Checks for list size
     *
     * @return list size
     */
    public int cleverSize(){
        if (this.isEmpty()){
            return 0;
        } else {
            return 1 + this.rest().cleverSize();
        }
    }

    /**
     * Checks for list size
     *
     * @return list size
     */
    public int size() {
        MyStringListElement cursor = head;

        int i;
        for (i = 0; cursor != null; i++) {
            cursor = cursor.next;
        }

        return i;
    }

    /**
     * Appends to list
     *
     * @param elem
     */
    public void append(String elem) {

        MyStringListElement last = last();

        MyStringListElement newElem = new MyStringListElement();
        newElem.value = elem;

        if (last == null) {
            this.head = newElem;
        } else {
            last.next = newElem;
        }
    }

    public MyStringListElement head = null;

    /**
     *
     *
     * @return
     */
    private MyStringListElement last() {
        if (head == null)
            return null;

        MyStringListElement nextElem = head;

        while (nextElem.next != null) {
            nextElem = nextElem.next;
        }
        return nextElem;
    }

    public MyStringListElement smartLast(){
        if (this.isEmpty()){
            return null;
        } else if (this.rest().isEmpty()) {
            return this.head;
        } else {
            return this.rest().smartLast();
        }
    }

    public void remove(MyStringListElement elem) {
        MyStringListElement prev = head;
        while (prev != null) {
            if (prev.next == elem) {
                // found it!
                prev.next = elem.next;
            } else {
                prev = prev.next;
            }
        }
    }

    public MyStringListElement get(int index) { // when asked for index 0, return head, if none exist return null (request for 5 with only 3 elements)

        MyStringListElement reference = head;

        for (int i = 0; i < index; i++) {
            if (reference == null) {
                return null;
            }
            reference = reference.next;
        }
        return reference;
    }

    public MyListOfStrings rest(){

        MyListOfStrings rest = new MyListOfStrings();

        rest.head = this.head.next;

        return rest;
    }

    public void push(MyStringListElement elem){

        if (head == null){
            this.head = elem;
            elem.next = null;
        } else {
            elem.next = head;
            this.head = elem;
        }


    }

    public MyListOfStrings reverse(){

        MyListOfStrings reversed = new MyListOfStrings();

        MyStringListElement nextElem = head;
        reversed.push(nextElem.clone());

        while (nextElem.next != null) {
            nextElem = nextElem.next;
            reversed.push(nextElem.clone());
        }

        return reversed;
    }

    public MyListOfStrings smartReverse(){

        MyListOfStrings reversed = new MyListOfStrings();

        if (this.isEmpty()){
            return reversed;
        } else {
            reversed = rest().smartReverse();
            reversed.append(head.value);
            return reversed;
        }
    }
}




