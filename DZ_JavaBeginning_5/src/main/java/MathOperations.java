public class MathOperations {

    public void MultiplicationFunc(float a, float b){
        float res = a * b;
        System.out.println(a + " * " + b + " = " + res);
    }

    public void MinusFunc(float a, float b) {
        float res = a - b;
        System.out.println(a + " - " + b + " = " + res);
    }

    public void PlusFunc(float a, float b){
        float res = a + b;
        System.out.println(a + " + " + b + " = " + res);
    }

    public void DivisionFunc(float a, float b){
        float res = 0;
        try
        {
            res =(float) a / b;
            if (res == Float.POSITIVE_INFINITY || res == Float.NEGATIVE_INFINITY)
            {
                throw  new ArithmeticException();
            }
            else
            {
            System.out.println(a + " / " + b + " = " + res);
            }
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Division on zero!");
        }
    }
}
