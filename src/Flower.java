public class Flower {
    private String flowerName;
    private String flowerColor; //Цвет цветка
    private String country; //Страна происхождения
    private float cost; //Стоимость
    int lifeSpan;  //Срок стояния, указанный в целых днях

    public Flower(String flowerName, String flowerColor, String country, float cost) {
        this.flowerName = flowerName;
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) { // если цвет не null и не пустой и не пробелы
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost=1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }

    }

    public Flower(String flowerName, String flowerColor, String country, float cost, int lifeSpan) {
        this.flowerName = flowerName;

        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) { // если цвет не null и не пустой и не пробелы
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost=1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {

        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost=1;
        }
    }

    @Override
    public String toString() {
        return "Цветок{" +
                "Название='" + flowerName + '\'' +
                ", Цвет='" + flowerColor + '\'' +
                ", Страна происхождени='" + country + '\'' +
                ", Цена=" + cost +" руб."+
                ", Срок стояния=" + lifeSpan + " дн."+
                '}';
    }

    public String getFlowerName() {
        return flowerName;
    }
}
