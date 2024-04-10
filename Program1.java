class Main extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    Double dblTest = readDouble("Enter in a double (but don't):");
    System.out.println(dblTest);
    
    String combined = combineStr("Hello", "World");
    System.out.println(combined);
  }

  public String combineStr(String str1, String str2){
    return str1+str2;
  }
}