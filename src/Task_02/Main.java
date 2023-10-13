package Task_02;

// Абстрактный класс GameCharacter
abstract class GameCharacter {
    protected String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    // Абстрактный метод attack
    public abstract void attack();
}

// Конкретный класс Warrior
class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " атакует мечом!");
    }
}

// Конкретный класс Mage
class Mage extends GameCharacter {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " использует магическое заклинание!");
    }
}

// Конкретный класс Archer
class Archer extends GameCharacter {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " стреляет из лука!");
    }
}

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

