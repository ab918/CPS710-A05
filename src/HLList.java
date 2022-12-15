import java.util.*;
/**
 * Implements HLList objects
 */

public class HLList extends HLObject{

//Instance Variables

  private ArrayList value = null;
  private int len = 0;
  
// Class variables

  public static HLList empty = new HLList();

// Constructors
  
  public HLList()
    {
    }

  public HLList(ArrayList lst)
    {
    }

// Overloaded  HLObject Methods

  public HLObject deepclone()
    {
    return null;
    }

  public int intType()
    {
    return HLType.LST;
    }

  public int iteratorType()
    {
    return HLType.ANY;
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

  public HLInteger indexOf(HLObject element)
    {
    return null;
    }
 
  public HLObject elementRetrieval(int index)
    {
    return null;
    }   

  public HLList intervalRetrieval(int fromindex, int toindex)
    {
    return null;
    } 
    
  public HLList replace(ArrayList indexes, HLObject newvalue)
    {
    return null;
    }

   public HLList add(HLObject lst)
    {
    return null;
    }

  public HLList sub(HLObject lst)
    {       
    return null;
    }

  public HLList mul(HLObject op)
    {
    return null;
    }
   
   public HLList mod(HLObject op)
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
