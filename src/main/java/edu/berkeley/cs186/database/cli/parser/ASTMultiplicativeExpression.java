/* Generated By:JJTree: Do not edit this line. ASTMultiplicativeExpression.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTMultiplicativeExpression extends SimpleNode {
  public ASTMultiplicativeExpression(int id) {
    super(id);
  }

  public ASTMultiplicativeExpression(RookieParser p, int id) {
    super(p, id);
  }

  /**
   * Accept the visitor.
   **/
  public void jjtAccept(RookieParserVisitor visitor, Object data) {
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=02896af956af3b70e8a9313c77e36b23 (do not edit this line) */
