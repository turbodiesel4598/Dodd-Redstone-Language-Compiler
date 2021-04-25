package drlc.generate.drc1.instruction.jump;

import drlc.Helper;
import drlc.generate.drc1.*;
import drlc.generate.drc1.instruction.Instruction;
import drlc.generate.drc1.instruction.set.*;

public class InstructionConditionalJumpIfLessThanOrEqualToZero extends InstructionConditionalJump {
	
	public InstructionConditionalJumpIfLessThanOrEqualToZero(short section) {
		super(section);
	}
	
	@Override
	public Instruction getReplacementConditionalJump(InstructionSet instructionSet) {
		if (instructionSet instanceof InstructionSetIsLessThanOrEqualToZero) {
			return new InstructionConditionalJumpIfMoreThanZero(section);
		}
		else if (instructionSet instanceof InstructionSetIsLessThanZero) {
			return new InstructionConditionalJumpIfMoreThanOrEqualToZero(section);
		}
		else if (instructionSet instanceof InstructionSetIsMoreThanOrEqualToZero) {
			return new InstructionConditionalJumpIfLessThanZero(section);
		}
		else if (instructionSet instanceof InstructionSetIsMoreThanZero) {
			return new InstructionConditionalJumpIfLessThanOrEqualToZero(section);
		}
		else if (instructionSet instanceof InstructionSetIsNotZero) {
			return new InstructionConditionalJumpIfZero(section);
		}
		else if (instructionSet instanceof InstructionSetIsZero) {
			return new InstructionConditionalJumpIfNotZero(section);
		}
		else if (instructionSet instanceof InstructionSetNegative) {
			return new InstructionConditionalJumpIfMoreThanOrEqualToZero(section);
		}
		else if (instructionSet instanceof InstructionSetNot) {
			return null;
		}
		else {
			return null;
		}
	}
	
	@Override
	public String binaryString() {
		return RedstoneOpcodes.get(RedstoneMnemonics.JLEZ).concat(Helper.toBinary(address, 8));
	}
	
	@Override
	public String toString() {
		return RedstoneMnemonics.JLEZ.concat("\t").concat(Helper.toHex(address, 2));
	}
}
