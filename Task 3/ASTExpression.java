/* Generated By:JJTree: Do not edit this line. ASTExpression.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTExpression extends SimpleNode {
  public ASTExpression(int id) {
    super(id);
  }

  public ASTExpression(Hudder p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HudderVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6e67b433086b9f31832fa88133d6aca0 (do not edit this line) */