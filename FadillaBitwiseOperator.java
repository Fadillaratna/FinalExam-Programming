public class FadillaBitwiseOperator {
    public static void main(String[] args) {
        int x = 50;
        int y = 2;

        int resultShiftLeft = x << y;
        System.out.println(x + " << " +  y + " = " + resultShiftLeft);
        
        int resultOr = x | y;
        System.out.println(x + " | " +  y + " = " + resultOr);
    }
}