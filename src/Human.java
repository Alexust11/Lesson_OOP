import java.time.LocalDate;

public class Human {
     int age;
    private int yearOfBirth;
   String name;
    private String town;
     String job;

    public Human(String name, int age, String town, String job) {
        this.name = name;
        this.age = age;
        if (town != null && !town.isEmpty()&&!town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация на указана";
        }
                this.job = job;
        this.yearOfBirth= LocalDate.now().getYear()-this.age;
    }

    public int getYearOfBirth() {

        return yearOfBirth;
    }

    public void setYearOfBirth(int age) {
        if (age > 0) {
            this.yearOfBirth = LocalDate.now().getYear()-age;
        } else {
            this.yearOfBirth=0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация на указана";
        }
    }




    public String toString() {
        return " Привет! Меня зовут " + name + ".  Я из города " + town + ". Я родился(лась) в " + yearOfBirth + " году.Я работаю на должности:" + job + ". Будем знакомы!";
    }
}
