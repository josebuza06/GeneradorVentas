public class Testclass implements aritmeticos{
    public static void main(String[] caguamiller) {

        System.out.println( "la suma da: " + new Testclass().suma(1,6));
        System.out.println( "la resta es: " + new Testclass().resta(4,5));
        System.out.println( "la multiplicacion da: " + new Testclass().Mult(10,10));
        System.out.println( "la division da: " + new Testclass().Div(50,5));

    }

    @Override
    public int suma(int x, int y) {

        return x+y;
    }

    @Override
    public int resta(int x, int y) {
        return x-y;
    }

    @Override
    public int Mult(int x, int y) {
        return x*y;
    }

    @Override
    public int Div(int x, int y) {
        return x/y;
    }
}
interface  aritmeticos {
    public  int suma(int x, int y);

    public  int resta (int x, int y);

    public  int Mult(int x, int y);

    public  int Div(int x, int y);
}