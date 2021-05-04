package drlc.interpret.type.info;

import drlc.*;
import drlc.interpret.type.Variable;

public class ArrayReferenceInfo {
	
	public final Variable variable;
	public int dereferenceLevel = 0;
	
	public ArrayReferenceInfo(Variable variable) {
		this.variable = variable;
	}
	
	public ArrayReferenceInfo(Variable variable, int dereferenceLevel) {
		this(variable);
		this.dereferenceLevel = dereferenceLevel;
	}
	
	@Override
	public String toString() {
		if (dereferenceLevel < 0) {
			throw new IllegalArgumentException(String.format("Can not get the address of a raw variable \"%s\"!", variable.name));
		}
		else if (dereferenceLevel == 0) {
			return variable.name;
		}
		else {
			return Helper.charLine(Global.DEREFERENCE, dereferenceLevel).concat(variable.name);
		}
	}
}
