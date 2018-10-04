import java.util.Scanner;

public class Conditionals {


    public static  void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("wat is je leeftijd?");
        int leeftijd = scan.nextInt();


        if (leeftijd >= 18) {


            System.out.println("Mooi en nu je kop eraf zuipen");

        } else {
            System.out.println("Je mag nog geen alcohol kopen");

        }
    }

}




// Boolean teacherTalks == false
//if (teacherTalks != true) {

//System.out.println("Ok, Teacher talks'");


// } else {

// System.out.println("Teacher does not talk");


//      }


//  }
// }