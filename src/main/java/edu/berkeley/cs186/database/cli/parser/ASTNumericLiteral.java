/* Generated By:JJTree: Do not edit this line. ASTNumericLiteral.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTNumericLiteral extends SimpleNode {
  public ASTNumericLiteral(int id) {
    super(id);
  }

  public ASTNumericLiteral(RookieParser p, int id) {
    super(p, id);
  }

  /**
   * Accept the visitor.
   **/
  public void jjtAccept(RookieParserVisitor visitor, Object data) {
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7d84d95460422346245cf69f781fc025 (do not edit this line) */
