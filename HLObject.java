import java.util.*;
/**
 * HLObject is a superclass for HLInteger, HLString, and HLList
 * @author Sophie Quigley
 */
public class HLObject
{
/**
 * Returns the type of the HLObject: 
 * one of HLType.ANY (default), HLType.INT, HLType.STR, HLType.LST
 * @return the type of the HLObject: 
 * one of HLType.ANY (default), HLType.INT, HLType.STR, HLType.LST
 */
  public int intType()
    {
    return HLType.ANY;
    }

/**
 * Returns the type of the iterator over this HLObject for the for loop statement:
 * one of HLType.NONE (default), HLType.ANY, HLType.INT, HLType.STR, HLType.LST
 * @return the type of the iterator over this HLObject for the for loop statement:
 * one of HLType.NONE (default), HLType.ANY, HLType.INT, HLType.STR, HLType.LST
 */

  public int iteratorType()
    {
    return HLType.ANY;
    }

/**
 * Creates a deep clone of HLObject
 * @return a deep clone  of HLObject
 */

  public HLObject deepclone()
    {
    return null;
    }

/**
 * Creates String representation of HLObject
 * @return String representation of HLObject
 */
  public String toString()
    {
    return null;
    }
  /**
   * Checks whether other is the same object
   * @param other The other object
   * @return TRUE iff other is the same as the HLObject
   */
  public Boolean isSame (HLObject other) 
    {
    return Boolean.FALSE;
    }
  /**
   * Checks whether other is a different object
   * @param other The other object
   * @return TRUE iff other is different from the HLObject
   */
  public Boolean isDifferent (HLObject other) 
    {
    if (this.isSame(other).booleanValue())
      return Boolean.FALSE;
    else
      return Boolean.TRUE;
    }
  /**
   * Verifies that element is contained in HLList or HLString
   * @param element The element
   * @return TRUE iff element is contained in the HLobject
   */
  public Boolean contains (HLObject element) 
    {
    return Boolean.FALSE;
    }
  /**
   * Finds length of HLList or HLString
   * @return number of elements in HLList or HLString
   */  
  public HLInteger getLength()
    {
    return null;
    }

  /**
   * Returns length of HLList or HLString as an int
   * @return number of elements in HLList or HLString
   */  
  
  public int getLen()
    {
    return -1;
    }  


  /**
   * Finds index of element in HLList or HLString
   * @param element The element
   * @return index of element in HLList or HLString or 0 if element is not contained in it
   */  
  public HLInteger indexOf(HLObject element)
    {
    return null;
    }
  /**
   * Retrieves a single element of HLList or HLString
   * @param index Index of the element
   * @return element at specified location
   */
  public HLObject elementRetrieval(int index)
    {
    return null;
    }
/**
 * Retrieves a subset of HLList or HLString
 * @param fromindex location of first element in subcomponent
 * @param toindex location of first element in subcomponent
 * @return subcompoenent of HLObject specified in [fromindex,toindex] interval
 */
  public HLObject intervalRetrieval(int fromindex, int toindex)
    {
    return null;
    }
/**
 * Replaces a component of HLList or HLString
 * @param fromindex location of first element in subcomponent
 * @param toindex location of first element in subcomponent
 * @return subcompoenent of HLObject specified in [fromindex,toindex] interval
 */
  public HLObject replace(ArrayList indexes, HLObject newvalue)
    {
    return null;
    }
/**
 * Calculates the negation of an HLInteger
 * @return 0 - HLInteger
 */
  public HLObject negate()
    {
    return null;
    }
/**
 * Add operand to HLObject
 * @param operand The second operand in addition
 * @return HLObject + operand
 */
  public HLObject add(HLObject operand)
    {
    return null;
    }
/**
 * Subtract operand from HLObject
 * @param operand The second operand in subtraction
 * @return HLObject - operand
 */
  public HLObject sub(HLObject operand)
    {
    return null;
    }
/**
 * Multiplies HLObject by operand
 * @param operand The second operand in multiplication
 * @return HLObject * operand
 */
  public HLObject mul(HLObject operand)
    {
    return null;
    }
/**
 * Calculates remainder of HLObject divided by operand 
 * @param operand The second operand in remainder
 * @return remainder of HLObject / operand
 */
  public HLObject mod(HLObject operand)
    {
    return null;
    }
/**
 * Calculates quotient of HLObject divided by operand 
 * @param operand The second operand in quotient
 * @return quotient of HLObject / operand
 */
  public HLObject div(HLObject operand)
    {
    return null;
    }

  public Boolean compare(Object object) {
    ASTcomparison comp = (ASTcomparison)object;
    // System.out.println(comp.jjtGetChild(0));
    // System.out.println(comp.jjtGetChild(1));
    // System.out.println(comp.jjtGetChild(2));

    String str1 = comp.jjtGetChild(0).toString();
    String[] arrOfStr1 = str1.split(":",2); 
    String str2 = comp.jjtGetChild(2).toString();
    String[] arrOfStr2 = str2.split(":",2);

    if(arrOfStr1[0].equals("integer") == true && arrOfStr2[0].equals("integer")) {
      HLInteger intHL = new HLInteger(0);
      
      if(comp.jjtGetChild(1).toString().equals("EQ") == true) {
        Boolean res = intHL.isSame(Integer.parseInt(arrOfStr1[1]), Integer.parseInt(arrOfStr2[1]));
        if(res == true) {
          // System.out.print(": true :");
          return true;
        }
        else {
          // System.out.print(": false :");
          return false;
        }
      }

      if(comp.jjtGetChild(1).toString().equals("NE") == true) {
        Boolean res = intHL.isSame(Integer.parseInt(arrOfStr1[1]), Integer.parseInt(arrOfStr2[1]));
        if(res == false) {
          // System.out.print(": true :");
          return true;
        }
        else {
          // System.out.print(": false :");
          return false;
          }
        }
      }
    
    return false;
  }
}