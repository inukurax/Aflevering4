package spreadsheet;

import quickcheck.Info;

public class ExpressionInfo extends Info<Expression> {
	
	private String str;
	private int value;
	private int value2;
	private int i;
	
	public ExpressionInfo(Expression expression, int value) {
		super(expression);	
		this.value = value;;
		this.str = "new AConst";
		i = 1;
	}
	
	public ExpressionInfo(Expression exp, int value , String str) {
		super(exp);
		this.value = value;
		this.str = str;
		i = 2;
	}
	
	/**
	 * Gives info on an Add expression.
	 * @param exp
	 * @param firstOperand
	 * @param secondOperand
	 * @param unused
	 */
	public ExpressionInfo(Expression exp, int firstOperand, 
					int secondOperand, String str) {
		
		super(exp);
		this.value = firstOperand;
		this.value2 = secondOperand;
		this.str = str;
		i = 3;
	}
	
	/**
	 * 
	 * @return the expected expression value
	 */
	public int result() {
		switch (i) {
		case 1 : return value;
		case 2 : return value * -1;
		case 3 : return value + value2;
		
		}
		return -1;
	}
	
	
	@Override
	public String toString() {
		if (i == 3)
			return String.format(str + "(%d,%d)", value, value2);
		else
			return String.format(str + "(%d)", value);
	}

}
