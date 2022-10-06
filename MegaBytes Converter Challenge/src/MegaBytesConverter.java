public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes <= 0){
            System.out.println("Invalid Value");
        }
        else if(kiloBytes < 1024){
            System.out.println("Is less than 1 MB");
        }
        else {
            int megaBytes=Math.round(kiloBytes/1024);
            int remainingKiloBytes=Math.round(kiloBytes%1024);
            System.out.println(kiloBytes+" KB = " + megaBytes + " MB and "+ remainingKiloBytes + " KB");
        }
    }
}

//public class MegaBytesConverter {
//    public static void printMegaBytesAndKiloBytes(int kiloBytes){
//        if (kiloBytes<0){
//            System.out.println("Invalid Value");
//        }else{
//            int megaBytes=Math.round(kiloBytes/1024);
//            int remainingKiloBytes=Math.round(kiloBytes%1024);
//            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainingKiloBytes+" KB");
//        }
//    }
//}
