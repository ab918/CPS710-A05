/* Generated By:JJTree: Do not edit this line. ASTlist.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTlist extends SimpleNode {
  public ASTlist(int id) {
    super(id);
  }

  public ASTlist(HL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HLVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d1d12a1adeff8aa07bee095eb09bdab6 (do not edit this line) */