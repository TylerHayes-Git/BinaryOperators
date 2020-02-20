public class Divider extends BinaryOperator {
    public Divider ( double op1, double op2 ) {
        super( op1, op2 );
    }
    
       public double DoOp (){
        double result = 0;
    
        try {
            if(fOp2 > 0.0 || fOp2 < 0.0) {result = fOp1/fOp2;}
        
            else {throw new ArithmeticException();}   
    
        }    

        catch(ArithmeticException divideByZero){

            System.out.print("Can't divide by ");

        }

        return result;
       }
} // class Divider
