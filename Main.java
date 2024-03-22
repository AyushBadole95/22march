// enum Level{
//     LOW,
//     MEDIUM,
//     HIGH,
// }
// public class Main {
//     public static void main(String[] args) {
//         Level myVar = Level.HIGH;
//         switch(myVar){
//             case LOW:
//             System.out.println("Low level");
//             break;
//             case MEDIUM:
//             System.out.println("Medium level");
//             break;
//             case HIGH:
//             System.out.println("High level");
//             break;
//         }
//     }   
// }
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner myObj = new Scanner(System.in);
//         System.out.println("Enter name, age, salary");
//         String name = myObj.nextLine();
//         int age = myObj.nextInt();
//         double salary = myObj.nextDouble();

//         System.out.println("Name is " + name);
//         System.out.println("Age " + age);
//         System.out.println("salary " + salary);
//     }
// }
// import java.time.LocalDate;
// public class Main {
//     public static void main(String[] args) {
//         LocalDate myObj = LocalDate.now();
//         System.out.println(myObj);
//     }
// }
// import java.time.LocalTime;
// public class Main {

//      public static void main(String[] args) {
//         LocalTime myObj = LocalTime.now();
//         System.out.println(myObj);
//      }
// }
// import java.time.LocalDateTime;
 
// public class Main{
//     public static void main(String[] args) {
//         LocalDateTime myObj = LocalDateTime.now();
//         System.out.println(myObj);
//     }
// }
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class Main {

//     public static void main(String[] args) {
//         LocalDateTime myObj = LocalDateTime.now();
//         System.out.println("Before formatting " + myObj);
//         DateTimeFormatter myFObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//         String formattedDate = myObj.format(myFObj);
//         System.out.println("After formatting: " + formattedDate);
//     }
// }


 //ArrayList//
//  import java.util.LinkedList;
// import java.util.Collections;


// public class Main {

//     public static void main(String[] args) {
//         ArrayList<String> cars = new ArrayList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         System.out.println(cars);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         ArrayList<Integer> marks = new ArrayList<Integer>();
//         marks.add(70);
//         marks.add(80);
//         marks.add(75);
//         marks.add(85);
//         System.out.println(marks);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         ArrayList<Integer> marks = new ArrayList<Integer>();
//         marks.add(70);
//         marks.add(80);
//         marks.add(75);
//         marks.add(85);
//         System.out.println(marks.get(2));
//     }
// }



// public class Main {

//     public static void main(String[] args) {
//         ArrayList<Integer> marks = new ArrayList<Integer>();
//         marks.add(70);
//         marks.add(80);
//         marks.add(75);
//         marks.add(85);
//         marks.set(0, 33);
//         System.out.println(marks);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         ArrayList<Integer> marks = new ArrayList<Integer>();
//         marks.add(70);
//         marks.add(80);
//         marks.add(75);
//         marks.add(85);
//         marks.set(0, 33);
//         System.out.println(marks);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         ArrayList<Integer> marks = new ArrayList<Integer>();
//         marks.add(70);
//         marks.add(80);
//         marks.add(75);
//         marks.add(85);
//         for (int i = 0; i < marks.size(); i++){
//             System.out.println(marks.get(i));
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         ArrayList<Integer> marks = new ArrayList<Integer>();
//         marks.add(70);
//         marks.add(80);
//         marks.add(75);
//         marks.add(85);
//         for (Integer i : marks) {
        
//             System.out.println(i);
//         }
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         ArrayList<String> cars = new ArrayList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         Collections.sort(cars);
//         for(String i : cars){
//         System.out.println(i);
//         }
//     }
// }



// public class Main {

//     public static void main(String[] args) {
//         ArrayList<String> cars = new ArrayList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         Collections.sort(cars);
//         for(String i : cars){
//         System.out.println(i);
//         }
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         LinkedList<String> cars = new LinkedList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         System.out.println(cars);
//         }
//     }


// public class Main {

//     public static void main(String[] args) {
//         LinkedList<Integer> marks = new LinkedList<Integer>();
//         marks.add(70);
//         marks.add(80);
//         marks.add(75);
//         marks.add(85);
//             System.out.println(marks);
//         }
//     }
// import java.util.LinkedList;
// import java.util.Collections;


// public class Main {

//     public static void main(String[] args) {
//         LinkedList<String> cars = new LinkedList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.addFirst("Mazda");
//         System.out.println(cars);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         LinkedList<String> cars = new LinkedList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.addLast("Mazda");
//         System.out.println(cars);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         LinkedList<String> cars = new LinkedList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         cars.removeFirst();
//         System.out.println(cars);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         LinkedList<String> cars = new LinkedList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         cars.removeLast();
//         System.out.println(cars);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         LinkedList<String> cars = new LinkedList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         System.out.println(cars.getFirst());
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         LinkedList<String> cars = new LinkedList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         System.out.println(cars.getLast());
//     }
// }

// import java.util.HashMap;
// public class Main {

//     public static void main(String[] args) {
//         HashMap<String, String> capitalCities = new HashMap<String, String>();
//         capitalCities.put("England", "London");
//         capitalCities.put("Germany",  "Berlin");
//         capitalCities.put("Norway", "Oslo");
//         capitalCities.put("USA", "Washington DC");
//         System.out.println(capitalCities);

//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         HashMap<String, Integer> SubjectMarks = new HashMap<String, Integer>();
//         SubjectMarks.put("Maths", 80);
//         SubjectMarks.put("English",  85);
//         SubjectMarks.put("Hindi", 81);
//         SubjectMarks.put("Science", 90);
//         System.out.println(SubjectMarks);

//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         HashMap<String, String> capitalcities = new HashMap<String, String>();
//         capitalcities.put("England", "London");
//         capitalcities.put("Germany", "Berlin");
//         capitalcities.put("Norway", "Oslo");
//         capitalcities.put("USA", "Washington DC");
//         System.out.println(capitalcities.get("USA"));
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         HashMap<String, String> capitalcities = new HashMap<String, String>();
//         capitalcities.put("England", "London");
//         capitalcities.put("Germany", "Berlin");
//         capitalcities.put("Norway", "Oslo");
//         capitalcities.put("USA", "Washington DC");
//         capitalcities.remove("England");
//         System.out.println(capitalcities);
//     }
// }



// public class Main {

//     public static void main(String[] args) {
//         HashMap<String, String> capitalcities = new HashMap<String, String>();
//         capitalcities.put("England", "London");
//         capitalcities.put("Germany", "Berlin");
//         capitalcities.put("Norway", "Oslo");
//         capitalcities.put("USA", "Washington DC");
//         capitalcities.clear();
//         System.out.println(capitalcities);
//     }
// }



// public class Main {

//     public static void main(String[] args) {
//         HashMap<String, String> capitalcities = new HashMap<String, String>();
//         capitalcities.put("England", "London");
//         capitalcities.put("Germany", "Berlin");
//         capitalcities.put("Norway", "Oslo");
//         capitalcities.put("USA", "Washington DC");
//         System.out.println(capitalcities.size());
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         HashMap<String, String> capitalcities = new HashMap<String, String>();
//         capitalcities.put("England", "London");
//         capitalcities.put("Germany", "Berlin");
//         capitalcities.put("Norway", "Oslo");
//         capitalcities.put("USA", "Washington DC");
//         for (String i : capitalcities.keySet()){
//         System.out.println(i);
//         }
//     }
// }



// public class Main {

//     public static void main(String[] args) {
//         HashMap<String, String> capitalcities = new HashMap<String, String>();
//         capitalcities.put("England", "London");
//         capitalcities.put("Germany", "Berlin");
//         capitalcities.put("Norway", "Oslo");
//         capitalcities.put("USA", "Washington DC");
//         for (String i : capitalcities.values()){
//         System.out.println(i);
//         }
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         HashMap<String, String> capitalcities = new HashMap<String, String>();
//         capitalcities.put("England", "London");
//         capitalcities.put("Germany", "Berlin");
//         capitalcities.put("Norway", "Oslo");
//         capitalcities.put("USA", "Washington DC");
//         for (String i : capitalcities.keySet()){
//         System.out.println("key: " + i + " value: " + capitalcities.get(i));
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         HashMap<String, Integer> SubjectMarks = new HashMap<String, Integer>();
//         SubjectMarks.put("Maths", 80);
//         SubjectMarks.put("English",  85);
//         SubjectMarks.put("Hindi", 81);
//         SubjectMarks.put("Science", 90);
//         for (String i : SubjectMarks.keySet()){
//         System.out.println("subject: " +i+ " Marks: " + SubjectMarks.get(i));
//         }

//     }
// }

// import java.util.HashSet;
// import java.util.Iterator;

// public class Main {

//     public static void main(String[] args) {
//         HashSet<String> cars = new HashSet<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Mazda");
//         cars.add("Ford");
//         cars.add("BMW");
//         System.out.println(cars);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         HashSet<String> cars = new HashSet<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Mazda");
//         cars.add("Ford");
//         cars.add("BMW");
//         System.out.println(cars.contains("Volvo"));
//     }
// }



// public class Main {

//     public static void main(String[] args) {
//         HashSet<String> cars = new HashSet<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Mazda");
//         cars.add("Ford");
//         cars.add("BMW");
//         cars.remove("BMW");
//         System.out.println(cars);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         HashSet<String> cars = new HashSet<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Mazda");
//         cars.add("Ford");
//         cars.add("BMW");
//         cars.clear();
//         System.out.println(cars);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         HashSet<String> cars = new HashSet<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Mazda");
//         cars.add("Ford");
//         cars.add("BMW");
//         System.out.println(cars.size());
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         HashSet<String> cars = new HashSet<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Mazda");
//         cars.add("Ford");
//         cars.add("BMW");
//         for(String i : cars){
//         System.out.println(i);
//         }
//     }
// }

 
// public class Main {

//     public static void main(String[] args) {
//         HashSet<Integer> numbers = new HashSet<Integer>();
//         numbers.add(5);
//         numbers.add(10);
//         numbers.add(15);
//         for(int i = 1; i <= 15; i++){
//             if(numbers.contains(i)){
//                 System.out.println(i + "was found in set.");
//             }else{
//                 System.out.println(i + "was not found in set");
//             }
//         }

//     }
// }

// import java.util.ArrayList;
// import java.util.Iterator;

// public class Main {

//     public static void main(String[] args) {
//         ArrayList<String> cars = new ArrayList<String>();
//         cars.add("Volvo");
//         cars.add("BMw");
//         cars.add("Ford");
//         cars.add("Mazda");
//         Iterator<String> it = cars.iterator();
//         System.out.println(it.next());
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         ArrayList<String> cars = new ArrayList<String>();
//         cars.add("Volvo");
//         cars.add("BMw");
//         cars.add("Ford");
//         cars.add("Mazda");
//         Iterator<String> it = cars.iterator();
//         while(it.hasNext()){
//         System.out.println(it.next());
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<Integer>();
//         numbers.add(536);
//         numbers.add(44);
//         numbers.add(274);
//         numbers.add(532);
//         Iterator<Integer> it = numbers.iterator();
//         while(it.hasNext()){
//             Integer i = it.next();
//             if(i < 100){
//                 it.remove();
//             }
//         }
//         System.out.println(numbers);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         Integer myInt = 100;
//         String myString = myInt.toString();
//         System.out.println(myString.length());

//     }
// }

// public class Main extends Thread{
//     public static void main(String[] args) {
//         Main thread = new Main();
//         thread.start();
//         System.out.println("This code is outside of the thread");
//     }
//     public void run(){
//         System.out.println("This code is running in a thread");
//     }
// }

// public class Main implements Runnable {
//     public static void main(String[] args) {
//         Main obj = new Main();
//         Thread thread = new Thread(obj);
//         thread.start();
//         System.out.println("This code is outside of the thread");
//     }
//     public void run(){
//         System.out.println("This code is running in a thread");
//     }   
// }
 
// import java.util.ArrayList;

// public class Main{
//     public static void main(String[] args) {
//         ArrayList<Integer>numbers = new ArrayList<Integer>();
//         numbers.add(5);
//         numbers.add(9);
//         numbers.add(8);
//         numbers.add(1);
//         numbers.forEach((n) -> {System.out.println(n);});
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         int x = 5;
//         int y = 6;
//         int sum = x + y;
//         System.out.println(sum);
//     }
// }

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         int x, y, sum;
//         Scanner myObj = new Scanner(System.in);
//         System.out.println("Type a number:");
//         x = myObj.nextInt();
//         System.out.println("Type another number:");
//         y = myObj.nextInt();

//         sum = x+y;
//         System.out.println("sum is: " + sum);
//     }
// }

// public class Main {

//      public static void main(String[] args) {
//         String words = "One Two Three Four";
//         int countWords = words.split("\\s").length;
//         System.out.println(countWords);
//      }
// }

// public class Main {

//     public static void main(String[] args) {

//         String originalStr = "Hello";
//         String reversedStr = "";
//         System.out.println("Original string: " + originalStr );
//         for (int i = 0; i < originalStr.length(); i++){
//            reversedStr = originalStr.charAt(i) + reversedStr;
//         }
//         System.out.println("Reversed string: " + reversedStr);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         int[] myArray = {1, 5, 10, 25};
//         int sum = 0;
//         int i;
//         for (i = 0; i < myArray.length; i++){
//             sum += myArray[i];
//         }
//         System.out.println("The sum is: " + sum);
//     }
// }

// public class Main {

//      public static void main(String[] args) {
//         int length = 5;
//         int width = 2;
//         int area = length * width;
//         System.out.println("Area of rectangle: " + area);
//      }
// }

//import javca.util.Scanner
public class Main {

    public static void main(String[] args) {
        int number = 5;
        if (number % 2 == 0){
            System.out.println(number + " : is even.");
        }else{
            System.out.println(number + ": is odd.");
        }
    }
}