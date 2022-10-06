public class Players {

    public static void playerInfo(String name, int age, String position, int shirtNumber, long price){

        if(price > 4000000L) {
            System.out.println(name +"  is worth more than 4 Million");
        }
            if(price <= 4000000L){
                System.out.println(name + " is 4 Million or less");
            } else if (price <= 0L){
                System.out.println(name + " is not valued!");
            }
        }


    public static void ageOfPlayer(String name, int age) {
        if(age > 24) {
            System.out.println(name + " is over 25 and his age is " + age);
        } else if(age >= 20 && age <= 24){
            System.out.println(name + " is between 20 and 24 and his age is " + age);
        } else {System.out.println(name + " is under 20 and is part of the youth, his age is " + age);}
    }

}
