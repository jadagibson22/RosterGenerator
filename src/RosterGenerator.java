import java.util.ArrayList;
import java.util.Scanner;

//creating a RosterGenerator class
public class RosterGenerator {


    //setting the main for the entire lab
    public static void main(String[] args) {
        int count = 5;
        int i=1;
        int jerseyNumber[] = new int[100];
        for(int j =0 ; j < jerseyNumber.length;j++) {
            jerseyNumber[j]=0;
        }

        player[] arr= new player[5];

        Scanner sc = new Scanner(System.in);
        //setting up input system for user
        while(count > 0) {
            System.out.println("enter player "+i+ " jersey number");
            int n = sc.nextInt();
            System.out.println("enter player "+i+ " rating number");
            int rn = sc.nextInt();
            if(jerseyNumber[n] == 0) {
                player p1 = new player(n,rn);
                arr[i-1]=p1;
                jerseyNumber[n]=jerseyNumber[n]+1;
                i++;
                count--;
            }
        }
        //setting up menu for options
        while(true) {
            //printing out the menu
            System.out.println("MENU");
            System.out.println("u - update player rating");
            System.out.println("a - output players above a rating");
            System.out.println("r - replace player");
            System.out.println("o - output roster");
            System.out.println("q - quit");
            sc.hasNextLine();

            String response = sc.nextLine();
            //allows us to use the menu system and get the right format
            if(response.equals("q")) {
                break;
            }else if(response.equals("u")) {
                updatePlayer(arr);
            }else if(response.equals("a")) {
                outputPlayerAboveRating(arr);
            }else if(response.equals("r")) {
                replacePlayer(arr);
            }else if(response.equals("o")) {
                outputRoster(arr);
            }





        }


    }
    //if player rating is above rating prompt
    private static void outputPlayerAboveRating(player[] arr) {
        System.out.println("enter a rating");
        Scanner sc = new Scanner(System.in);
        int rating =sc.nextInt();
        System.out.println("ABOVE"+rating);

        for(int i=0;i<5;i++) {
            if(arr[i].getRating()>rating) {
                System.out.println(arr[i]);
            }
        }


    }
    //how to replace player in input settings
    private static void replacePlayer(player[] arr) {
        System.out.println("enter a jersey Number");
        Scanner sc = new Scanner(System.in);
        int jerseyNumber =sc.nextInt();

        //input system for user
        for(int i=0;i<5;i++) {
            //input system for user
            if(arr[i].getJerseyNumber()==jerseyNumber) {
                System.out.println("enter player new jersey number");
                int jn= sc.nextInt();
                System.out.println("enter player new rating number");
                int rating= sc.nextInt();
                arr[i].setRating(rating);
                arr[i].setJerseyNumber(jn);


            }
        }

    }
    //system to update player for input user
    private static void updatePlayer(player[] arr) {
        System.out.println("enter a jersey number");
        Scanner sc = new Scanner(System.in);
        int jerseyNumber =sc.nextInt();
    //input system for user
        for(int i=0;i<5;i++) {
            if(arr[i].getJerseyNumber()==jerseyNumber) {
                System.out.println("enter player new rating number");
                int rating= sc.nextInt();
                arr[i].setRating(rating);


            }
        }

    }
    //output the roster that the input user did
    private static void outputRoster(player[] arr) {
        for(int i=0;i<5;i++) {
            System.out.println(arr[i]);
        }

    }

}


