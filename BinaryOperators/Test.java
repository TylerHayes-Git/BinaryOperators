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