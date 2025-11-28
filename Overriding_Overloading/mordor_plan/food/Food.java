package food;

public abstract class Food {
    protected  int happinessPoints;

    Food(int happinessPoints) {
    }

    public int getHappinessPoints() {
        return happinessPoints;
    }

    public void setHappinessPoints(int happinessPoints) {
        this.happinessPoints = happinessPoints;
    }
}
