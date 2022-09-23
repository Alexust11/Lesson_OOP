public class Main {
    public static void main(String[] args) {
        // Задача 1,2
        human max=new human();
        human anna=new human();
        human ket=new human();
        human artem=new human();
        max.name = "Максим";
        max.yearOfBirth = 35;
        max.town = "Минск";
        anna.name = "Аня";
        anna.yearOfBirth = 29;
        anna.town = "Москва";
        ket.name = "Катя";
        ket.yearOfBirth = 28;
        ket.town = "Калининград";
        artem.name = "Артем";
        artem.yearOfBirth = 27;
        artem.town = "Москва";
        max.job = "бренд-менеджер";
        anna.job = "методист образовательных программ";
        ket.job = "продакт-менеджер";
        artem.job = "директор по развитию бизнеса";

        System.out.println(max.toString());
        System.out.println(anna.toString());
        System.out.println(ket.toString());
        System.out.println(artem.toString());




    }
}