/**
 * HLType manages types in HL
 * @author Sophie Quigley
 */
public abstract class HLType
{
  public static int NONE = -1;
  public static int ANY = 0;
  public static int INT = 1;
  public static int STR = 2;
  public static int LST = 3;
 
 // Returns the type of a type declaration 
  public static int intType(SimpleNode typedecl)
    {
    switch(typedecl.getId()) {
    case HLTreeConstants.JJTANY:
      return ANY;
    case HLTreeConstants.JJTINT:
      return INT;
    case HLTreeConstants.JJTSTR:
      return STR;
    case HLTreeConstants.JJTLST:
      return LST;
    default:
      return NONE;
    }      
    }

  // Returns the type of an HLObject  
  public static int intType(HLObject object)
    {
    return object.intType();
    }

  // Return the type of an iterator over and HLObject
  public static int iteratorType(HLObject object)
    {
    return object.iteratorType();
    }


}