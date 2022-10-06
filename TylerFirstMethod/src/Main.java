public class Main {
    public static void main(String[] args) {

        //String faction = "Jedi";
        String faction = "Sith";
        int powerOfTheForce = 2000;

        if (faction == "Jedi") {
            System.out.println("The Light Saber is blue");
        } else if(faction == "Sith") {
            System.out.println("The Light Saber is Red");
        } else {
            System.out.println("No Light Saber");
        }

        if (powerOfTheForce < 1000) {
            System.out.println("The Force is Weak with you young-ling");
        } else if(powerOfTheForce > 1000 && powerOfTheForce <= 2000) {
            System.out.println("The Force is Strong With You");
        } else {
            System.out.println("There is no try only do");
        }
    }
}