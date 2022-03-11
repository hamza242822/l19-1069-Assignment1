package com.myfirstproject;
import java.util.Scanner;
interface Protocal{
    public int next();
}
class Game extends Player {
    int secret_number;
    public int high;
    public int low;
    public boolean win_flag;
    Player player;
    Game(Player player){
        System.out.println("Enter the name");
        player.next();
    }
    public void run(){
        System.out.println("Game is running ");
    }
  public boolean haswon(){
      return true;
  }

}
class Player implements Protocal{
    public String name;
    public int next(){
        System.out.println("Players turn");
        return 1;
    }

}
class HumanPlayer extends Player{
    public int next(){
        System.out.println(" Human Players turn");
        return 1;
    }
}
class NaiveAI extends Player{
    public int next(){
        System.out.println("NaiveAI turn");
        return 0;
    }
}
class BinarySearchAI extends NaiveAI{
    public int next(){
        System.out.println("BinarySearchAI turn");
        return 0;
    }
}
class SuperAI extends NaiveAI{
    public int next(){
        System.out.println("SuperAI turn");
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    SuperAI sai=new SuperAI();
    sai.next();

    }
}
