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
		str = "new AConst";
		i = 1;
	}
	
	public ExpressionInfo(Expression exp, int value , int unused) {
		super(exp);
		this.value = value;
		str = "new Neg";
		i = 2;
	}
	
	public ExpressionInfo(Expression exp, int firstOperand, 
					int secondOperand, int unused) {
		
		super(exp);
		this.value = firstOperand;
		this.value2 = secondOperand;
		str = "new Add";
		i = 3;
	}
	
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
		return String.format(str + "(%d,%d)", value, value2);
	}

}
