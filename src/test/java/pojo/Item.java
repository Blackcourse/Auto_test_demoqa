package pojo;

public class Item {


    private static String name;
    private static String color;

    public Item() {}
    public Item(String name, String color) {
        this.name = name;
        this.color = color;

    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
