package org.danny;

import java.util.function.Function;

public class MyList<T> {

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
     * @return
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

    public MyListElement<T> smartLast() {
        if (this.isEmpty()) {
            return null;
        } else if (this.rest().isEmpty()) {
            return this.head;
        } else {
            return this.rest().smartLast();
        }
    }

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

    public MyList rest() {

        MyList rest = new MyList();

        rest.head = this.head.next;

        return rest;
    }

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

    public Boolean recursiveContains(T value) {
        if (this.isEmpty()) {
            return false;
        } else {
            return this.head.value == value || this.rest().recursiveContains(value);
        }
    }

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

    public Boolean recursiveAny(Function<T, Boolean> condition) {
        if (this.isEmpty()) {
            return false;
        } else {
            return condition.apply(this.head.value) || this.rest().recursiveAny(condition);
        }
    }


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


    public <V> MyList<V> map(Function<T, V> mapper) {
        MyList<V> result = new MyList<>();

        MyListElement<T> cursor = this.head;

        while (cursor != null) {
            result.append(mapper.apply(cursor.value));
            cursor = cursor.next;
        }

        return result;
    }

//    public <V> MyList<V> recursiveMap(Function<T, V> mapper){
//        if (this.isEmpty()){
//            return new MyList<>();
//        } else {
//
//        }
//
//    }

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

}














