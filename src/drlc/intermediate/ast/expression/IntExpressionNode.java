package drlc.intermediate.ast.expression;

import org.eclipse.jdt.annotation.*;

import drlc.*;
import drlc.intermediate.ast.ASTNode;
import drlc.intermediate.component.type.TypeInfo;
import drlc.intermediate.component.value.*;

public class IntExpressionNode extends ConstantExpressionNode {
	
	public final @NonNull IntValue value;
	
	public IntExpressionNode(Source source, long value) {
		super(source);
		this.value = Main.generator.intValue(value);
	}
	
	@Override
	public void setScopes(ASTNode<?> parent) {
		scope = parent.scope;
	}
	
	@Override
	public void defineTypes(ASTNode<?> parent) {
		
	}
	
	@Override
	public void declareExpressions(ASTNode<?> parent) {
		routine = parent.routine;
	}
	
	@Override
	public void defineExpressions(ASTNode<?> parent) {
		
	}
	
	@Override
	public void checkTypes(ASTNode<?> parent) {
		
	}
	
	@Override
	public void foldConstants(ASTNode<?> parent) {
		
	}
	
	@Override
	public void trackFunctions(ASTNode<?> parent) {
		
	}
	
	@Override
	public void generateIntermediate(ASTNode<?> parent) {
		routine.addValueAssignmentAction(this, dataId = routine.nextRegId(Main.generator.intTypeInfo), value);
	}
	
	@Override
	protected @NonNull TypeInfo getTypeInfoInternal() {
		return Main.generator.intTypeInfo;
	}
	
	@Override
	protected void setTypeInfoInternal(@Nullable TypeInfo targetType) {
		
	}
	
	@Override
	protected @NonNull Value<?> getConstantValueInternal() {
		return value;
	}
	
	@Override
	protected void setConstantValueInternal() {
		
	}
}
