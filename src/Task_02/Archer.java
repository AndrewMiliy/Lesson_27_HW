package Task_02;

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
