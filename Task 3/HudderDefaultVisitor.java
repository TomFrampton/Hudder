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
  public Object visit(ASTProgBlock node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=95c1a8fbf11305889eba163d407fbd13 (do not edit this line) */
