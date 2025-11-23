public class CharacterGame {
    private int currentHealth;
    private String name;
    private String status;

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getStatus(){
        return status;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
        if(currentHealth > 0) status = "alive";
        else status = "dead";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damageAmount){
        setCurrentHealth(getCurrentHealth() - damageAmount);
        if (getCurrentHealth() < 0){
            setCurrentHealth(0);
        }
    }
    public void receiveHealing(int healingAmount){
        setCurrentHealth(getCurrentHealth() + healingAmount);
        if(getCurrentHealth() > 100){
            setCurrentHealth(100);
        }
    }
}
