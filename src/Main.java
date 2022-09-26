public class Main {
    public static void main(String[] args) {
        // Задача 1,2
        Human max=new Human("Максим",35,"Минск","бренд-менеджер");
        Human anna=new Human("Аня",29,"Москва","методист образовательных программ");
        Human ket=new Human("Катя",28,"Калининград","продакт-менеджер");
        Human artem=new Human("Артем",27,"Москва","директор по развитию бизнеса");
        Human vlad = new Human("Владимир", 21, " ", "Нигде не работаю");
        vlad.setYearOfBirth(22);





        System.out.println(max.toString());
        System.out.println(anna.toString());
        System.out.println(ket.toString());
        System.out.println(artem.toString());
        System.out.println(vlad.toString());





    }
}