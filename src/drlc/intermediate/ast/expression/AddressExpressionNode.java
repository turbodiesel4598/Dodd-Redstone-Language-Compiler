package drlc.intermediate.ast.expression;

import org.eclipse.jdt.annotation.*;

import drlc.intermediate.ast.ASTNode;
import drlc.intermediate.component.Function;
import drlc.intermediate.component.type.TypeInfo;
import drlc.intermediate.component.value.Value;
import drlc.node.Node;

public class AddressExpressionNode extends ExpressionNode {
	
	public final @NonNull ExpressionNode expressionNode;
	
	@SuppressWarnings("null")
	public @NonNull TypeInfo typeInfo = null;
	
	public AddressExpressionNode(Node[] parseNodes, @NonNull ExpressionNode expressionNode) {
		super(parseNodes);
		this.expressionNode = expressionNode;
	}
	
	@Override
	public void setScopes(ASTNode<?, ?> parent) {
		scope = parent.scope;
		
		expressionNode.setScopes(this);
	}
	
	@Override
	public void defineTypes(ASTNode<?, ?> parent) {
		expressionNode.defineTypes(this);
	}
	
	@Override
	public void declareExpressions(ASTNode<?, ?> parent) {
		routine = parent.routine;
		
		expressionNode.declareExpressions(this);
		
		setTypeInfo();
	}
	
	@Override
	public void checkTypes(ASTNode<?, ?> parent) {
		expressionNode.checkTypes(this);
		
		if (expressionNode.isValidLvalue()) {
			expressionNode.setIsLvalue();
		}
	}
	
	@Override
	public void foldConstants(ASTNode<?, ?> parent) {
		expressionNode.foldConstants(this);
	}
	
	@Override
	public void trackFunctions(ASTNode<?, ?> parent) {
		expressionNode.trackFunctions(this);
	}
	
	@Override
	public void generateIntermediate(ASTNode<?, ?> parent) {
		expressionNode.generateIntermediate(this);
		
		if (!expressionNode.getIsLvalue()) {
			routine.pushCurrentRegId(this);
			
			routine.incrementRegId(typeInfo);
			routine.addAddressOfStackAssignmentAction(this);
		}
	}
	
	@Override
	protected @NonNull TypeInfo getTypeInfoInternal() {
		return typeInfo;
	}
	
	@Override
	protected void setTypeInfoInternal() {
		typeInfo = expressionNode.getTypeInfo().modifiedReferenceLevel(this, 1);
	}
	
	@Override
	protected @Nullable Value getConstantValueInternal() {
		return null;
	}
	
	@Override
	protected void setConstantValueInternal() {
		
	}
	
	@Override
	public @Nullable Function getDirectFunction() {
		return expressionNode.getDirectFunction();
	}
}
