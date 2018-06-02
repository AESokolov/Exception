// Creation of a class for error handling    —оздание класса дл€ обработки ошибок
public class Falcon extends Exception {
	public void Falcon() {
    }
}
class Arithmetic {
    public static double myDelete(double a, double b) throws Falcon {
        double c;
        try {
            if (b == 0.0) {
                throw new Falcon();
            }
            c = a / b;
        } catch (Falcon e) {
            c = 0.0; 
            System.exit(0);
        }
        return c;
    }
 
    public static void main(String[] args) {
        try {
            System.out.println("5.1 to divide on 1.2 will be "     //5.1, разделить на 1.2 будет
            + myDelete(5.1, 1.2));
            System.out.println("What is? Have you decided to divide on 0?");  //„то такое? ¬ы решили делить на 0?
            System.out.println("3.6 to divide on 0 will be "       //3.6, разделить на 0 будет
                    + myDelete(3.6, 0));
            System.out.println("7.8 to divide on 3.9 will be "      // 7.8, разделить на 3.9 будет
                    + myDelete(7.8, 3.9));
 
        } catch (Falcon e) {
            // ...
        }
    }
   
}
