import java.util.*;
/**
 * Implements HLString objects
 */

public class HLString extends HLObject{

//Instance Variables

  private String value;
  private int len;
  
// Class variables

  public static HLString nullstring = new HLString();

// Constructors
  
  public HLString()
    {
    }

  public HLString(String str)
    {
      value = str;
      len = str.length();
    }

// Overloaded  HLObject Methods

  public HLObject deepclone()
    {
    return null;
    }
  
  public int intType()
    {
    return HLType.STR;
    }

  public int iteratorType()
    {
    return HLType.INT;
    }

  public String toString()
    {
    return value.toString();
    }
    
  public Boolean isSame (String one, String two) 
    {
      if(one.equals(two) == true) {
        // System.out.print("FROM HLSTRING IS TRUE: "+one+" and "+two);
        return true;
      }
      // System.out.print("FROM HLSTRING IS FALSE ");
      return false;
    } 
    
  public Boolean contains (String one, String two) 
    {
      if(two.contains(one) == true) {
        return true;
      }
    return false;
    }
    
  public HLInteger getLength()
    {
    return null;
    }
    
  public HLInteger indexOf(HLObject op)
    {
    return null;
    }
    
  public HLString elementRetrieval(int index)
    {
    return null;
    }   

  public HLString intervalRetrieval(int fromindex, int toindex)
    {
    return null;
    }    

  public HLString replace(ArrayList indexes, HLObject newvalue)
    {
    return null;
    }

  public HLString add(String strIn)
  {
    value = value + strIn;
    return null;
  }

  public String sub(String strIn)
    {
      value = value.replaceFirst(strIn, "");
      return value;
    }

  public String mul(String strIn)
    {
      String hold = value;
      Integer num = Integer.parseInt(strIn);
      if(num == 0) {
        value = "";
      }
      else {
        for(int i = 0; i < num-1; ++i) {
          value = value + hold;
        }
      }
    return value;
    }
   
   public String mod(String strIn)
     {
      Integer n = Integer.parseInt(strIn);
      Integer num = value.length();
      // System.out.print(num + "%" + n + " = ");
      num = num%n;
      // System.out.print(""+ num);
      value = value.substring(value.length() - num);
    return value;
     } 
      
  public HLList div(HLObject op)
    {
    return null;
    }


// Other Methods  

// Helper Methods  

}
