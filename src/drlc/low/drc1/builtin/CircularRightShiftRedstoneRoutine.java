package drlc.low.drc1.builtin;

import java.util.*;

import drlc.*;
import drlc.intermediate.component.*;
import drlc.intermediate.component.data.DataId;
import drlc.intermediate.routine.RoutineCallType;
import drlc.low.drc1.RedstoneCode;
import drlc.low.drc1.instruction.Instruction;
import drlc.low.drc1.instruction.subroutine.InstructionReturnFromSubroutine;

public class CircularRightShiftRedstoneRoutine extends BuiltInRedstoneRoutine {
	
	public CircularRightShiftRedstoneRoutine(RedstoneCode code, String name, RoutineCallType type) {
		super(code, name, type, Helpers.params(Helpers.builtInDeclarator("x", Global.INT_TYPE_INFO), Helpers.builtInDeclarator("y", Global.INT_TYPE_INFO)));
	}
	
	@Override
	public void generateInstructionsInternal() {
		List<Instruction> text = new ArrayList<>();
		textSectionMap.put((short) 0, text);
		
		// (x >>> y) | (x << (-y))
		
		DataId x = params[0].dataId(), y = params[1].dataId();
		DataId t = nextExtraTempRegArg();
		
		unaryOp(text, UnaryOpType.MINUS, y);
		store(text, t, true);
		load(text, x);
		binaryOp(text, BinaryOpType.ARITHMETIC_LEFT_SHIFT, t);
		store(text, t, true);
		load(text, x);
		binaryOp(text, BinaryOpType.LOGICAL_RIGHT_SHIFT, y);
		binaryOp(text, BinaryOpType.OR, t);
		text.add(new InstructionReturnFromSubroutine());
	}
	
	@Override
	public short getFinalTextSectionKey() {
		throw new IllegalArgumentException(String.format("Unexpectedly attempted to get final text section key of built-in function \"%s\"!", name));
	}
}
