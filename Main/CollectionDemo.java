package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Student {
  int age;
  String name;
  
  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }  
}

class StudentWithComparable implements Comparable<StudentWithComparable> {
  int age;
  String name;
  
  public StudentWithComparable(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

  @Override
  public int compareTo(StudentWithComparable that) {
    return (this.age > that.age) ? 1 : -1;
  }
}
public class CollectionDemo {
  public static void main(String[] a) {
    Collection<Integer> nums = new ArrayList<Integer>();
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);

    System.out.println(nums);
    
    for(int n: nums) {
      System.out.println(n);
    }

    List<Integer> nums2 = new ArrayList<Integer>();
    nums2.add(2);
    nums2.add(3);
    nums2.add(4);
    nums2.add(5);

    System.out.println(nums2);
    System.out.println(nums2.get(2));

    // Set can be used if needed only unique values in the array
    Set<Integer> nums3 = new HashSet<Integer>();
    nums3.add(32);
    nums3.add(53);
    nums3.add(24);
    nums3.add(32);
    nums3.add(43);

    System.out.println(nums3);
    for(int n: nums3) {
      System.out.println(n); // does not sort in ascending order but randomly logs only unique keys
    }

    // if sorted array in ascendeing order is needed and also only unique values,
    // then use TreeSet instead of HashSet
    Set<Integer> nums4 = new TreeSet<Integer>();
    nums4.add(32);
    nums4.add(53);
    nums4.add(24);
    nums4.add(32);
    nums4.add(43);
    System.out.println(nums4);
    for(int n: nums4) {
      System.out.println(n);
    }

    // Map is similar to set but with key value pairs instead of index values for position
    // also Hashtable can be used which is nothing but HashMap with synchronized keyword, 
    // to work with multiple threads, HashMap with synchronized works, but Hashtable is inbuilt
    Map<String, Integer> students = new HashMap<>();
    students.put("Bharath", 14);
    students.put("Bhoja", 15);
    students.put("Raj", 10);
    students.put("Soujanya", 8);
    students.put("Bhoja", 14);

    System.out.println(students); // does not repeat the keys and assigns the last value
    System.out.println(students.get("Bharath"));
    System.out.println(students.keySet());

    for(String s: students.keySet()) {
      System.out.println(s + ": " + students.get(s));
    }

    List<Integer> nums5 = new ArrayList<>();
    nums5.add(4);
    nums5.add(3);
    nums5.add(7);
    nums5.add(9);

    System.out.println("nums5 list before sorting " + nums5);
    Collections.sort(nums5);
    System.out.println("nums5 list after sorting " + nums5);

    List<Integer> nums6 = new ArrayList<>();
    nums6.add(43);
    nums6.add(31);
    nums6.add(72);
    nums6.add(29);

    System.out.println("nums6 list before sorting " + nums6);
    // sort the nums6 based on last number in ascending order like [31, 72, 43, 29]
    Comparator<Integer> com = new Comparator<Integer>() {
      public int compare( Integer i, Integer j) {
        return (i % 10) > (j % 10) ? 1 : -1;
      };
      
    };
    Collections.sort(nums6, com);
    System.out.println("nums6 list after sorting " + nums6);

    // lets try adding a class Student for comparator example with an object
    List<Student> students2 = new ArrayList<>();
    students2.add(new Student(30, "Bharath"));
    students2.add(new Student(26, "Bhoja"));
    students2.add(new Student(28, "Raj"));
    students2.add(new Student(30, "Soujanya"));

    // System.out.println(students2); // prints all in one line
    System.out.println("before sorting");
    for (Student student: students2) {
      System.out.println(student.name + ": " + student.age);
    }

    Comparator<Student> com2 = (i, j) -> i.age > j.age ? 1 : -1;

    Collections.sort(students2, com2);
    System.out.println("after sorting");
    for (Student student: students2) {
      System.out.println(student.name + ": " + student.age);
    }

    // lets try adding a class StudentWithComparable on its own
    List<StudentWithComparable> students3 = new ArrayList<>();
    students3.add(new StudentWithComparable(30, "Bharath"));
    students3.add(new StudentWithComparable(26, "Bhoja"));
    students3.add(new StudentWithComparable(28, "Raj"));
    students3.add(new StudentWithComparable(30, "Soujanya"));

    // System.out.println(students3); // prints all in one line
    System.out.println("StudentWithComparable before sorting");
    for (StudentWithComparable student: students3) {
      System.out.println(student.name + ": " + student.age);
    }

    // without second parameter if we are implementing class with comparable in class
    Collections.sort(students3);
    System.out.println("StudentWithComparable after sorting");
    for (StudentWithComparable student: students3) {
      System.out.println(student.name + ": " + student.age);
    }

  }
}