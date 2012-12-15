package spreadsheet;

import quickcheck.BooleanGenerator;
import quickcheck.Generator;
import quickcheck.IntegerGenerator;
import quickcheck.StringGenerator;

public abstract class ExpressionGenerator 
	 extends Generator<ExpressionInfo> {
	
	protected final IntegerGenerator intGen;
	protected final BooleanGenerator boolGen;
	protected final StringGenerator strGen;

	
	public ExpressionGenerator() {
		this.intGen = new IntegerGenerator();
	    this.boolGen = new BooleanGenerator();
	    this.strGen = new StringGenerator();
	}
	
	public abstract ExpressionInfo next();
}
