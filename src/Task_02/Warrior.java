package Task_02;

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
