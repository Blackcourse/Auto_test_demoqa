package SimpleTest;

public class Main {

    public static void main (String [] args) {

        Human dima = new Human ();
        System.out.println("name " +dima.name);
        System.out.println("age "+ dima.age);
        System.out.println("Cute " +dima.isCute);

        dima.setName("Dmitri");
        dima.setAge(34);
        dima.setCute(true);

        System.out.println(dima);

        dima.setName= ("Valentine");
        System.out.println(dima);






    }


}
