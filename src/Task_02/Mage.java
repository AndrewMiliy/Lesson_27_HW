package Task_02;

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
