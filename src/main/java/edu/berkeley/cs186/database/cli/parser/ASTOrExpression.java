/* Generated By:JJTree: Do not edit this line. ASTOrExpression.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTOrExpression extends SimpleNode {
  public ASTOrExpression(int id) {
    super(id);
  }

  public ASTOrExpression(RookieParser p, int id) {
    super(p, id);
  }

  /**
   * Accept the visitor.
   **/
  public void jjtAccept(RookieParserVisitor visitor, Object data) {
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=42c64631eeedad4356798e95b1816f40 (do not edit this line) */
