package org.danny;

import java.util.function.Function;

public class MyList<T> {

    /**
     * List factory
     *
     * @param elements
     * @param <T>
     * @return new list
     */
    public static <T> MyList<T> of(T... elements) {
        MyList<T> result = new MyList<>();

        for (T element : elements) {
            result.append(element);
        }

        return result;
    }

    /**
     * This method converts list to String
     *
     * @return converted string
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        if (head != null) {
            MyListElement<T> nextElem = head;
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
    boolean isEmpty() {
        return head == null;
    }

    /**
     * Checks for list size
     *
     * @return list size
     */
    public int cleverSize() {
        if (this.isEmpty()) {
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
        MyListElement<T> cursor = head;

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
    public void append(T elem) {

        MyListElement<T> last = last();

        MyListElement<T> newElem = new MyListElement<T>();
        newElem.value = elem;

        if (last == null) {
            this.head = newElem;
        } else {
            last.next = newElem;
        }
    }

    public MyListElement<T> head = null;

    /**
     * Identifies last element in list
     *
     * @return last element
     */
    private MyListElement<T> last() {
        if (head == null)
            return null;

        MyListElement<T> nextElem = head;

        while (nextElem.next != null) {
            nextElem = nextElem.next;
        }
        return nextElem;
    }


    /**
     * Identifies last element in list
     *
     * @return last element
     */
    public MyListElement<T> smartLast() {
        if (this.isEmpty()) {
            return null;
        } else if (this.rest().isEmpty()) {
            return this.head;
        } else {
            return this.rest().smartLast();
        }
    }


    /**
     * removes element from list
     *
     * @param elem
     */
    public void remove(MyListElement<T> elem) {

        MyListElement<T> prev = head;

        while (prev != null) {
            if (prev.next == elem) {
                // found it!
                prev.next = elem.next;
            } else {
                prev = prev.next;
            }
        }
    }

    /**
     * finds element in list
     *
     * @param index
     * @return reference
     */

    public MyListElement<T> get(int index) { // when asked for index 0, return head, if none exist return null (request for 5 with only 3 elements)

        MyListElement<T> reference = head;

        for (int i = 0; i < index; i++) {
            if (reference == null) {
                return null;
            }
            reference = reference.next;
        }
        return reference;
    }


    /**
     * creates a new list made of rest of instance list (after head)
     *
     * @return rest
     */
    public MyList<T> rest() {

        MyList<T> rest = new MyList<>();

        rest.head = this.head.next;

        return rest;
    }

    /**
     * Adds element to beginning of list
     *
     * @param elem
     * @return this (instance)
     */

    public MyList<T> push(MyListElement<T> elem) {

        if (head == null) {
            this.head = elem;
            elem.next = null;
        } else {
            elem.next = head;
            this.head = elem;
        }

        return this;
    }

    public MyList<T> push(T value) {
        MyListElement<T> element = new MyListElement<>();
        element.value = value;

        return push(element);
    }


    /**
     * Reverses list
     *
     * @return reversed
     */
    public MyList reverse() {

        MyList reversed = new MyList();

        MyListElement<T> nextElem = head;
        reversed.push(nextElem.clone());

        while (nextElem.next != null) {
            nextElem = nextElem.next;
            reversed.push(nextElem.clone());
        }

        return reversed;
    }


    /**
     * Reverses list
     *
     * @return reversed
     */

    public MyList smartReverse() {

        MyList reversed = new MyList();

        if (this.isEmpty()) {
            return reversed;
        } else {
            reversed = rest().smartReverse();
            reversed.append(head.value);
            return reversed;
        }
    }


    /**
     * Checks if list contains a value
     *
     * @param value
     * @return contains
     */
    public Boolean contains(T value) {
        Boolean contains = false;

        for (Integer i = 0; i < this.size(); i++) {
            if (this.get(i).value == value) {
                contains = true;
                break;
            }
        }

        return contains;
    }


    /**
     * Checks if list contains a value
     *
     * @param value
     * @return contains
     */
    public Boolean smartContains(T value) {
        Boolean contains = false;
        MyListElement<T> cursor = this.head;

        while (cursor != null) {
            if (cursor.value == value) {
                contains = true;
                break;
            }
            cursor = cursor.next;
        }
        return contains;
    }


    /**
     * Checks if list contains a specific value
     *
     * @param value
     * @return true/false
     */
    public Boolean recursiveContains(T value) {
        if (this.isEmpty()) {
            return false;
        } else {
            return this.head.value == value || this.rest().recursiveContains(value);
        }
    }


    /**
     * Checks if list contains a value that matches a condition
     *
     * @param condition
     * @return result
     */
    public Boolean any(Function<T, Boolean> condition) {
        Boolean result = false;

        for (Integer i = 0; i < this.size(); i++) {
            if (condition.apply(this.get(i).value)) {
                result = true;
                break;
            }
        }
        return result;
    }


    /**
     * Checks if list contains a value that matches a condition
     *
     * @param condition
     * @return result
     */
    public Boolean smartAny(Function<T, Boolean> condition) {
        Boolean result = false;

        MyListElement<T> cursor = this.head;

        while (cursor != null) {
            if (condition.apply(cursor.value)) {
                result = true;
            }
            cursor = cursor.next;
        }

        return result;
    }


    /**
     * Checks if list contains a value that matches a condition
     *
     * @param condition
     * @return true/false
     */
    public Boolean recursiveAny(Function<T, Boolean> condition) {
        if (this.isEmpty()) {
            return false;
        } else {
            return condition.apply(this.head.value) || this.rest().recursiveAny(condition);
        }
    }


    /**
     * Checks if all values in list match a condition
     *
     * @param condition
     * @return true/false
     */
    public Boolean all(Function<T, Boolean> condition) {
        MyListElement<T> cursor = this.head;

        while (cursor != null) {
            if (!condition.apply(cursor.value)) {
                return false;
            }
            cursor = cursor.next;
        }
        return true;
    }


    /**
     * Applies the mapper to every element in the list and returns a list containing
     * the results in application order.
     *
     * @param mapper
     * @param <V>
     * @return result
     */
    public <V> MyList<V> map(Function<T, V> mapper) {
        MyList<V> result = new MyList<>();

        MyListElement<T> cursor = this.head;

        while (cursor != null) {
            result.append(mapper.apply(cursor.value));
            cursor = cursor.next;
        }

        return result;
    }

    /**
     * Applies the mapper to every element in the list and returns a list containing
     * the results in application order.
     *
     * @param mapper
     * @param <V>
     * @return *see above*
     */
    public <V> MyList<V> recursiveMap(Function<T, V> mapper) {
        if (this.isEmpty()) {
            return new MyList<>();
        } else {
            return this.rest().recursiveMap(mapper)
                    .push(mapper.apply(this.head.value));
        }

    }


    /**
     * Returns a list that contains the first n elements in instance list
     * If n is greater that instance list, returns instance list.
     * if n <= 0, returns empty list.
     *
     * @param n
     * @return result
     */
    public MyList<T> take(int n) {
        MyList<T> result = new MyList<>();

        MyListElement<T> cursor = this.head;

        for (int i = 0; i < n && cursor != null; i++) {
            result.append(cursor.value);
            cursor = cursor.next;
        }
//
//
//        ***** COULD'VE DONE THIS *****
//
//        for (int i = 0; i < n; i++){
//            if (cursor != null){
//                result.append(cursor.value);
//                cursor = cursor.next;
//            } else {
//                break;
//            }
//        }
//
//        ***** OR *****
//
//        int counter = 0;
//
//        if (n <= 0){
//          return result;
//        }
//
//        while (cursor != null) {
//            result.append(cursor.value);
//            cursor = cursor.next;
//            counter++;
//            if (counter == n) {
//                return result;
//            }
//        }

        return result;
    }

    public MyList<T> takeWhile(Function<T, Boolean> condition){
        MyList<T> result = new MyList<>();

        MyListElement<T> cursor = this.head;

        while (cursor != null && condition.apply(cursor.value)){
            result.append(cursor.value);
            cursor = cursor.next;
        }
        return result;
    }

    public MyList<T> filter(Function<T, Boolean> condition){
        MyList<T> result = new MyList<>();

        MyListElement<T> cursor = this.head;

        while (cursor != null) {
            if (condition.apply(cursor.value)){
                result.append(cursor.value);
            }
            cursor = cursor.next;
        }
        return result;
    }

}














