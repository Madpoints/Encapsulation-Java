package com.Madpoints;

public class Main {

    public static void main(String[] args) {
//        Player player1 = new Player();
//        player1.name = "Madduckets";
//        player1.health = 20;
//        player1.weapon = "Broad sword";
//
//        int damage = 10;
//        player1.loseHealth(damage);
//        System.out.println("Health: " + player1.healthRemaining());
//
//        damage = 11;
//        player1.loseHealth(damage);
//        System.out.println("Health: " + player1.healthRemaining());

        /*Encapsulation*/
        EnhancedPlayer player1 = new EnhancedPlayer("Madduckets", 75, "Broad Sword");
        System.out.println("Starting health: " + player1.getHealth());
    }
}
