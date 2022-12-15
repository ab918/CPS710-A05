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
    return null;
    }
    
  public Boolean isSame (HLObject other) 
    {
    return null;
    } 
    
  public Boolean contains (HLObject element) 
    {
    return null;
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

  public HLString add(HLObject op)
    {
    return null;
    }

  public HLString sub(HLObject op)
    {
    return null;
    }

  public HLString mul(HLObject op)
    {
    return null;
    }
   
   public HLString mod(HLObject op)
     {
    return null;
     } 
      
  public HLList div(HLObject op)
    {
    return null;
    }


// Other Methods  

// Helper Methods  

}
