package spreadsheet;

import quickcheck.Generator;
import quickcheck.IntegerGenerator;

public abstract class ExpressionGenerator 
	 extends Generator<ExpressionInfo> {
	
	protected final IntegerGenerator intGen1, intGen2;
	
	public ExpressionGenerator() {
		this.intGen1 = new IntegerGenerator();
	    this.intGen2 = new IntegerGenerator();
	}
	
	public abstract ExpressionInfo next();
}
