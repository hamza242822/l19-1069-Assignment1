package com.myfirstproject;
// q1
// over here we see there is a diamond problem Or we see hybrid inheritance as java does not support this
// diagram given in q1  which shows multiple inheritance as Class D extends both classes B & C.
// Now  assume we have a method in class A and class B & C .Wait!! here the problem comes –
// Because D is extending both B & C so if D wants to use the same method  which method would be called
// (the overridden method of B or the overridden method of C)./Over here is the position where error occurs
// That’s the main reason why Java does not support multiple inheritance.
// To solve the problem we use interface in java
 interface Vehicle {
    public void identification();
}
interface Car extends Vehicle {
    public void identification();
}
interface Boat extends Vehicle {
    public void identification() ;
}
 class Amphicar implements Car,Boat {
    public void identification(){
         System.out.println("This is for car");
         System.out.println("This is for boat");
         }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
    Amphicar amphicar=new Amphicar();
    amphicar.identification();
    }
}
