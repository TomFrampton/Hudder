/* Generated By:JJTree: Do not edit this line. ASTFunctionDef.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTFunctionDef extends SimpleNode {
  public ASTFunctionDef(int id) {
    super(id);
  }

  public ASTFunctionDef(Hudder p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HudderVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9005394a9a2d4ad8cb0595f5b458cb9c (do not edit this line) */