package util;

public class CtrlSignals {

	static boolean regDst = false;
	static boolean branch = false;
	static boolean memRead = false;
	static boolean memtoReg = false;
	static boolean memWrite = false;
	static boolean regWrite = false;
	static boolean ALUOp1 = false;
	static boolean ALUOp2 = false;
	static boolean ALUSrc = false;

	public static void setR() {
		regDst = true;
		branch = false;
		memRead = false;
		memtoReg = false;
		memWrite = false;
		regWrite = true;
		ALUOp1 = true;
		ALUOp2 = false;
		ALUSrc = false;
	}

	public static void setI() {

	}

	public static void setJ() {

	}
}
