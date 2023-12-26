package lesson4;

import java.util.*;

public class ArrayExamples {

    public void stringsArray() {
        String[] buttons = {"Ok", "Cancel", "Login", "SignUp"};
        //buttons[2] = "Exit";

        int length = buttons.length;
        // System.out.println(buttons[2]);
        // System.out.println("lenght: " + length);

//        for(int i=0; i<buttons.length; i++){
//            System.out.println(buttons[i]);
//        }

        for (String button : buttons) {
            System.out.println(button);
        }

    }

    public void integerArray() {
        int[] ids = {12, 3, 5, 8};
        System.out.println(ids[2]);

    }

    public void stringsArrayWithSize() {

        String[] array = new String[5];
        array[0] = "Ok";
        array[1] = "Cancel";
        array[2] = "Login";
        array[3] = "SighUp";

        System.out.println("length:" + array.length);
    }

    public void arrayListExample() {
        ArrayList<String> buttons = new ArrayList<String>();
        buttons.add("Ok");
        buttons.add("Cancel");
        buttons.add("Login");
        buttons.add("Exit");


        for (int i = 0; i < buttons.size(); i++) {
            System.out.println(buttons.get(i));
        }

        for (String button : buttons) {
            System.out.println(button);

        }
        System.out.println("The size of the list" + buttons.size());

        buttons.add("SighUp");

        for (String button : buttons) {
            System.out.println(button);

        }
        buttons.remove("Exit");
        System.out.println();

        for (String button : buttons) {
            System.out.println(button);
        }
        System.out.println();

        buttons.clear();
        System.out.println(buttons.size());
    }

    public void arrayListSortingExample() {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(123);
        arraylist.add(1);
        arraylist.add(23);
        arraylist.add(98);

        Collections.sort(arraylist);

        for (Integer i : arraylist) {
            System.out.println(i);
        }

    }

    public void hashMapExample() {

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("John", "Toronto");
        hashMap.put("kate", "Moscow");
        hashMap.put("Moshe", "Tel Aviv");
        hashMap.put("Moshe", "Jerusalem");
        System.out.println(hashMap);

        System.out.println(hashMap.get("Moshe"));
        hashMap.remove("John");
        System.out.println(hashMap.size());
        System.out.println(hashMap);

    }

    public void hashSetExample() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("John");
        hashSet.add("Kate");
        hashSet.add("Moshe");
        System.out.println(hashSet);

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);


    }

    public void getDay() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Sunday");
        hashMap.put(2, "Monday");
        hashMap.put(3, "Tuesday");
        hashMap.put(4, "Wednesday");
        hashMap.put(5, "Thursday");
        hashMap.put(6, "Friday");
        hashMap.put(7, "Saturday");

        System.out.println(hashMap);
        System.out.println();
        System.out.println(hashMap.get(2));
    }

    public String getToyById(int id) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(12, "Bat mobile");
        hashMap.put(45, "Light Saber");
        hashMap.put(6, "Wonder Women");
        hashMap.put(201, "Hello Kitty Bag");
        hashMap.put(56, "Junior QA Analyst");
        System.out.println(hashMap);

        System.out.println(hashMap.get(id));


        return "the end";


        }
    public String hashSetGetToyById(int id) {

        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(12);
        hashSet.add(45);
        hashSet.add(6);
        hashSet.add(201);
        hashSet.add(56);
        List<Integer> list = new ArrayList<Integer>(hashSet);
        Collections.sort(list);
String result ="";
        if (hashSet.contains(id)) {
            System.out.println(id);
        } else {
            return "No such Toy";
        }
return result;

    }


  public void arrayListSorting(){
  HashSet<String> hashSet = new HashSet<String>();
  hashSet.add("Steve");
  hashSet.add("Tim");
  hashSet.add("Lucy");
  hashSet.add("Steve");
  hashSet.add("Pat");
  hashSet.add("Angela");
  hashSet.add("Tom");
  hashSet.add("Tim");
  hashSet.add("Anna");
  hashSet.add("Lucy");

  List<String> list = new ArrayList<String>(hashSet);
  Collections.sort(list);
      System.out.println(list);

  }
public void arrayListOfDays(int dayNum){

        ArrayList<String> days = new ArrayList<String>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Friday");
        days.add("Saturday");


if(dayNum>=1 && dayNum<=7) {
    System.out.println(days.get(dayNum-1));
}
else{
    System.out.println("Invalid dayNum");
}


    }




}















