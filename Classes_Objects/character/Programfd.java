public class Programfd {
    public static void main(String[] args) {
        CharacterGamedsd character1 = new CharacterGamedsd();
        CharacterGamedsd character2 = new CharacterGamedsd();

        character1.name = "Sonic";
        character1.currentHealth = 10;

        character2.name = "Mario";
        character2.currentHealth = 100;

        System.out.printf("Name: %s - Health: %d\n", character1.name, character1.currentHealth);
        System.out.printf("Name: %s - Health: %d\n", character2.name, character2.currentHealth);
    }
}
