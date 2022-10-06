public class Main {
    public static void main(String[] args) {
    int value = 3;
    if (value == 1){
        System.out.println("Value was 1");
    } else if (value == 2) {
        System.out.println("Value was 2");
    } else {
        System.out.println("Was not 1 or 2");
    }
    int switchValue = 4;

    switch (switchValue){
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("was a 3, or a 4, or a 5");
            break;
        default:
            System.out.println("Was not one or 2");
            break;
    }

        char charValue = 'F';

        switch (charValue){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("This Value was Found and was " + charValue);
                break;
            default:
                System.out.println("not found");
                break;
        }



    // More Code here

    }
}