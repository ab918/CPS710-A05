/* Generated By:JJTree: Do not edit this line. ASTISINT.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTISINT extends SimpleNode {
  public ASTISINT(int id) {
    super(id);
  }

  public ASTISINT(HL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HLVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=1bb7b1635cf4684c6f5dd93363bde57c (do not edit this line) */