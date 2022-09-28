public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;
    private String name;

    public Flower(String flowerColor, String country, double cost, String name) {
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        this.lifeSpan = 3;
        this.name = name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || "".equals(flowerColor)) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || "".equals(country)) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1.0;
        } else {

            this.cost = cost;
        }

    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public static void createBouquet(Object[][] bouquet) {
        double cost = 0;
        int lifeSpan = Integer.MAX_VALUE;
        System.out.println("Состав букета: ");
        for (int i = 0; i < bouquet.length; i++) {
            Object[] objects = bouquet[i];
            Object object = objects[0];
            Object object1 = objects[1];
            if (object instanceof Flower && object1 instanceof Integer) {
                Flower flower = (Flower) object;
                Integer count = (Integer) object1;
                cost += flower.getCost() * count;
                if (lifeSpan > flower.getLifeSpan()) {
                    lifeSpan = flower.getLifeSpan();
                }
                System.out.print(flower.getName()+ " -  " + count + " ");
            }
        }
        cost += cost * 10 / 100;
        System.out.println();
        System.out.println("Стоимость: " + String.format("%.2f", cost));
        System.out.println("Срок стояния " + lifeSpan);

    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + String.format("%.2f", cost) +
                ", lifeSpan=" + lifeSpan +
                ", name='" + name + '\'' +
                '}';
    }
}

