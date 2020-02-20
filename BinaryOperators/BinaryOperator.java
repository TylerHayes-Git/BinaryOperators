public abstract class BinaryOperator {

    public BinaryOperator ( double op1, double op2 ){
        fOp1 = op1;
        fOp2 = op2;
    }
    public abstract double DoOp ();
    
    protected final double fOp1;
    protected final double fOp2;
        
} // class BinaryOperator
