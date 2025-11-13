package pojo;


import java.util.List;

public class Cats {
        private String typeOfCats;
        private String nameOfOwner;
        private int quantityOfCats;
        private  List<Item> cats;

   // public Cats() {
    //}

    // public Cats (String nameOfOwner, String typeOfCats, int quantityOfCats , List<Item> cats) {
      //      this.quantityOfCats = quantityOfCats;
        //    this.typeOfCats = typeOfCats;
          //  this.nameOfOwner = nameOfOwner;
            //this.cats = cats;
       // }

        public String getTypeOfCats() {
            return typeOfCats;
        }

        public void setTypeOfCats(String typeOfCats) {
            this.typeOfCats = typeOfCats;
        }

        public int getQuantityOfCats() {
            return quantityOfCats;
        }
        public void setQuantityOfCats(int quantityOfCats) {
            this.quantityOfCats = quantityOfCats;
        }


        public String getOwnerName() {
            return nameOfOwner;
        }


        public void setOwnerName(String nameOfOwner) {
            this.nameOfOwner = nameOfOwner;
        }

        public List<Item> getListOfCats() {
            return cats;
        }

        public void setCats(List<Item> items) {
        }

    }

