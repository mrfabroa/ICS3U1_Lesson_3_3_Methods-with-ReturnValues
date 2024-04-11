class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here    
    String combined = combineStr("Hello", "World");
    System.out.println(combined);

    System.out.println("The square root of 4 is " + mySqrt(4) + "." );
  }

  private String combineStr(String str1, String str2){
    return str1+str2;
  }

  private double mySqrt(double dblSquare){

    return Math.pow(dblSquare,0.5);
  }

}