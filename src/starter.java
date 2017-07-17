import java.util.Scanner;

/**
 * Created by Will on 7/16/2017.
 * Cloned from repository Crospimoget/JavaGitPractice
 */
public class starter {

    public static void main(String[] args) {

        boolean flag = true;
        System.out.println("Git practice with Java.");
        System.out.println("Git practice with JavaBranch.");


        while(flag) {
            System.out.print("Enter a username: ");

            Scanner sc = new Scanner(System.in);
            String userName = sc.nextLine();

            if(userName.length() > 0) {
                System.out.println("Your username is " + userName);
                flag = false;
            }
            else {
                System.out.println("Please enter a valid user name.");
            }
        }








    }
}
