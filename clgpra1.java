import java.util.*;

public class clgpra1 {
    public static void main(String[] args) {
        Scanner cram = new Scanner(System.in);

        float a,b,c,d,e,f,x,y;
        System.out.print("From eq1:  \n");
        System.out.print("Enter value of a:-  ");
        a = cram.nextFloat();
        System.out.print("Enter value of b:-  ");
        b = cram.nextFloat();
        System.out.print("Enter value of e:-  ");
        e = cram.nextFloat();
        System.out.print("From eq2:  \n");
        System.out.print("Enter value of c:-  ");
        c = cram.nextFloat();
        System.out.print("Enter value of d:-  ");
        d = cram.nextFloat();
        System.out.print("Enter value of f:-  ");
        f = cram.nextFloat();

        x = (((e*d)-(b*f) / (a*d)-(b*c)) / e );
        y = (((a*f)-(e*c) / (a*d)-(b*c)) / f );
        System.out.print("The value of x:-  " + x);
        System.out.print("The value of y:-  " + y);
    }
}
