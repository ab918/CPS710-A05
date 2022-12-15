import java.util.*;
/**
 * Describes IDENTIFIER tokens
 * The name table is a static ArrayList<String>
 */

public class IdentifierToken extends Token {
/**
 * nameTable contains all the names of all identifiers in HL
 */


/**
 * Returns the name of the identifier with the specified key
 * @param key int key of identifier
 * @return the name of the identifier with the specified key
 */  
  public static String getName(int key)
    {
      Integer num = Integer.valueOf(key);
      HLSymbolTab symbolTab = new HLSymbolTab();
      return symbolTab.getName(num);
    }

/**
 * Returns the name of the identifier with the specified key
 * @param key Integer key of identifier
 * @return the name of the identifier with the specified key
 */      
  public static String getName(Integer key)
    {
      HLSymbolTab symbolTab = new HLSymbolTab();
      return symbolTab.getName(key);
    }

/**
 * Returns the number of names of identifiers in HL
 * @return the number of names of identifiers in HL
 */      
  public static int totalIdentifiers()
    {
      HLSymbolTab symbolTab = new HLSymbolTab();
      return symbolTab.getSize();
    }

/**
 * A unique key is stored for each identifier name to be used later in symbol tables
 */ 
  public int key;
/**
 * The key is also stored as an Integer
 */ 
  public Integer value;

/**
 * Creates a new IdentifierToken with the specified name.
 * If not already there, name is added to nameTable.
 * this will keep a key into nameTable for its name.
 * For C and B learning objectives, this method should trigger a static call to
 * something like HLSymbTab.newIdName(key)
 * @param name name of the identifier (just scanned)
 * @return a new IdentifierToken with the specified name
 */      
  public IdentifierToken(String name)
    {
    this.kind = HLConstants.IDENTIFIER  ;
    this.image = image;
    HLSymbolTab symbolTab = new HLSymbolTab();
    value = symbolTab.addSymbol(name);
    }

/**
 * Returns String name of identifier
 * @return String name of identifier
 */     
  public String toString()
    {
  	return value.toString();
    }
  
/**
 * Retrieves key of identifier
 * @return Integer key of identifier
 */     
  public Integer getValue()
    {
    return value;
    }

/**
 * Retrieves key of identifier
 * @return int key of identifier
 */  
  public int getKey()
    {
      return 1;
    }
}
