/* Generated By:JJTree: Do not edit this line. ASTLT.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTLT extends SimpleNode {
  public ASTLT(int id) {
    super(id);
  }

  public ASTLT(HL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HLVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9314fea537e0380dc269a47a457a2cbf (do not edit this line) */