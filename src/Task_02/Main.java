package Task_02;

// Главный класс
public class Main {
    public static void main(String[] args) {
        GameCharacter[] characters = {
                new Warrior("Воин"),
                new Mage("Маг"),
                new Archer("Лучник")
        };

        for (GameCharacter character : characters) {
            character.attack();
        }
    }
}

