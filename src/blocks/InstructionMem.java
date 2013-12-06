package blocks;

import java.util.ArrayList;

import util.CtrlSignals;

public class InstructionMem {

	Control ctrl = new Control();
	ArrayList<String> instruction;

	public InstructionMem(ArrayList<String> instrucion) {
		this.instruction = instruction;
	}

	public void toControl(int instruction) {
		long op = instruction/67108864;

		if(op == R) {
			CtrlSignals.setR();
		}
		if(op == I) {
			CtrlSignals.setI();
		}
		if(op == R) {
			CtrlSignals.setR();
		}

	}
}
