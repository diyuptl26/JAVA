/**
 * Purpose: Represents a monster with health and a name. The monster can take damage, regain health, roar, and display its current status.
 * 
 * @author  ITSC 1213
 * @version Feb 01, 2025
 */
public class Monster {
    private int health;
    private String name;

    public Monster(int startHealth, String startName) {
    health = startHealth;
    name = startName; 

    }

    public void takeDamage(int dmg) {
        if(health > 0) {
            health= health - dmg;
        }
    }

    public void heal(int amount) {
        int cap = 100;
        if (health + amount > cap) 
          {  health = cap;}
         else 
         {
            health = health + amount; }
    }

    public void roar(Player p) {
        health = health - 40; 
    }


    public void displayStatus()
    { System.out.println("Health :" + health + "\tName :" + name ); }
}