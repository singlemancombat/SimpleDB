/* Generated By:JJTree: Do not edit this line. ASTJoinedTable.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTJoinedTable extends SimpleNode {
    public ASTJoinedTable(int id) {
        super(id);
    }

    public ASTJoinedTable(RookieParser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor.
     **/
    public void jjtAccept(RookieParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=54d2a57f7ad7eae124dc370601928c2a (do not edit this line) */
