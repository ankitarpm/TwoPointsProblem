import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

            ArrayList<Integer> pos = new ArrayList<Integer>();
            TwoPoints.FormCircle(pos);
            int x = pos.get(0) - 1;
            int y = pos.get(1) - 1;
            TwoPoints.computePointofIntersection(x,y );
    }
}