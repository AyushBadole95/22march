// public class Recursion {
//     public static void main(String[] args) {
//         int result = sum(10);
//         System.out.println(result);
//     }
//     public static int sum(int k){
//         if(k > 0){
//             return k + sum(k - 1);
//         }else{
//             return 0;
//         }
//     }
// }
// public class Recursion {

//     public static void main(String[] args) {
//         int result = sum(5, 10);
//         System.out.println(result);
//     }
//     public static int sum(int x, int y){
//         if (y > x){
//             return y + sum(x, y-1);
//         }else{
//             return y;
//         }
//     }
// }

// public class Recursion{

//     public static void main(String[] args) {
//         int number = 10;
//         int sum = addNumbers(number);
//         System.out.println("Sum = " + sum);
//     }

//     public static int addNumbers(int num) {
//         if (num > 0)
//             return num + addNumbers(num - 1);
//         else
//             return num;
//     }
// }

// public class Recursion {

//     public static void main(String[] args) {
//         Methods myObj = new Methods();          (input in previous class Methods)
//         System.out.println(myObj.x);
//     }
// }

// public class Recursion {
//    final int x = 10;
//     public static void main(String[] args) {
//         Recursion myObj = new Recursion();
//         //myObj.x = 25;
//         System.out.println(myObj.x);
//     }
//     }

// public class Recursion {

//     int x = 5;
//     public static void main(String[] args) {
//         Recursion myObj1 = new Recursion();
//         Recursion myObj2 = new Recursion();
//         myObj2.x = 25;
//         System.out.println(myObj1.x);
//         System.out.println(myObj2.x);
//     }
// }

// public class Recursion {

//     String fname = "Anshul";
//     String lname = "Badole";
//     int Age = 29;
//     public static void main(String[] args) {
//         Recursion myObj = new Recursion();
//         System.out.println("Name: " + myObj.fname + " "+ myObj.lname);
//         System.out.println("Age: " + myObj.Age);
//     }
// }

// public class Recursion {

//     static void myMethodS(){
//         System.out.println("x");
//     }
//     public void myMethodP(){
//         System.out.println("y");
//     }
//     public static void main(String[] args) {
//         myMethodS();
//         Recursion myobj = new Recursion();
//         myobj.myMethodP();
//     }
// }

// public class Recursion {
//     public void fullThrottle(){
//         System.out.println("At full speed");
//     }
//     public void speed(int maxSpeed){
//         System.out.println("max speed is: " + maxSpeed);
//     }
//     public static void main(String[] args) {
//         Recursion myCar = new Recursion();
//         myCar.fullThrottle();
//         myCar.speed(200);
//     }
// }

// public class Recursion {
//     public static void main(String[] args) {
//        Methods myCar = new Methods();     // Create a myCar object
//         myCar.fullThrottle();      // Call the fullThrottle() method
//         myCar.speed(200);          // Call the speed() method
//       }
//     }

// public class Recursion {
//         int x;
//         public Recursion(){
//             x = 5;
//         }
//         public static void main(String[] args) {
//             Recursion myObj = new Recursion();
//             System.out.println(myObj.x);
//         }
//     }
// public class Recursion {

//     int modelYear;
//     String modelName;

//     public Recursion(int year, String name){
//         modelYear = year;
//         modelName = name;
//     }
//         public static void main(String[] args){
//             Recursion myCar = new Recursion(1996, "Hyndai");
//             System.out.println(myCar.modelYear + " " + myCar.modelName);
//         }   
// }