package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods {

  public static void main(String[] args) {
    List list = new ArrayList();//we don't use generics here (between angle brackets), meaning that
    //list can hold different types of object. When you use the diamond operator like this for
    //example: <String>, then list will only hold Strings.
    //The declaration above is the same as List<Object> list = new ArrayList<>();
    list.add("dog");
    list.add(5);

    System.out.println(list);//List calls automatically toString() but you can add it manually like
    //this: System.out.println(list.toString());
    //in Arrays we had to call the static Arrays class and the toString() like: Arrays.toString()
    //but that is not the case with List.

    List<String> pets = new ArrayList<>();
    pets.add("dog");
    System.out.println(pets);

    //add
    pets.add(0, "cat");//[cat, dog]
    pets.add(1, "parrot");//you can use an index to add on a certain place. [cat, parrot, dog]
    pets.add("fish");//without an index is added to the end of the ArrayList.[cat, parrot, dog, fish]
    pets.add("parrot");//[cat, parrot, dog, fish, parrot]
    System.out.println(pets);

    //remove
    pets.remove("parrot");//will remove the first available object parrot.[cat, dog, fish, parrot]
    System.out.println(pets);
    pets.remove(2);
    System.out.println(pets);//removes fish on index 2. [cat, dog, parrot]

    //set
    pets.set(0, "kangaroo");
    System.out.println(pets);//cat on index 0 has been replaced with kangaroo. [kangaroo, dog, parrot]

    pets.set(6, "monkey");//throws IndexOutOfBoundException.
  }

}
