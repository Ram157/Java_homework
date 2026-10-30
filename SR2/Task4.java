public class Task4 {
    static double tangent(int degree) {
        return Math.tan(Math.toRadians(degree));
    }

    public static void main(String[] args) {
        for(int x=0;x<=90;x+=5) {
            if(x==90) {
                System.out.println("tg(90°)=не определён");
            } else {
                System.out.printf(java.util.Locale.US,"tg(%d°)=%.4f%n",x,tangent(x));
            }
        }
    }
}
