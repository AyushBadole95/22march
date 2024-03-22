// public class Student {

//     protected String subject = "Maths";
//     public void myClass(){
//         System.out.println("there are many student");
//     }
// }
// class College extends Student{
//     private String room = "AA";
//     public static void main(String[] args) {
//         College myobj = new College();
//         myobj.myClass();
//         System.out.println(myobj.subject +" "+ myobj.room);
//         myobj.myClass();
//     } 
// }
// public class Student {

//     public void animalSound(){
//         System.out.println("The animal makes a sound");
//     }
// }
// class pig extends Student{
//     public void animalSound(){
//         System.out.println("The pig says: wee wee");
//     }
// }
// class dog extends Student{
//     public void animalSound(){
//         System.out.println("The dog says: bow wow");
//     }
// }
// class main{
//     public static void main(String[] args) {
//         Student myAnimal = new Student();
//         pig myPig = new pig();
//         dog myDog = new dog();

//         myAnimal.animalSound();
//         myPig.animalSound();
//         myDog.animalSound();
//     }
// }

// Abstract class//
// abstract class Animal{
//     public abstract void animalSound();
//     public void sleep(){
//         System.out.println("Zzzz");
//     }
// }
// class pig extends Animal{
//     public void animalSound(){
//     System.out.println("The pig says : wee wee");
//     }
// }
// class main{
//     public static void main(String[] args) {
//         pig myPig = new pig();
//         myPig.animalSound();
//         myPig.sleep();
//         myPig.animalSound();
        
//     }
// }

//interface//
// interface Student{
//     public void animalSound();
//     public void sleep();
//     }
// class Pig implements Student{
//     public void animalSound(){
//         System.out.println("The pig says: wee wee");
//     }
//     public void sleep(){
//         System.out.println("Zzz");
//     }
// }
// class main{
//     public static void main(String[] args) {
//         Pig myPig = new Pig();
//         myPig.animalSound();
//         myPig.sleep();
//     }
// }

//multiple interfaces//
// interface FirstInterface{
//     public void myMethod();
// }
//     interface SecondInterface{
//         public void myOtherMethod();
//     }
//     class DemoClass implements FirstInterface,SecondInterface{
//         public void myMethod(){
//           System.out.println("Some text...");
//         }
//         public void myOtherMethod(){
//             System.out.println("Some other text..");
//         }
//     }
//     class Main{
//         public static void main(String[] args) {
//             DemoClass myObj = new DemoClass();
//             myObj.myMethod();
//             myObj.myOtherMethod();
//         }
//     }
