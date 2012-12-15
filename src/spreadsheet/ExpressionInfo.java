package spreadsheet;

import quickcheck.Info;

public class ExpressionInfo extends Info<Expression> {

	private int i;
	private String name;
	private String str;
	private String str2;
	private int value;
	private int value2;
	private boolean bool;
	private boolean bool2;

	public ExpressionInfo(Expression expression, int value) {
		super(expression);	
		this.value = expression.toInt();
		name = "new AConst";
		i = 1;
	}

	public ExpressionInfo(Expression exp, int value, String str) {
		super(exp);
		this.value = value;
		this.name = str;
		i = 2;
	}

	public ExpressionInfo(Expression exp, int firstOperand, int secondOperand, String str) {
		super(exp);
		this.value = firstOperand;
		this.value2 = secondOperand;
		this.name = str;
		i = 3;
	}

	public ExpressionInfo(Expression exp, boolean bool) {
		super(exp);
		this.bool = bool;
		name = "new LConst";
		i = 4;
	}

	public ExpressionInfo(Expression exp, boolean bool, boolean bool2) {
		super(exp);
		this.bool = bool;
		this.bool2 = bool2;
		name = "new Conjunct";
		i = 5;
	}

	public ExpressionInfo(Expression exp, boolean bool, boolean bool2, String str) {
		super(exp);
		this.bool = bool;
		this.bool2 = bool2;
		this.name = str;
		i = 6;
	}

	public ExpressionInfo(Expression exp, String str) {
		super(exp);
		this.str = str;
		this.name = "New TConst";
		i = 7;
	}

	public ExpressionInfo(Expression exp, String str, String str2) {
		super(exp);
		this.str = str;
		this.str2 = str2;
		this.name = "New Concat";
		i = 8;
	}

	public int intResult() {
		switch (i) {
		case 1 : return value;
		case 2 : return value * (-1);
		default: return value + value2;
		}
		
	}
	/**
	 * The expected result of a boolean Expression
	 * @return boolean
	 */
	public boolean boolResult() {
		switch (i) {
		case 4 : return bool;
		case 5 : return (bool && bool2);
	    default : return (bool || bool2);
		}
	}

	public String strResult() {
		if (i == 7) 
			return str;
		else 
			return (str + str2);
	}

	@Override
	public String toString() {
		switch (i) {
		case 1 : return String.format(name + "(%d)", value);
		case 2 : return String.format(name + "(%d)", value);
		case 3 : return String.format(name + "(%d,%d)", value, value2);
		case 4 : return name + " (" + Boolean.toString(bool) + ")";
		case 5 : return name + " (" + Boolean.toString(bool)+ ","
						+ Boolean.toString(bool)+ ")";
		case 6 : return name + " (" + Boolean.toString(bool)+ ","
						+ Boolean.toString(bool)+ ")";
		case 7 : return name + " (" + str + ")";
		case 8 :  return name + " (" + str + "," + str2 + ")";
		}
		return null;
	}

}