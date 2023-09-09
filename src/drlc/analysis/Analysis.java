/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.analysis;

import drlc.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAUnit(AUnit node);
    void caseASetup(ASetup node);
    void caseAProgram(AProgram node);
    void caseADirective(ADirective node);
    void caseAFunctionDefinitionProgramSection(AFunctionDefinitionProgramSection node);
    void caseABasicSectionProgramSection(ABasicSectionProgramSection node);
    void caseAScopedSectionBasicSection(AScopedSectionBasicSection node);
    void caseAConstantDefinitionBasicSection(AConstantDefinitionBasicSection node);
    void caseAVariableDeclarationBasicSection(AVariableDeclarationBasicSection node);
    void caseAExpressionStatementBasicSection(AExpressionStatementBasicSection node);
    void caseAConditionalSectionBasicSection(AConditionalSectionBasicSection node);
    void caseAIterativeSectionBasicSection(AIterativeSectionBasicSection node);
    void caseAGotoStatementBasicSection(AGotoStatementBasicSection node);
    void caseASectionLabelBasicSection(ASectionLabelBasicSection node);
    void caseAFunctionDefinition(AFunctionDefinition node);
    void caseAScopedSection(AScopedSection node);
    void caseAConstantDefinition(AConstantDefinition node);
    void caseAExcludingInitializationVariableDeclaration(AExcludingInitializationVariableDeclaration node);
    void caseAIncludingInitializationVariableDeclaration(AIncludingInitializationVariableDeclaration node);
    void caseABasicExpressionStatement(ABasicExpressionStatement node);
    void caseAAssignmentExpressionStatement(AAssignmentExpressionStatement node);
    void caseAConditionalSection(AConditionalSection node);
    void caseAExcludingBranchElseSection(AExcludingBranchElseSection node);
    void caseAIncludingBranchElseSection(AIncludingBranchElseSection node);
    void caseALoopIterativeSection(ALoopIterativeSection node);
    void caseAConditionalIterativeSection(AConditionalIterativeSection node);
    void caseADoConditionalIterativeSection(ADoConditionalIterativeSection node);
    void caseAGotoStatement(AGotoStatement node);
    void caseASectionLabel(ASectionLabel node);
    void caseAScopeContents(AScopeContents node);
    void caseAExitStopStatement(AExitStopStatement node);
    void caseAReturnStopStatement(AReturnStopStatement node);
    void caseAContinueStopStatement(AContinueStopStatement node);
    void caseABreakStopStatement(ABreakStopStatement node);
    void caseAExitExpressionStopStatement(AExitExpressionStopStatement node);
    void caseAReturnExpressionStopStatement(AReturnExpressionStopStatement node);
    void caseADead0DeadSection(ADead0DeadSection node);
    void caseADead1DeadSection(ADead1DeadSection node);
    void caseADead2DeadSection(ADead2DeadSection node);
    void caseADead3DeadSection(ADead3DeadSection node);
    void caseADead4DeadSection(ADead4DeadSection node);
    void caseADead5DeadSection(ADead5DeadSection node);
    void caseADead6DeadSection(ADead6DeadSection node);
    void caseAType(AType node);
    void caseABasicRawType(ABasicRawType node);
    void caseAArrayRawType(AArrayRawType node);
    void caseAFunctionRawType(AFunctionRawType node);
    void caseATypeList(ATypeList node);
    void caseATypeListTail(ATypeListTail node);
    void caseAReturnType(AReturnType node);
    void caseAVariableDeclarator(AVariableDeclarator node);
    void caseATypeAnnotation(ATypeAnnotation node);
    void caseAParameterList(AParameterList node);
    void caseAParameterListTail(AParameterListTail node);
    void caseAParameterDeclarator(AParameterDeclarator node);
    void caseANameIdentifier(ANameIdentifier node);
    void caseADiscardIdentifier(ADiscardIdentifier node);
    void caseAExpression(AExpression node);
    void caseAConstantExpression(AConstantExpression node);
    void caseAAssignmentExpression(AAssignmentExpression node);
    void caseAPrioritizedExpression0(APrioritizedExpression0 node);
    void caseABinaryExpression0(ABinaryExpression0 node);
    void caseAPrioritizedExpression1(APrioritizedExpression1 node);
    void caseABinaryExpression1(ABinaryExpression1 node);
    void caseAPrioritizedExpression2(APrioritizedExpression2 node);
    void caseABinaryExpression2(ABinaryExpression2 node);
    void caseAPrioritizedExpression3(APrioritizedExpression3 node);
    void caseABinaryExpression3(ABinaryExpression3 node);
    void caseAPrioritizedExpression4(APrioritizedExpression4 node);
    void caseABinaryExpression4(ABinaryExpression4 node);
    void caseAPrioritizedExpression5(APrioritizedExpression5 node);
    void caseABinaryExpression5(ABinaryExpression5 node);
    void caseAPrioritizedExpression6(APrioritizedExpression6 node);
    void caseAUnaryExpression6(AUnaryExpression6 node);
    void caseADereferenceExpression6(ADereferenceExpression6 node);
    void caseAAddressOfExpression6(AAddressOfExpression6 node);
    void caseAPrioritizedExpression7(APrioritizedExpression7 node);
    void caseAArrayListExpression7(AArrayListExpression7 node);
    void caseAArrayRepeatExpression7(AArrayRepeatExpression7 node);
    void caseAIndexExpression7(AIndexExpression7 node);
    void caseAFunctionExpression7(AFunctionExpression7 node);
    void caseAExpressionList(AExpressionList node);
    void caseAExpressionListTail(AExpressionListTail node);
    void caseAValueExpression8(AValueExpression8 node);
    void caseAVariableExpression8(AVariableExpression8 node);
    void caseAParenthesesExpression8(AParenthesesExpression8 node);
    void caseABoolValue(ABoolValue node);
    void caseAIntValue(AIntValue node);
    void caseANatValue(ANatValue node);
    void caseACharValue(ACharValue node);
    void caseANullValue(ANullValue node);
    void caseASizeofValue(ASizeofValue node);
    void caseAEqualsAssignmentOp(AEqualsAssignmentOp node);
    void caseAPlusAssignmentOp(APlusAssignmentOp node);
    void caseAAndAssignmentOp(AAndAssignmentOp node);
    void caseAOrAssignmentOp(AOrAssignmentOp node);
    void caseAXorAssignmentOp(AXorAssignmentOp node);
    void caseAMinusAssignmentOp(AMinusAssignmentOp node);
    void caseALeftShiftAssignmentOp(ALeftShiftAssignmentOp node);
    void caseARightShiftAssignmentOp(ARightShiftAssignmentOp node);
    void caseALeftRotateAssignmentOp(ALeftRotateAssignmentOp node);
    void caseARightRotateAssignmentOp(ARightRotateAssignmentOp node);
    void caseAMultiplyAssignmentOp(AMultiplyAssignmentOp node);
    void caseADivideAssignmentOp(ADivideAssignmentOp node);
    void caseARemainderAssignmentOp(ARemainderAssignmentOp node);
    void caseALogicalAndLogicalBinaryOp(ALogicalAndLogicalBinaryOp node);
    void caseALogicalOrLogicalBinaryOp(ALogicalOrLogicalBinaryOp node);
    void caseAEqualToEqualityBinaryOp(AEqualToEqualityBinaryOp node);
    void caseANotEqualToEqualityBinaryOp(ANotEqualToEqualityBinaryOp node);
    void caseALessThanComparativeBinaryOp(ALessThanComparativeBinaryOp node);
    void caseALessOrEqualComparativeBinaryOp(ALessOrEqualComparativeBinaryOp node);
    void caseAMoreThanComparativeBinaryOp(AMoreThanComparativeBinaryOp node);
    void caseAMoreOrEqualComparativeBinaryOp(AMoreOrEqualComparativeBinaryOp node);
    void caseAPlusAdditiveBinaryOp(APlusAdditiveBinaryOp node);
    void caseAAndAdditiveBinaryOp(AAndAdditiveBinaryOp node);
    void caseAOrAdditiveBinaryOp(AOrAdditiveBinaryOp node);
    void caseAXorAdditiveBinaryOp(AXorAdditiveBinaryOp node);
    void caseAMinusAdditiveBinaryOp(AMinusAdditiveBinaryOp node);
    void caseALeftShiftShiftBinaryOp(ALeftShiftShiftBinaryOp node);
    void caseARightShiftShiftBinaryOp(ARightShiftShiftBinaryOp node);
    void caseALeftRotateShiftBinaryOp(ALeftRotateShiftBinaryOp node);
    void caseARightRotateShiftBinaryOp(ARightRotateShiftBinaryOp node);
    void caseAMultiplyMultiplicativeBinaryOp(AMultiplyMultiplicativeBinaryOp node);
    void caseADivideMultiplicativeBinaryOp(ADivideMultiplicativeBinaryOp node);
    void caseARemainderMultiplicativeBinaryOp(ARemainderMultiplicativeBinaryOp node);
    void caseAMinusUnaryOp(AMinusUnaryOp node);
    void caseANotUnaryOp(ANotUnaryOp node);

    void caseTDirectivePrefix(TDirectivePrefix node);
    void caseTVariableModifier(TVariableModifier node);
    void caseTFn(TFn node);
    void caseTConst(TConst node);
    void caseTLet(TLet node);
    void caseTArrow(TArrow node);
    void caseTConditionalBranchKeyword(TConditionalBranchKeyword node);
    void caseTElse(TElse node);
    void caseTLoop(TLoop node);
    void caseTConditionalIterativeKeyword(TConditionalIterativeKeyword node);
    void caseTDo(TDo node);
    void caseTGoto(TGoto node);
    void caseTExit(TExit node);
    void caseTReturn(TReturn node);
    void caseTContinue(TContinue node);
    void caseTBreak(TBreak node);
    void caseTSizeof(TSizeof node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBracket(TLBracket node);
    void caseTRBracket(TRBracket node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTComma(TComma node);
    void caseTColon(TColon node);
    void caseTSemicolon(TSemicolon node);
    void caseTEquals(TEquals node);
    void caseTPlusEquals(TPlusEquals node);
    void caseTAndEquals(TAndEquals node);
    void caseTOrEquals(TOrEquals node);
    void caseTXorEquals(TXorEquals node);
    void caseTMinusEquals(TMinusEquals node);
    void caseTLeftShiftEquals(TLeftShiftEquals node);
    void caseTRightShiftEquals(TRightShiftEquals node);
    void caseTLeftRotateEquals(TLeftRotateEquals node);
    void caseTRightRotateEquals(TRightRotateEquals node);
    void caseTMultiplyEquals(TMultiplyEquals node);
    void caseTDivideEquals(TDivideEquals node);
    void caseTRemainderEquals(TRemainderEquals node);
    void caseTLogicalAnd(TLogicalAnd node);
    void caseTLogicalOr(TLogicalOr node);
    void caseTEqualTo(TEqualTo node);
    void caseTNotEqualTo(TNotEqualTo node);
    void caseTLessThan(TLessThan node);
    void caseTLessOrEqual(TLessOrEqual node);
    void caseTMoreThan(TMoreThan node);
    void caseTMoreOrEqual(TMoreOrEqual node);
    void caseTPlus(TPlus node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTXor(TXor node);
    void caseTMinus(TMinus node);
    void caseTLeftShift(TLeftShift node);
    void caseTRightShift(TRightShift node);
    void caseTLeftRotate(TLeftRotate node);
    void caseTRightRotate(TRightRotate node);
    void caseTMultiply(TMultiply node);
    void caseTDivide(TDivide node);
    void caseTRemainder(TRemainder node);
    void caseTNot(TNot node);
    void caseTBoolValue(TBoolValue node);
    void caseTName(TName node);
    void caseTDiscard(TDiscard node);
    void caseTIntValue(TIntValue node);
    void caseTNatValue(TNatValue node);
    void caseTCharValue(TCharValue node);
    void caseTNull(TNull node);
    void caseTBlank(TBlank node);
    void caseTComment(TComment node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
