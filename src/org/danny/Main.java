package org.danny;

public class Main {

    public static void main(String[] args) {

//        MyListOfStrings myList = new MyListOfStrings();
//
//        System.out.println(myList.toString());
//
//        myList.append("1");
//
//        System.out.println(myList.toString());
//
//        myList.append("2");
//
//        System.out.println(myList.toString());
//
//        myList.append("3");
//
//        System.out.println(myList.toString());
//
//        MyStringListElement second = myList.head.next;
//
//        System.out.println("Rest list is: " + myList.rest().toString());
//
//        System.out.println("Rest of rest list is: " + myList.rest().rest());
//
//        System.out.println("Rest of rest of rest list is: " + myList.rest().rest().rest());
//
//        System.out.println("Rest of rest of rest of rest list is: " + myList.rest().rest().rest().rest()); // Null pointer exception!!!
//
//        myList.remove(second);
//
//        System.out.println(myList.toString());
//
//        System.out.println(myList.get(0).value); // should print "1"
//
//        System.out.println(myList.get(1).value);
//
//        System.out.println((myList.get(2) == null) ? null : myList.get(2).value);
//
//        System.out.println("List size is: " + myList.size());
//
//        System.out.println("Clever size test: " + myList.cleverSize());
//
//        System.out.println("Smart last returns: " + myList.smartLast().value);
//
//        MyStringListElement newElem = new MyStringListElement();
//        newElem.value = "7";
//
//        System.out.println(myList.toString());
//
//        myList.push(newElem);
//
//        System.out.println(myList.toString());
//
//        System.out.println("Reversed list: " + myList.reverse().toString());
//
//        System.out.println("Smart reverse: " + myList.smartReverse().toString());
//
//        MyListElement<String> stringElem = new MyListElement<>();
//        stringElem.value = "123";
//
//        MyListElement<Integer> intElem = new MyListElement<>();
//        intElem.value = 777;
//
//        MyList<Integer> newIntegerList = new MyList<>();
//
//        System.out.println(newIntegerList);
//
//        newIntegerList.append(4);
//
//        System.out.println("Int list: " + newIntegerList);
//
//        newIntegerList.append(5);
//        newIntegerList.append(6);
//
//        System.out.println("Int list after appends: " + newIntegerList);
//
//        System.out.println("Int list sum: " + Utils.sum(newIntegerList));
//
//        System.out.println("Int list smart sum: " + Utils.smartSum((newIntegerList)));
//
//        System.out.println("Int list recursive sum: " + Utils.recursiveSum((newIntegerList)));
//
//        System.out.println("Int list product: " + Utils.product(newIntegerList));
//
//        System.out.println("Int list smart product: " + Utils.smartProduct(newIntegerList));
//
//        System.out.println("Int list recursive product: " + Utils.recursiveProduct(newIntegerList));
//
//        System.out.println("Int list (reminder): " + newIntegerList);
//
//        System.out.println("Int list contains 1: " + newIntegerList.contains(1));
//
//        System.out.println("Int list contains 2: " + newIntegerList.contains(2));
//
//        System.out.println("Int list contains 3: " + newIntegerList.contains(3));
//
//        System.out.println("Int list contains 4: " + newIntegerList.contains(4));
//
//        System.out.println("Int list contains 5: " + newIntegerList.contains(5));
//
//        System.out.println("Int list contains 6: " + newIntegerList.contains(6));
//
//        System.out.println("Int list contains 7: " + newIntegerList.contains(7));
//
//        System.out.println("Int list (reminder): " + newIntegerList);
//
//        System.out.println("Int list smart contains 1: " + newIntegerList.smartContains(1));
//
//        System.out.println("Int list smart contains 2: " + newIntegerList.smartContains(2));
//
//        System.out.println("Int list smart contains 3: " + newIntegerList.smartContains(3));
//
//        System.out.println("Int list smart contains 4: " + newIntegerList.smartContains(4));
//
//        System.out.println("Int list smart contains 5: " + newIntegerList.smartContains(5));
//
//        System.out.println("Int list smart contains 6: " + newIntegerList.smartContains(6));
//
//        System.out.println("Int list smart contains 7: " + newIntegerList.smartContains(7));
//
//        System.out.println("Int list (reminder): " + newIntegerList);
//
//        System.out.println("Int list recursive contains 1: " + newIntegerList.recursiveContains(1));
//
//        System.out.println("Int list recursive contains 2: " + newIntegerList.recursiveContains(2));
//
//        System.out.println("Int list recursive contains 3: " + newIntegerList.recursiveContains(3));
//
//        System.out.println("Int list recursive contains 4: " + newIntegerList.recursiveContains(4));
//
//        System.out.println("Int list recursive contains 5: " + newIntegerList.recursiveContains(5));
//
//        System.out.println("Int list recursive contains 6: " + newIntegerList.recursiveContains(6));
//
//        System.out.println("Int list recursive contains 7: " + newIntegerList.recursiveContains(7));
//
//        testPerformance(100);
//        testPerformance(200);
//        testPerformance(300);
//        testPerformance(400);
//        testPerformance(500);
//        testPerformance(600);
//        testPerformance(700);
//        testPerformance(1000);
//        testPerformance(2000);
//        testPerformance(3000);
//        testPerformance2(100000);
//
//        System.out.println();

//        testContainsMethodsPerformance(100, 1);
//        testContainsMethodsPerformance(100, 50);
//        testContainsMethodsPerformance(100, -1);
//        testContainsMethodsPerformance(500, 1);
//        testContainsMethodsPerformance(500, 50);
//        testContainsMethodsPerformance(500, -1);
//        testContainsMethodsPerformance(1000, 1);
//        testContainsMethodsPerformance(1000, 50);
//        testContainsMethodsPerformance(1000, -1);

//        testContainsMethodsPerformance(100, -1);
//        testContainsMethodsPerformance(1000, -1);

//        MyList<Integer> integerListWithPositive;
//        integerListWithPositive = new MyList<>();
//
//        integerListWithPositive.append(-9);
//        integerListWithPositive.append(-8);
//        integerListWithPositive.append(-7);
//        integerListWithPositive.append(-6);
//        integerListWithPositive.append(-5);
//        integerListWithPositive.append(-4);
//        integerListWithPositive.append(-3);
//        integerListWithPositive.append(-2);
//        integerListWithPositive.append(-1);
//        integerListWithPositive.append(1);
//
//        MyList<Integer> integerListWithoutPositive;
//        integerListWithoutPositive = new MyList<>();
//
//        integerListWithoutPositive.append(-9);
//        integerListWithoutPositive.append(-8);
//        integerListWithoutPositive.append(-7);
//        integerListWithoutPositive.append(-6);
//        integerListWithoutPositive.append(-5);
//        integerListWithoutPositive.append(-4);
//        integerListWithoutPositive.append(-3);
//        integerListWithoutPositive.append(-2);
//        integerListWithoutPositive.append(-1);
//        integerListWithoutPositive.append(-10);
//
//        System.out.println();
//
//        System.out.println("integerListWithPositive: " + integerListWithPositive);
//
//        System.out.println("integerListWithoutPositive: " + integerListWithoutPositive);
//
//        System.out.println();
//
//        System.out.println("anyPositive...withPositive returns: " + Utils.anyPositive(integerListWithPositive));
//
//        System.out.println("anyPositive...withoutPositive returns: " + Utils.anyPositive(integerListWithoutPositive));
//
//        System.out.println();
//
//        System.out.println("smartAnyPositive...withPositive returns: " + Utils.smartAnyPositive(integerListWithPositive));
//
//        System.out.println("smartAnyPositive...withoutPositive returns: " + Utils.smartAnyPositive(integerListWithoutPositive));
//
//        System.out.println();
//
//        System.out.println("recursiveAnyPositive...withPositive returns: " + Utils.recursiveAnyPositive(integerListWithPositive));
//        System.out.println("recursiveAnyPositive...withoutPositive returns: " + Utils.recursiveAnyPositive(integerListWithoutPositive));
//
//        MyList<Integer> listOfPositives;
//        listOfPositives = new MyList<>();
//
//        listOfPositives.append(1);
//        listOfPositives.append(2);
//        listOfPositives.append(3);
//        listOfPositives.append(4);
//        listOfPositives.append(5);
//        listOfPositives.append(6);
//        listOfPositives.append(7);
//        listOfPositives.append(8);
//        listOfPositives.append(9);
//        listOfPositives.append(10);
//
//        MyList<Integer> listOfPositivesWithOneNegative;
//        listOfPositivesWithOneNegative = new MyList<>();
//
//        listOfPositivesWithOneNegative.append(1);
//        listOfPositivesWithOneNegative.append(2);
//        listOfPositivesWithOneNegative.append(3);
//        listOfPositivesWithOneNegative.append(4);
//        listOfPositivesWithOneNegative.append(5);
//        listOfPositivesWithOneNegative.append(6);
//        listOfPositivesWithOneNegative.append(7);
//        listOfPositivesWithOneNegative.append(8);
//        listOfPositivesWithOneNegative.append(9);
//        listOfPositivesWithOneNegative.append(-10);
//
//        System.out.println();
//
//        System.out.println("listOfPositives: " + listOfPositives);
//        System.out.println("listOfPositivesWithOneNegative: " + listOfPositivesWithOneNegative);
//
//        System.out.println();
//
//        System.out.println("anyNegative listOfPositives returns: " + Utils.anyNegative(listOfPositives));
//        System.out.println("anyNegative listOfPositivesWithOneNegative returns: " + Utils.anyNegative(listOfPositivesWithOneNegative));
//
//        System.out.println();
//
//        System.out.println("SmartAnyNegative listOfPositives returns: " + Utils.smartAnyNegative(listOfPositives));
//        System.out.println("SmartAnyNegative listOfPositivesWithOneNegative returns: " + Utils.smartAnyNegative(listOfPositivesWithOneNegative));
//
//        System.out.println();
//
//        System.out.println("recursiveAnyNegative listOfPositives returns: " + Utils.recursiveAnyNegative(listOfPositives));
//        System.out.println("recursiveAnyNegative listOfPositivesWithOneNegative returns: " + Utils.recursiveAnyNegative(listOfPositivesWithOneNegative));
//
//
//        MyList<Integer> listWithZero;
//        listWithZero = new MyList<>();
//
//        listWithZero.append(1);
//        listWithZero.append(2);
//        listWithZero.append(3);
//        listWithZero.append(4);
//        listWithZero.append(5);
//        listWithZero.append(6);
//        listWithZero.append(7);
//        listWithZero.append(8);
//        listWithZero.append(9);
//        listWithZero.append(0);
//
//        MyList<Integer> listWithoutZero;
//        listWithoutZero = new MyList<>();
//
//        listWithoutZero.append(1);
//        listWithoutZero.append(2);
//        listWithoutZero.append(3);
//        listWithoutZero.append(4);
//        listWithoutZero.append(5);
//        listWithoutZero.append(6);
//        listWithoutZero.append(7);
//        listWithoutZero.append(8);
//        listWithoutZero.append(9);
//        listWithoutZero.append(10);
//
//        System.out.println();
//
//        System.out.println(("listWithZero: " + listWithZero));
//        System.out.println("listWithoutZero: " + listWithoutZero);
//
//        System.out.println();
//
//        System.out.println("anyZero listWithZero returns: " + Utils.anyZero(listWithZero));
//        System.out.println("anyZero listWithoutZero return: " + Utils.anyZero(listWithoutZero));
//
//        System.out.println();
//
//        System.out.println("smartAnyZero listWithZero returns: " + Utils.smartAnyZero(listWithZero));
//        System.out.println("smartAnyZero listWithoutZero returns: " + Utils.smartAnyZero(listWithoutZero));
//
//        System.out.println();
//
//        System.out.println("recursiveAnyZero listWithZero returns: " + Utils.recursiveAnyZero(listWithZero));
//        System.out.println("smartAnyZero listWithoutZero returns: " + Utils.recursiveAnyZero(listWithoutZero));
//
//        System.out.println();
//
//        System.out.println("any(value -> == 0) for listWithZero returns: " + listWithZero.any(value -> value == 0));
//        System.out.println("any(value -> == 0) for listWithoutZero returns: " + listWithoutZero.any(value -> value == 0));
//
//        System.out.println();
//
//        System.out.println(listOfPositives.any(value -> value >= 0));
//        System.out.println(listOfPositivesWithOneNegative.any(value -> value < 0));
//
//        System.out.println(listWithoutZero.any(value -> value%2 == 0));
//
//        MyList<Integer> allOdds = new MyList<>();
//        allOdds.append(1);
//        allOdds.append(3);
//        allOdds.append(5);
//        allOdds.append(7);
//
//        System.out.println(allOdds.any(value -> value%2 == 0));
//
//        MyList<String> newStringList = new MyList<>();
//        newStringList.append("Hello");
//        newStringList.append("");
//        newStringList.append("World");
//
//        System.out.println(newStringList.any(value -> value.isEmpty()));
//
//        MyList<String> newestStringList = new MyList<>();
//        newStringList.append("Hello");
//        newStringList.append("World");
//
//        System.out.println(newestStringList.any(value -> value.isEmpty()));

//        MyList<Integer> listImGoingToDouble = new MyList<>();
//        listImGoingToDouble.append(1);
//        listImGoingToDouble.append(2);
//        listImGoingToDouble.append(3);
//        listImGoingToDouble.append(4);
//        listImGoingToDouble.append(5);
//        listImGoingToDouble.append(6);
//        listImGoingToDouble.append(7);
//        listImGoingToDouble.append(8);
//
//        System.out.println("listImGoingToDouble: " + listImGoingToDouble);
//
//        System.out.println("Doubled list: " + Utils.doubled(listImGoingToDouble));
//
//
//        MyList<String> listOfStringIWantToDouble = new MyList<>();
//
//        listOfStringIWantToDouble.append("hello");
//        listOfStringIWantToDouble.append("world");
//        listOfStringIWantToDouble.append("goodbye");
//        listOfStringIWantToDouble.append("moon");
//        listOfStringIWantToDouble.append("greetings");
//        listOfStringIWantToDouble.append("humans");
//        listOfStringIWantToDouble.append("farewell");
//        listOfStringIWantToDouble.append("fish");
//
//        System.out.println("list Im gonna double: " + listOfStringIWantToDouble);
//        System.out.println("doubled list: " + Utils.doubledStr(listOfStringIWantToDouble));
//        System.out.println("listOfStringIWantToDouble lengths: " + Utils.lengths(listOfStringIWantToDouble));
//
//        System.out.println("DOUBLING WITH MAP:");
//        System.out.println("Int to Int" + listImGoingToDouble.map(value -> value * 2));
//        System.out.println("Str to Str" + listOfStringIWantToDouble.map(value -> value + value));
//
//        System.out.println();
//
//        System.out.println("Str to Int" + listOfStringIWantToDouble.map(value -> value.length()));
//        System.out.println("way too much: " + Utils.smartSum(listOfStringIWantToDouble.map(value -> value + " " + value).map(value -> value.length())));
//
//
//        System.out.println("intList: " + listImGoingToDouble);
//        System.out.println("Recursive double on intList: " + Utils.recursiveDoubled(listImGoingToDouble));
        
        MyList<Integer> intList = new MyList<>();

        intList.append(1);
        intList.append(2);
        intList.append(3);
        intList.append(4);
        intList.append(5);

//        MyList<Integer> intListWithNegative = new MyList<>();
//
//        intListWithNegative.append(1);
//        intListWithNegative.append(2);
//        intListWithNegative.append(3);
//        intListWithNegative.append(4);
//        intListWithNegative.append(-1);
//
//        System.out.println("int list: " + intList);
//        System.out.println("int list with negative: " + intListWithNegative);
//
//        System.out.println("allPositive on int list returns: " + Utils.allPositive(intList));
//        System.out.println("allPositive on int list with negative returns: " + Utils.allPositive(intListWithNegative));
//
//        System.out.println("recursiveAllPositive on int list: " + Utils.recursiveAllPositive(intList));
//        System.out.println("recursiveAllPositive on int list with negative: " + Utils.recursiveAllPositive(intListWithNegative));
//
//        System.out.println("All on int list looking for all positives: " + intList.all(value -> value >= 0));
//        System.out.println("All on int list with negative looking for all positives: " + intListWithNegative.all(value -> value >= 0));
//
//        MyList<String> strList1 = new MyList<>();
//
//        strList1.append("hello");
//        strList1.append("goodbye");
//        strList1.append("okay");
//
//        System.out.println(strList1.all(value -> !value.isEmpty()));
//
//        MyList<String> strList2 = new MyList<>();
//
//        strList2.append("hello");
//        strList2.append("goodbye");
//        strList2.append("");
//        strList2.append("okay");
//
//        System.out.println(strList2.all(value -> !value.isEmpty()));



//        System.out.println("checking for 1 in int list with any: " + intList.any(value -> value == 1));
//
//        System.out.println("checking for 1 in int list with smartAny: " + intList.smartAny(value -> value == 1));
//
//        System.out.println("checking for 1 in int list with recursiveAny: " + intList.recursiveAny(value -> value == 1));


//        MyList<Integer> newestIntList = MyList.of(1, 2, 3, 4, 5);
//        MyList<String> newestStrList = MyList.of("Hello", "Goodbye", "Okay");
//
//        System.out.println(MyList.of(1, 2, 3, 4, 5).take(3).map(value -> value * 3));
//
//
//        System.out.println(newestIntList);
//        System.out.println(newestStrList);
//
//
//
//        System.out.println("intList.take(-1): " + intList.take(-1));
//        System.out.println("intList.take(0): " + intList.take(0));
//        System.out.println("intList.take(1): " + intList.take(1));
//        System.out.println("intList.take(2): " + intList.take(2));
//        System.out.println("intList.take(3): " + intList.take(3));
//        System.out.println("intList.take(4): " + intList.take(4));
//        System.out.println("intList.take(5): " + intList.take(5));
//        System.out.println("intList.take(10): " + intList.take(10));
//
//        System.out.println();

//        System.out.println(newestIntList);
//        System.out.println("Multiply by 10 and divide by 2:");
//        System.out.println(newestIntList.recursiveMap(value -> (value * 10))
//                .recursiveMap(value -> value/2));

        MyList<Integer> allPosIntList = MyList.of(1, 2, 3, 4, 5);
        MyList<Integer> allNegIntList = MyList.of(-1, -2, -3, -4, -5);
        MyList<Integer> mixIntList = MyList.of(1, 2, -3, 4, 5);
        MyList<Integer> emptyList = MyList.of();

        System.out.println("takeWhilePositive on all positive: "
                        + Utils.takeWhilePositive(allPosIntList));

        System.out.println("takeWhilePositive on all negative: "
                + Utils.takeWhilePositive(allNegIntList));

        System.out.println("takeWhilePositive on mixed list: "
                + Utils.takeWhilePositive(mixIntList));

        System.out.println("takeWhilePositive on empty list: "
                + Utils.takeWhilePositive(emptyList));

        System.out.println();

        System.out.println("Same, but instance, looking for greater than 0:");

        System.out.println("takeWhile on all positive: "
                + allPosIntList.takeWhile(value -> value > 0));

        System.out.println("takeWhile on all negative: "
                + allNegIntList.takeWhile(value -> value > 0));

        System.out.println("takeWhile on mixed list: "
                + mixIntList.takeWhile(value -> value > 0));

        System.out.println("takeWhile on empty list: "
                + emptyList.takeWhile(value -> value > 0));

        System.out.println();
        System.out.println();

        MyList<Integer> longMixedIntList = MyList.of(-1, 1, -2, 2, -3, 3, -4, 4, -5, 5);
        System.out.println("longMixedIntList: " + longMixedIntList);
        System.out.println("Filter positive out of longMixedIntList:");
        System.out.println(Utils.filterPositive(longMixedIntList));


    }

    static void testPerformance(long size) {

        MyList<Integer> list = new MyList<>();

        System.out.println("Running performance test for list of size " + size);

        for (Integer i = 1; i <= size; i++) {
            list.append(i);
        }

        long clock = System.nanoTime();

        Integer sumFirst200 = Utils.sum(list);

        clock = System.nanoTime() - clock;

        System.out.println(sumFirst200 + " elapsed: " + clock);

        clock = System.nanoTime();

        Integer smartSumFirst200 = Utils.smartSum(list);

        clock = System.nanoTime() - clock;

        System.out.println(smartSumFirst200 + " elapsed: " + clock);

        clock = System.nanoTime();

        Integer recursiveSumFirst200 = Utils.recursiveSum(list);

        clock = System.nanoTime() - clock;

        System.out.println(recursiveSumFirst200 + " elapsed: " + clock);

    }

    static void testPerformance2(long size) {

        MyList<Integer> list = new MyList<>();

        System.out.println("Running performance test for list of size " + size);

        for (Integer i = 1; i <= size; i++) {
            list.append(i);
        }

        long clock = System.nanoTime();

        Integer smartSumFirst200 = Utils.smartSum(list);

        clock = System.nanoTime() - clock;

        System.out.println(smartSumFirst200 + " elapsed: " + clock);

        clock = System.nanoTime();

        Integer recursiveSumFirst200 = Utils.recursiveSum(list);

        clock = System.nanoTime() - clock;

        System.out.println(recursiveSumFirst200 + " elapsed: " + clock);

    }

    static void testContainsMethodsPerformance(Integer size, Integer value) {
        MyList<Integer> list = new MyList<>();
        boolean contains;

        for (Integer i = 1; i <= size; i++) {
            list.append(i);
        }

        System.out.println("This test is for list size: " + size);

        System.out.println("Method contains test for value " + value + ":");
        long clock = System.nanoTime();
        contains = list.contains(value);
        clock = System.nanoTime() - clock;
        System.out.println(contains + ", Elapsed: " + clock);

        System.out.println("Method smartContains test for value " + value + ":");
        clock = System.nanoTime();
        contains = list.smartContains(value);
        clock = System.nanoTime() - clock;
        System.out.println(contains + ", Elapsed: " + clock);

        System.out.println("Method recursiveContains test for value " + value + ":");
        clock = System.nanoTime();
        contains = list.recursiveContains(value);
        clock = System.nanoTime() - clock;
        System.out.println(contains + ", Elapsed: " + clock);

        System.out.println();


    }


}
