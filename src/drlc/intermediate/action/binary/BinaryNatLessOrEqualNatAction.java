package drlc.intermediate.action.binary;

import drlc.intermediate.ast.ASTNode;
import drlc.intermediate.component.data.DataId;

public class BinaryNatLessOrEqualNatAction extends BinaryOpAction {
	
	BinaryNatLessOrEqualNatAction(ASTNode node, DataId target, DataId arg1, DataId arg2) {
		super(node, BinaryActionType.NAT_LESS_OR_EQUAL_NAT, target, arg1, arg2);
	}
	
	@Override
	protected BinaryOpAction copy(DataId target, DataId arg1, DataId arg2) {
		return new BinaryNatLessOrEqualNatAction(null, target, arg1, arg2);
	}
	
	@Override
	protected BinaryOpAction commutated(DataId target, DataId arg1, DataId arg2) {
		return new BinaryNatMoreOrEqualNatAction(null, target, arg1, arg2);
	}
	
	@Override
	public boolean canReorderRvalues() {
		return true;
	}
	
	@Override
	public String toString() {
		return target + " = " + arg1 + " <= " + arg2;
	}
}
