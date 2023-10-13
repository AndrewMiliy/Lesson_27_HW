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
