/* Generated By:JavaCC: Do not edit this line. HLDefaultVisitor.java Version 7.0.9 */
public class HLDefaultVisitor implements HLVisitor{
  public Object defaultVisit(SimpleNode node, Object data) throws Exception{
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTbody node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTclause node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTANY node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTINT node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTSTR node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTLST node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTsimple_decl node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTfn_decl node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTparam_decls node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTparam_decl node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTif_stat node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTNULL node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTfor_stat node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTwhile_stat node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTassignment node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTfn_call node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTparameters node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTprint_stat node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTprintln_stat node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTreturn_stat node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTor node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTand node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTnot node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTcomparison node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTLT node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTLE node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTGT node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTGE node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTEQ node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTNE node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTIN node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTISINT node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTISSTR node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTISLST node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTsum node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTneg node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTpos node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTmul node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTdiv node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTmod node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTindex node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTlist node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTidentifier node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTinteger node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTstring node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=7a873f858427b61f926ef9acaf91a5dc (do not edit this line) */
