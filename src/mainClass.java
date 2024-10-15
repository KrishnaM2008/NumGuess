import java.util.Scanner;
public class mainClass {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Hello, try guessing a number between...\n-1 and 10\n-10 and 100\n-100 and 1000");
            int guess = s.nextInt();
            int number = (int)(Math.random()*1000+1);
            if(guess == number){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect. The number was " + number);
            }
        }
    }
}
