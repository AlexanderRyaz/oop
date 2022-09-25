public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(35, "Максим", "Минск", "бренд-менеджер");
        System.out.println(human1);
        Human human2 = new Human(29, "Аня", "Москва", "методист образовательных программ");
        System.out.println(human2);
        Human human3 = new Human(28,"Катя","Калининград", "продакт-менеджер");
        System.out.println(human3);
        Human human4 = new Human(27, "Артем","Москва","директор тпо развитию бизнеса");
        System.out.println(human4);
        Human human5 = new Human(2027, "",null,"директор тпо развитию бизнеса");
        System.out.println(human5);
    }
}
