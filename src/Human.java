public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human(int age, String name, String town, String job) {
        setYearOfBirth(age);
        if (name == null || "".equals(name)) {
            this.name = "Информация не указана";
        } else {

            this.name = name;
        }
        if (town == null || "".equals(town)) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job == null || "".equals(job)) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int age) {
        if (2022 - age < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = 2022 - age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. " + "Я работаю на должности " + job + ". Будем знакомы!";
    }
}
