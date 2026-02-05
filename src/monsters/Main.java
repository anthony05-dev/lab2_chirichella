package monsters;

public class Main {

    public static void main(String[] args){
        Monster m1 = new Water("Cthulhu");
        Monster m2 = new Undead("Frankenstien");

        System.out.println("Monster 1 - " + m1.getName());
        System.out.println("Monster 2 - " + m2.getName());


    }

}
