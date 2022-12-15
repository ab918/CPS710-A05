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
    return null;
    }

  public Boolean isSame (HLObject other) 
    {
    return null;
    }

  public HLInteger negate()
    {
    return null;
    }

  public HLInteger add(HLObject operand)
    {
    return null;
    }

  public HLInteger sub(HLObject operand)
    {
    return null;
    }

  public HLInteger mul(HLObject operand)
    {
    return null;
    }

  public HLInteger mod(HLObject operand)
    {
    return null;
    }

  public HLInteger div(HLObject operand)
    {
    return null;
    }

// Other Methods  


// Helper Methods  
   
  
}
