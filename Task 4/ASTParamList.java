/* Generated By:JJTree: Do not edit this line. ASTParamList.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTParamList extends SimpleNode {
  public ASTParamList(int id) {
    super(id);
  }

  public ASTParamList(Hudder p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HudderVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=fcd4988214b537cd7c31df5653fe7d12 (do not edit this line) */
