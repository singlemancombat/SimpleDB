/* Generated By:JJTree: Do not edit this line. ASTExplainStatement.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTExplainStatement extends SimpleNode {
  public ASTExplainStatement(int id) {
    super(id);
  }

  public ASTExplainStatement(RookieParser p, int id) {
    super(p, id);
  }

  /**
   * Accept the visitor.
   **/
  public void jjtAccept(RookieParserVisitor visitor, Object data) {
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=5c73688a6ddff3893eaa98059f61084d (do not edit this line) */
