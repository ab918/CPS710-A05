import java.math.*;

/**
 * Implements HLInteger
 */

public class HLInteger extends HLObject {

//Instance Variables
// I have found it simpler to wrap HLInteger around a primitive int value
// but it could also be wrapped around an Integer value.

  int value;
  
// Class variables

  public static HLInteger zero = new HLInteger(0);

// Constructors
  
  public HLInteger(int value)
    {
    }                
  
  public HLInteger(Integer num)
    {
      value = num;
    }

// Overloaded  HLObject Methods

  public HLObject deepclone()
    {
    return null;
    }

  public int intType()
    {
    return HLType.INT;
    }

  public int iteratorType()
    {
    return HLType.NONE;
    }

  public String toString()
    {
      System.out.println("destiny is mine");
    return "destiny is mine";
    }

  public Boolean isSame (Integer one, Integer two) 
    {
      if(one == two) {
        return true;
      }
      return false;
    }

  public HLInteger negate()
    {
    return null;
    }

  public HLInteger add(Object object)
    {
      value = 0;
      ASTsum sum = (ASTsum)object;
      for(int i = 0; i < sum.jjtGetNumChildren(); ++i) {
        System.out.print(sum.jjtGetChild(i));
        if(sum.jjtGetChild(i).toString().equals("neg") == true) {
          String str = sum.jjtGetChild(i).jjtGetChild(0).toString();
          String[] arrOfStr = str.split(":",2);
          value = value - Integer.parseInt(arrOfStr[1]);
        }
        else if(sum.jjtGetChild(i).toString().equals("pos") == true) {
          String str = sum.jjtGetChild(i).jjtGetChild(0).toString();
          String[] arrOfStr = str.split(":",2);
          value = value + Integer.parseInt(arrOfStr[1]);
        }
        else if(sum.jjtGetChild(i).toString().equals("sum") == true) {
          System.out.print(" BRACKET FROM TOP ");
        }
        else {
          String str = sum.jjtGetChild(i).toString();
          String[] arrOfStr = str.split(":",2);
          value = value + Integer.parseInt(arrOfStr[1]);
        }
      }
      System.out.println(" END OF SUM = " + value);
    return null;
    }

  public HLInteger sub(Integer intIn)
    {
      value = value - intIn;
    return null;
    }

  public HLInteger mul(HLObject operand)
    {
    return null;
    }

  public HLInteger mod(Object object)
    {
      value = 0;
      ASTmod mod = (ASTmod)object;

      for(int i = 0; i < mod.jjtGetNumChildren(); ++i) {
        // System.out.print("stuff: "+ mod.jjtGetChild(i).toString());
        if(i == 0) {
          String str = mod.jjtGetChild(i).toString();
          String[] arrOfStr = str.split(":",2);
          if(arrOfStr[0].equals("sum") == true) {
            System.out.print("BRACKET from top " + mod.jjtGetChild(i).jjtGetChild(0) + " bracket");
            if(mod.jjtGetChild(i).jjtGetChild(0).toString().equals("neg") == true) {
              System.out.print(mod.jjtGetChild(i).jjtGetChild(0).jjtGetChild(0));
              String strB = mod.jjtGetChild(i).jjtGetChild(0).jjtGetChild(0).toString();
              String[] arrOfStrB = strB.split(":",2); 
              value = value + (-1*Integer.parseInt(arrOfStrB[1]));
            }
          }
          else {
            value = value + Integer.parseInt(arrOfStr[1]);
          }
        }

        else {
          String str = mod.jjtGetChild(i).toString();
          String[] arrOfStr = str.split(":",2);
          if(arrOfStr[0].equals("sum") == true) {
            System.out.print("BRACKET from bottom " + mod.jjtGetChild(i).jjtGetChild(0) + " bracket");
            if(mod.jjtGetChild(i).jjtGetChild(0).toString().equals("neg") == true) {
              System.out.print(mod.jjtGetChild(i).jjtGetChild(0).jjtGetChild(0));
              String strB = mod.jjtGetChild(i).jjtGetChild(0).jjtGetChild(0).toString();
              String[] arrOfStrB = strB.split(":",2); 
              value = value % (-1*Integer.parseInt(arrOfStrB[1]));
            }
          }
          else {
            value = value % Integer.parseInt(arrOfStr[1]);
          }
        }
      }
      System.out.println(" END OF SUM = " + value);
    return null;
    }

  public HLInteger div(Object object)
    {
      value = 0;
      ASTdiv div = (ASTdiv)object;

      for(int i = 0; i < div.jjtGetNumChildren(); ++i) {
        System.out.print("stuff: "+ div.jjtGetChild(i).toString());
        if(i == 0) {
          String str = div.jjtGetChild(i).toString();
          String[] arrOfStr = str.split(":",2);
          if(arrOfStr[0].equals("sum") == true) {
            System.out.print("BRACKET from top " + div.jjtGetChild(i).jjtGetChild(0) + " bracket");
            if(div.jjtGetChild(i).jjtGetChild(0).toString().equals("neg") == true) {
              System.out.print(div.jjtGetChild(i).jjtGetChild(0).jjtGetChild(0));
              String strB = div.jjtGetChild(i).jjtGetChild(0).jjtGetChild(0).toString();
              String[] arrOfStrB = strB.split(":",2); 
              value = value + (-1*Integer.parseInt(arrOfStrB[1]));
            }
          }
          else {
            value = value + Integer.parseInt(arrOfStr[1]);
          }
        }

        else {
          String str = div.jjtGetChild(i).toString();
          String[] arrOfStr = str.split(":",2);
          if(arrOfStr[0].equals("sum") == true) {
            System.out.print("BRACKET from bottom " + div.jjtGetChild(i).jjtGetChild(0) + " bracket");
            if(div.jjtGetChild(i).jjtGetChild(0).toString().equals("neg") == true) {
              System.out.print(div.jjtGetChild(i).jjtGetChild(0).jjtGetChild(0));
              String strB = div.jjtGetChild(i).jjtGetChild(0).jjtGetChild(0).toString();
              String[] arrOfStrB = strB.split(":",2); 
              value = value / (-1*Integer.parseInt(arrOfStrB[1]));
            }
          }
          else {
            value = value / Integer.parseInt(arrOfStr[1]);
          }
        }
      }
      System.out.println(" END OF SUM = " + value);
    return null;
    }

// Other Methods  

  public Boolean isGreater (Integer one, Integer two) 
    {
      if(one > two) {
        return true;
      }
      return false;
    }

    public Boolean isLesser (Integer one, Integer two) 
    {
      if(one < two) {
        return true;
      }
      return false;
    }

    public Boolean isGE (Integer one, Integer two) 
    {
      if(one >= two) {
        return true;
      }
      return false;
    }

    public Boolean isLE (Integer one, Integer two) 
    {
      if(one <= two) {
        return true;
      }
      return false;
    }

// Helper Methods  
   
  
}
