import java.util.Scanner;

public class week1_1 {

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        while (true) {

            System.out.println("Enter Traffic Light Colour ( or type exit to stop ) \n");

            String Traffic_light = myObj.nextLine().toLowerCase();
            if (Traffic_light.equals("red")) {
                System.out.println("Stop!!!!");
            }

            else if (Traffic_light.equals("green")){

                System.out.println("GO GO GO!!!");
            }

            else if (Traffic_light.equals("yellow")){

                System.out.println("Wait !!!");
            }

            else if (Traffic_light.equals("exit")){

                System.out.println("Exited");
                break;
            }
        }
    myObj.close();
    }
}
