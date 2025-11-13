package pojo;


import java.util.List;

public class Cats {

    private String typeOfCats;
    private String ownerName;
    private int quantityOfCats;


    private List<Item> listOfCats;

    public Cats() {
    }


    public String getTypeOfCats() {
        return typeOfCats;
    }

    public void setTypeOfCats(String typeOfCats) {
        this.typeOfCats = typeOfCats;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getQuantityOfCats() {
        return quantityOfCats;
    }

    public void setQuantityOfCats(int quantityOfCats) {
        this.quantityOfCats = quantityOfCats;
    }

    public List<Item> getListOfCats() {
        return listOfCats;
    }

    public void setListOfCats(List<Item> listOfCats) {
        this.listOfCats = listOfCats;
    }
}

