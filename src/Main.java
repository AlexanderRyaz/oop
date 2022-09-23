public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Максим");
        human1.setTown("Минск");
        human1.setYearOfBirth(35);
        human1.setJob("бренд-менеджером");
        System.out.println(human1);
        Human human2 = new Human();
        human2.setName("Аня");
        human2.setTown("Москва");
        human2.setYearOfBirth(29);
        human2.setJob("методистом образовательных программ");
        System.out.println(human2);
        Human human3 = new Human();
        human3.setName("Катя");
        human3.setTown("Калининград");
        human3.setYearOfBirth(28);
        human3.setJob("продакт-менеджером");
        System.out.println(human3);
        Human human4 = new Human();
        human4.setName("Артем");
        human4.setTown("Москва");
        human4.setYearOfBirth(27);
        human4.setJob("директором по развитию бизнеса");
        System.out.println(human4);
    }
}