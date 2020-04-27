package algorithmic;

/* helps in preventing the ugly application crashes. Errors cant be handled */

public class TryCatchFinally {

  public static void main(String[] args) throws Exception {

      tryCatchFinally();

      System.out.println("Next program");    // program halts if exception not caught

    }

    static void  tryCatchFinally() throws Exception {

   try {
       String[] str = new String[4];  //    throw new NullPointerException("NULL");

      String q = str[4];
       System.out.println("POST EXCEPTION IN TRY");           // doesn't run if exception
 //      System.exit(1);
 //      return;

   }

//   int i = 90;    no code can exist between try-catch or try-finally

    catch(ArrayIndexOutOfBoundsException e) {

      System.out.println("Out of bound catch block");   // catch blocked executed only if right type of exception caught.

        return;

    }

   catch(Exception e) {

     System.out.println("catch all block");   // When one catch block handles the exception, the next catch blocks are not executed.

   }


    finally
    {
      System.out.println("finally block");    // finally block is executed no matter exception is caught or no. chance to run guranteed code.
                                               // finally also executes if return in try
    }






  }


}

/**
TRY-FINALLY
Normal execution - Finally , Next Program
Exception - Finally

 TRY-CATCH-FINALLY
 Normal execution - Finally , Next Program
Exception - catch, finally, Next Program

 TRY-CATCH
 Normal execution -  Next Program
 Exception - catch, Next Program
*/