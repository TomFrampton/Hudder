/* Generated By:JavaCC: Do not edit this line. HudderDefaultVisitor.java Version 6.0_1 */
public class HudderDefaultVisitor implements HudderVisitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTHudder node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFunc node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTParamList node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTParam node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTProgBlock node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTTerm node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFactor node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTCondition node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTParamListCall node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=36d0a0975eeb29ef0c637b4665656c9f (do not edit this line) */
