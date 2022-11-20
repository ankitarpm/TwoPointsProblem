import java.util.Scanner;
import java.util.ArrayList;
public class TwoPoints {
    public static void computePointofIntersection(int x, int y){
            while(x!=y) {
                x = (x + 2 ) % 12;
                y = (y + 1) % 12;
            }
            System.out.println("Both nodes meet at " + (x + 1));
        }
    public static void FormCircle(ArrayList<Integer> i){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of x");
        i.add(input.nextInt());
        System.out.println("Enter value of y");
        i.add(input.nextInt());
    }

}
