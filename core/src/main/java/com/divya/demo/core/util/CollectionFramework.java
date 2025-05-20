package com.divya.demo.core.util;

import java.util.*;

/**
 * Collection is an Interface which extends Iterable interface->(provides iterator for the collections)
 * Its parent class for 3 major Interfaces -
 * List
 * Set
 * Queue
 */
public class CollectionFramework {

    public static void main(String[] args) {
        //Array
        String[] arr = new String[10];
        arr[0] = "element 1";
        arr[5] = "element 5";
        //We cannot assign arr more than arr[9] becoz we declared size in the beginning as 10
        //Arrays have fixed size in memory and cannot be increased.

        /*
        * List Interface - > 3 classes implement it - (all maintain insertion order)
        * ArrayList --
        * LinkedList
        * Vector
        * */
        //Arraylist
        //Not synchronized
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("element 1");
        // As soon as 1st element is added it creates an array of size 10 because default capacity is 10
        //arrayList.add(11,"element 11");
        // And as soon as 11th element is inserted then the size increase by this formula below
        //Capacity is Calculated as n +n/2+1 ie. size of internal array increases by 50%
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("element2 4");
        arrayList.addAll(arrayList2);
        System.out.println("Arraylist :"+arrayList);
        //Internally add, remove works in O(n)
        //Also if any element is removed/added elements are left shifted internally (Insertion Order)
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        /**Major Difference between LinkedList and ArrayList are
         1) Arraylist uses array implementation internally and linkedlist uses doubly linked list
         2) Hence arraylist is used for memory allocation and accessing data as its stored in contagious memory location. But
         linked list is useful for data manipulation as insertion, deletion is faster as there is no bit shifting.
         3) For Linkedlist there is no concept of capacity
         4) ArrayList allows random access whereas for linkedlist we need to use iterator only
         5) Arraylist allows index based searches not allowed for linkedlist
         */
        /**Major Difference between Vector and ArrayList are
         1) Arraylist and Vector have same internal implementation (array) only difference is Vector is synchronized and arraylist is not.
         2) Vector doubles its size on full.
         */
        //Stack LIFO
        // Stack class extends Vector class
        // becoz of this it is also thread safe and hence slow
        // we generally use ArrayDeque instead of stack
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("dog");
        animals.push("cat");
        System.out.println("Animals : "+animals);
        System.out.println("Animal on top: "+animals.peek());
        animals.pop();
        System.out.println("Animal on top after pop: "+animals.peek());
        //Queue Interface
        // FIFO
        // Deque inteface also implements queue
        //There are 2 classes for queue and deque each - priorityQueue and ArrayDeque respectively
        // Queue using linked list
        //LinkedList class implements list as well as deque
        //Linked List internally implements Doubly linked list
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);// offer method is used to add element in q
        queue.offer(22);//There is add method also but it returns exception is add operation fails
        queue.offer(32);//offer method just returns false in case of failed operation
        System.out.println(queue);
        System.out.println(queue.poll());//remove and print
        System.out.println(queue);
        System.out.println(queue.peek());//next element to be polled
        //element() method can be  used instead of peek but returns exception in case of failure (eg: empty q peek)
        System.out.println(queue);// returns null if empty


       //Priority Queue
        //Internally implements min heap
        //It has internal capacity and grows automatically by internal logic
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);
        pq.offer(13);
        System.out.println(pq);
        //To set priority we have to give comparator in constructor - eg
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(12);
        pq2.offer(24);
        pq2.offer(36);
        pq2.offer(13);
        System.out.println(pq2);

        //Array Deque
        //Pronounced as Array Deck
        //We can implement stack and queue both with array deck
        //This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.
        // has no capacity restrictions
        ArrayDeque<Integer> arrDeq = new ArrayDeque<>();
        arrDeq.offer(12);
        arrDeq.offerFirst(34);
        arrDeq.offerLast(45);
        arrDeq.offer(55);
        System.out.println(arrDeq);
        System.out.println(arrDeq.peekFirst());
        arrDeq.pollFirst();
        System.out.println(arrDeq);
        arrDeq.pollLast();
        System.out.println(arrDeq);

        //Set
        //No Duplicates allowed
        //Operations O(1)
        //Set interface is implemented by 2 classes Hashset and LinkedHashSet. Also implemented by 1 interface SortedSet
        // SortedSet is implemented by class TreeSet
        Set<Integer> hashset = new HashSet<>();
        hashset.add(22);
        hashset.add(12);
        hashset.add(42);
        hashset.add(2);
        //Random order not following insertion order
        //Also allows only one null key
        // initial capacity 16 and load(0.75)
        System.out.println(hashset);

        //LinkedHashset
        //This is exactly same as set only difference is it follows insertion order unlike hashset
        // we can set initail capacity and load
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        //TreeSet
        //Sorted form as it implements binary tree internally (red-black tree)
        //All operations are O(logn)
        //default is natural ordering
        Set<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(23,"Anuj"));
        studentSet.add(new Student(34,"Rohit"));
        studentSet.add(new Student(23,"Anuj"));
        //Here 2 same objs Anuj are added in the set because we have not overriden equals and hashset
        //Bcoz their hashcode is same.
        //If we implement hashcode method based on rollno then it will be treated as same obj
        //uncomment equals and hashcode to see the behavior
        //values are not overriden just ignored if I give below without hash and equals
        studentSet.add(new Student(23,"Amit"));
        System.out.println("Set :"+studentSet.toString());

        //Map
        //key value pairs, where keys are unique
        //key value pairs == Entry Set
        //O(1) operations
        //Map interface is implemented by AbstractMap class which is implemented by HashMap and HashTable
        //Map interface is also implemented by SortedMap(I) -> NavigableMap(I) -> TreeMap(class)
        Map<String, Integer> numbers = new HashMap<>(40,0.2f);
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        System.out.println(numbers);
        //values are overwritten as below
        numbers.put("three",33);
        System.out.println(numbers);
        numbers.putIfAbsent("three",3);

        for(Map.Entry<String,Integer> n:numbers.entrySet()){
            System.out.println(n);
        }
        for(String n:numbers.keySet()){
            System.out.println(n);
        }
        //same can be done for values

        //HashTable
        // same as map but it is synchronized
        // doesnot allow any null key
        Map<Integer,String> ht = new Hashtable<>();
        ht.put(1,"Div");
        //TreeMap
        //keys are sorted; operations O(logn)
        // cannot have null trees
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("one",1);
        treeMap.put("two",2);
        treeMap.put("three",3);
        treeMap.put("four",4);
        treeMap.put("five",5);
        System.out.println(treeMap);


        //Arrays class
        //Used for manipulations for arrays
        //search, sort, fill
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(nums,7));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));//uses quick sort
        //System.out.println(Arrays.parallelSort(nums));//for parallel cpus
        Arrays.fill(nums,12);
        System.out.println(Arrays.toString(nums));


        //Collections Class
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(43);
        list.add(87);
        list.add(3);
        list.add(18);
        list.add(93);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.frequency(list,3));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Comparator.reverseOrder());

        List<Student> studentList = new LinkedList<Student>();
        studentList.add(new Student(23,"Anuj"));
        studentList.add(new Student(34,"Rohit"));
        studentList.add(new Student(25,"Amit"));
        System.out.println(studentList);
        //Collections.sort(studentSet);
        //This gives error as there is no way to compare one student obj to another
        //Implement Comparable in student class
        Collections.sort(studentList);
        System.out.println(studentList);

        //Same thing can be done if we want to compare with/sort with name then change compareTo logic
        //Instead we use Comparator
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);//because String class already has implemented comareTo method
            }
        });
        System.out.println(studentList);
        //Same with Lamda
        Collections.sort(studentList,(o1,o2)->o1.name.compareTo(o2.name));
        System.out.println(studentList);






    }
    public static class Student implements Comparable<Student>{
        int no;
        String name;

        public Student(int no, String name){
            this.no = no;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    '}';
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return no == student.no;
        }

        @Override
        public int hashCode() {
            return Objects.hash(no);
        }

        @Override
        public int compareTo(Student that) {
            return this.no - that.no;
        }
    }
}
