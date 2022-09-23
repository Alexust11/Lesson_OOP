public class human {
    int  yearOfBirth;
    String name;
    String town;
    String job;

    public human(int yearOfBirth, String name, String town, String job) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.job=job;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override

    public String toString() {
        return " Привет! Меня зовут "+name+".  Я из города "+town+". Я родился(лась) в "+(2022-yearOfBirth)+ " году. Я работаю на должности: "+ job+". Будем знакомы!";
    }
}
