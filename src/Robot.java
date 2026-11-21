// this was way easier than i expected 
public class Robot {
    private int health;
    private int energy;
    private boolean shielded;

    public Robot() {
        reset();
    }

    public int getHealth() {
        return health;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isShielded() {
        return shielded;
    }

    public void reset() {
        health = Constants.MAX_HEALTH;
        energy = Constants.START_ENERGY;
        shielded = false;
    }
 
    // health and energy checks
    // forgot about Math so i had to do some research for that, guess i have my sources ready
    public void takeDamage(int amount) {
        health = Math.max(0, health - amount);
    }
 
    
    public void heal(int amount) {
        health = Math.min(Constants.MAX_HEALTH, health + amount);
    }
 
   
    public void spendEnergy(int amount) {
        energy = Math.max(0, energy - amount);
    }
 
    
    public void gainEnergy(int amount) {
        energy = Math.min(Constants.MAX_ENERGY, energy + amount);
    }
 
    public void activateShield() {
        shielded = true;
    }
 
    public void expireShield() {
        shielded = false;
    }
 
    public boolean isDefeated() {
        return health <= 0;
    }
}
