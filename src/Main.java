public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower(null, "Голандия", 35.59, "Роза");
        Flower flower2 = new Flower("", null, 15, "Хризантема");
        flower2.setLifeSpan(5);
        Flower flower3 = new Flower(null, "Англия", 69.9, "Пион");
        flower3.setLifeSpan(1);
        Flower flower4 = new Flower(null, "Турция", 19.5, "Гипсофила");
        flower4.setLifeSpan(10);
        System.out.println(flower1);
        System.out.println(flower2);
        System.out.println(flower3);
        System.out.println(flower4);
        Object[][] bouquet = new Object[3][2];
        bouquet[0][0] = flower1;
        bouquet[0][1] = 3;
        bouquet[1][0] = flower2;
        bouquet[1][1] = 5;
        bouquet[2][0] = flower4;
        bouquet[2][1] = 1;
        Flower.createBouquet(bouquet);

    }

    private static void test1() {
        Human human1 = new Human(35, "Максим", "Минск", "бренд-менеджер");
        System.out.println(human1);
        Human human2 = new Human(29, "Аня", "Москва", "методист образовательных программ");
        System.out.println(human2);
        Human human3 = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        System.out.println(human3);
        Human human4 = new Human(27, "Артем", "Москва", "директор тпо развитию бизнеса");
        System.out.println(human4);
        Human human5 = new Human(2027, "", null, "директор тпо развитию бизнеса");
        System.out.println(human5);
        Human human6 = new Human(21, "Владимир", "Казань", null);
        System.out.println(human6);
    }
}
