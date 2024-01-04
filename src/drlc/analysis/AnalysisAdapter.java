/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.analysis;

import java.util.*;
import drlc.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnit(AUnit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASetup(ASetup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADirective(ADirective node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionDefinitionStaticSection(AFunctionDefinitionStaticSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATypealiasDefinitionStaticSection(ATypealiasDefinitionStaticSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStructDefinitionStaticSection(AStructDefinitionStaticSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstantDefinitionStaticSection(AConstantDefinitionStaticSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariableDeclarationStaticSection(AVariableDeclarationStaticSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptySectionStaticSection(AEmptySectionStaticSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStaticSectionRuntimeSection(AStaticSectionRuntimeSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAScopedSectionRuntimeSection(AScopedSectionRuntimeSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionStatementRuntimeSection(AExpressionStatementRuntimeSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConditionalSectionRuntimeSection(AConditionalSectionRuntimeSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIterativeSectionRuntimeSection(AIterativeSectionRuntimeSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionDefinition(AFunctionDefinition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATypealiasDefinition(ATypealiasDefinition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStructDefinition(AStructDefinition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstantDefinition(AConstantDefinition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExcludingInitializationVariableDeclaration(AExcludingInitializationVariableDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIncludingInitializationVariableDeclaration(AIncludingInitializationVariableDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptySection(AEmptySection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAScopedSection(AScopedSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionStatement(AExpressionStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConditionalSection(AConditionalSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExcludingBranchElseSection(AExcludingBranchElseSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIncludingBranchElseSection(AIncludingBranchElseSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALoopIterativeSection(ALoopIterativeSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConditionalIterativeSection(AConditionalIterativeSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADoConditionalIterativeSection(ADoConditionalIterativeSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAScopeContents(AScopeContents node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExitStopStatement(AExitStopStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnStopStatement(AReturnStopStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAContinueStopStatement(AContinueStopStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABreakStopStatement(ABreakStopStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADead0DeadSection(ADead0DeadSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADead1DeadSection(ADead1DeadSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADead2DeadSection(ADead2DeadSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADead3DeadSection(ADead3DeadSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADead4DeadSection(ADead4DeadSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARawType(ARawType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAddressOfType(AAddressOfType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADoubleAddressOfType(ADoubleAddressOfType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANominalRawType(ANominalRawType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayRawType(AArrayRawType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATupleRawType(ATupleRawType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionRawType(AFunctionRawType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATupleTypeList(ATupleTypeList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATypeList(ATypeList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATypeListTail(ATypeListTail node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnType(AReturnType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATypeAnnotation(ATypeAnnotation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclarator(ADeclarator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStaticVariableModifier(AStaticVariableModifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMutVariableModifier(AMutVariableModifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaratorList(ADeclaratorList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaratorListTail(ADeclaratorListTail node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIterativeSectionLabel(AIterativeSectionLabel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedExpression(APrioritizedExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignmentExpression(AAssignmentExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedTernaryExpression(APrioritizedTernaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATernaryTernaryExpression(ATernaryTernaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedLogicalExpression(APrioritizedLogicalExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryLogicalExpression(ABinaryLogicalExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedEqualityExpression(APrioritizedEqualityExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryEqualityExpression(ABinaryEqualityExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedComparativeExpression(APrioritizedComparativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryComparativeExpression(ABinaryComparativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedAdditiveExpression(APrioritizedAdditiveExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryAdditiveExpression(ABinaryAdditiveExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedMultiplicativeExpression(APrioritizedMultiplicativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryMultiplicativeExpression(ABinaryMultiplicativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedShiftExpression(APrioritizedShiftExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryShiftExpression(ABinaryShiftExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedUnaryExpression(APrioritizedUnaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnaryUnaryExpression(AUnaryUnaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADereferenceUnaryExpression(ADereferenceUnaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAddressOfUnaryExpression(AAddressOfUnaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADoubleAddressOfUnaryExpression(ADoubleAddressOfUnaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenthesesCompoundExpression(AParenthesesCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleCompoundExpression(ASimpleCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayListCompoundExpression(AArrayListCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayRepeatCompoundExpression(AArrayRepeatCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIndexCompoundExpression(AIndexCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATupleCompoundExpression(ATupleCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStructCompoundExpression(AStructCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMemberCompoundExpression(AMemberCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionCompoundExpression(AFunctionCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenthesesExpression(AParenthesesExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValueSimpleExpression(AValueSimpleExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariableSimpleExpression(AVariableSimpleExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATupleExpressionList(ATupleExpressionList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionList(AExpressionList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionListTail(AExpressionListTail node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolValue(ABoolValue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntValue(AIntValue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANatValue(ANatValue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharValue(ACharValue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASizeofValue(ASizeofValue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstantExpression(AConstantExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedConditionExpression(APrioritizedConditionExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignmentConditionExpression(AAssignmentConditionExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedConditionTernaryExpression(APrioritizedConditionTernaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATernaryConditionTernaryExpression(ATernaryConditionTernaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedConditionLogicalExpression(APrioritizedConditionLogicalExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryConditionLogicalExpression(ABinaryConditionLogicalExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedConditionEqualityExpression(APrioritizedConditionEqualityExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryConditionEqualityExpression(ABinaryConditionEqualityExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedConditionComparativeExpression(APrioritizedConditionComparativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryConditionComparativeExpression(ABinaryConditionComparativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedConditionAdditiveExpression(APrioritizedConditionAdditiveExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryConditionAdditiveExpression(ABinaryConditionAdditiveExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedConditionMultiplicativeExpression(APrioritizedConditionMultiplicativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryConditionMultiplicativeExpression(ABinaryConditionMultiplicativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedConditionShiftExpression(APrioritizedConditionShiftExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABinaryConditionShiftExpression(ABinaryConditionShiftExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrioritizedConditionUnaryExpression(APrioritizedConditionUnaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnaryConditionUnaryExpression(AUnaryConditionUnaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADereferenceConditionUnaryExpression(ADereferenceConditionUnaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAddressOfConditionUnaryExpression(AAddressOfConditionUnaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADoubleAddressOfConditionUnaryExpression(ADoubleAddressOfConditionUnaryExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenthesesConditionCompoundExpression(AParenthesesConditionCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleConditionCompoundExpression(ASimpleConditionCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayListConditionCompoundExpression(AArrayListConditionCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayRepeatConditionCompoundExpression(AArrayRepeatConditionCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIndexConditionCompoundExpression(AIndexConditionCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATupleConditionCompoundExpression(ATupleConditionCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMemberConditionCompoundExpression(AMemberConditionCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionConditionCompoundExpression(AFunctionConditionCompoundExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqualsAssignmentOp(AEqualsAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusAssignmentOp(APlusAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndAssignmentOp(AAndAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrAssignmentOp(AOrAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorAssignmentOp(AXorAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusAssignmentOp(AMinusAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplyAssignmentOp(AMultiplyAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivideAssignmentOp(ADivideAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARemainderAssignmentOp(ARemainderAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeftShiftAssignmentOp(ALeftShiftAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARightShiftAssignmentOp(ARightShiftAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeftRotateAssignmentOp(ALeftRotateAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARightRotateAssignmentOp(ARightRotateAssignmentOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicalAndLogicalBinaryOp(ALogicalAndLogicalBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicalOrLogicalBinaryOp(ALogicalOrLogicalBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqualToEqualityBinaryOp(AEqualToEqualityBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotEqualToEqualityBinaryOp(ANotEqualToEqualityBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessThanComparativeBinaryOp(ALessThanComparativeBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessOrEqualComparativeBinaryOp(ALessOrEqualComparativeBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMoreThanComparativeBinaryOp(AMoreThanComparativeBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMoreOrEqualComparativeBinaryOp(AMoreOrEqualComparativeBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusAdditiveBinaryOp(APlusAdditiveBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndAdditiveBinaryOp(AAndAdditiveBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrAdditiveBinaryOp(AOrAdditiveBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorAdditiveBinaryOp(AXorAdditiveBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusAdditiveBinaryOp(AMinusAdditiveBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplyMultiplicativeBinaryOp(AMultiplyMultiplicativeBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivideMultiplicativeBinaryOp(ADivideMultiplicativeBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARemainderMultiplicativeBinaryOp(ARemainderMultiplicativeBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeftShiftShiftBinaryOp(ALeftShiftShiftBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARightShiftShiftBinaryOp(ARightShiftShiftBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeftRotateShiftBinaryOp(ALeftRotateShiftBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARightRotateShiftBinaryOp(ARightRotateShiftBinaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusUnaryOp(AMinusUnaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotUnaryOp(ANotUnaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDirectivePrefix(TDirectivePrefix node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTypealias(TTypealias node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStruct(TStruct node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFn(TFn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLet(TLet node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStatic(TStatic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMut(TMut node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTArrow(TArrow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConditionalBranchKeyword(TConditionalBranchKeyword node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLoop(TLoop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConditionalIterativeKeyword(TConditionalIterativeKeyword node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTExit(TExit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTContinue(TContinue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBreak(TBreak node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSizeof(TSizeof node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBracket(TLBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBracket(TRBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBrace(TLBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBrace(TRBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFullStop(TFullStop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTQuestionMark(TQuestionMark node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEquals(TEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlusEquals(TPlusEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAndEquals(TAndEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOrEquals(TOrEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXorEquals(TXorEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinusEquals(TMinusEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftShiftEquals(TLeftShiftEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightShiftEquals(TRightShiftEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftRotateEquals(TLeftRotateEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightRotateEquals(TRightRotateEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplyEquals(TMultiplyEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivideEquals(TDivideEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRemainderEquals(TRemainderEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLogicalAnd(TLogicalAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLogicalOr(TLogicalOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEqualTo(TEqualTo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNotEqualTo(TNotEqualTo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLessThan(TLessThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLessOrEqual(TLessOrEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMoreThan(TMoreThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMoreOrEqual(TMoreOrEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftShift(TLeftShift node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightShift(TRightShift node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftRotate(TLeftRotate node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightRotate(TRightRotate node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiply(TMultiply node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivide(TDivide node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRemainder(TRemainder node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolValue(TBoolValue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTName(TName node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntValue(TIntValue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNatValue(TNatValue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCharValue(TCharValue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
