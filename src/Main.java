public class Main {

    public static void main(String[] args) {
        // Задача 1,2
        Human max=new Human("Максим",35,"Минск","бренд-менеджер");
        Human anna=new Human("Аня",29,"Москва","методист образовательных программ");
        Human ket=new Human("Катя",28,"Калининград","продакт-менеджер");
        Human artem=new Human("Артем",27,"Москва","директор по развитию бизнеса");
        Human vlad = new Human("Владимир", 21, " ", "Нигде не работаю");
        vlad.setYearOfBirth(22);
        Flower rose = new Flower("Роза", "", "Голландия", 35.59f);
        Flower chrysanthemum = new Flower("Хризантема", "", "", 15f,5);
        Flower pion = new Flower("Пион", "", "Англия", 69.9f,1);
        Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.5f,10);









        System.out.println(max.toString());
        System.out.println(anna.toString());
        System.out.println(ket.toString());
        System.out.println(artem.toString());
        System.out.println(vlad.toString());

        System.out.println("__________________ Задача 2____________________________");
        System.out.println(rose.toString());
        System.out.println(chrysanthemum.toString());
        System.out.println(pion.toString());
        System.out.println(gypsophila.toString());

        System.out.println("_______________Дополниетльное задание____________");
        costFlowers(rose,rose,rose, chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,gypsophila);
    }


    public static void costFlowers(Flower... flower) {
        float cost = 0;
        int min=flower[0].lifeSpan;

        System.out.println("Состав букета ");
        for (int i = 0; i < flower.length; i++) {
            cost = cost + flower[i].getCost();
            System.out.println(flower[i].getFlowerName());
            if (flower[i].lifeSpan < min) {
                min = flower[i].lifeSpan;
            }
        }

        System.out.println("Цена букета состовляет " + (1.1*cost) + " руб.");
        System.out.println("Срок хранение букета состовляет "+min+ " дн.");
    }

}