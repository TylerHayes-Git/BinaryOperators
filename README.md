# BinaryOperators
Another class assignment focused on Polymorphism, but this time in Java.
In the addition, there was the need for exeption handling.


## Abstract Class

```Java
public abstract class BinaryOperator {

    public BinaryOperator ( double op1, double op2 ){
        fOp1 = op1;
        fOp2 = op2;
    }
    public abstract double DoOp ();
    
    protected final double fOp1;
    protected final double fOp2;
        
} // class BinaryOperator
```

## Adder Class

```Java
public class Adder extends BinaryOperator {
    
    public Adder ( double op1, double op2 ) { 
        super( op1, op2 );
    }
        public double DoOp (){
              
           return fOp1 + fOp2;
       
       }
} // class Adder
```

## Substractor Class

```Java
public class Subtractor extends BinaryOperator {
    public Subtractor ( double op1, double op2 ) {
        super( op1, op2 );
    }
       public double DoOp (){
            
           return fOp1 - fOp2;
       }
} // class Subtractor
```

## Multiplier Class

```Java
public class Multiplier extends BinaryOperator {
    public Multiplier ( double op1, double op2 ) {
        super( op1, op2 );
    }
       public double DoOp (){
      
           return fOp1 * fOp2;
       }
} // class Multiplier
```

## Divider Class

```Java
+public class Divider extends BinaryOperator {
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
```

## Test Class

>to call each class method

```Java
public class Test {

   public void Testing (){
      
   final short num = 5;//Five outputs needed check assignment
   BinaryOperator [] binOp = new BinaryOperator[ num ];
   binOp[0] = new Subtractor( 8.0, 9.0 );
   binOp[1] = new Multiplier( 8.0, 9.0 );
   binOp[2] = new Adder( 8.0, 9.0 );
   binOp[3] = new Divider(8.0, 9.0);
   binOp[4] = new Divider( 8.0, 0.0 );

   //System.out.println(binOp[0].DoOp());

      for( int i = 0; i < binOp.length; i++){
            
            System.out.println( binOp[i].DoOp() );

      }
    }
}//class Test
```

## Main Class

>to call the Test() method from the Test Class

```Java
public class Assignment_4 {
    public static void main(String[] args){

        Test obj = new Test();

        obj.Testing();

    }

}//main
```

## Output

```
-1.0
72.0
17.0
0.8888888888888888
Can't divide by 0.0
```
