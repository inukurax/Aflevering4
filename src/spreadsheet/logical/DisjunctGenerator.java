package spreadsheet.logical;

import spreadsheet.ExpressionGenerator;
import spreadsheet.ExpressionInfo;

public class DisjunctGenerator extends ExpressionGenerator {

	@Override
	public ExpressionInfo next() {
		final boolean val1 = this.boolGen.next();
		final boolean val2 = this.boolGen.next();
		final LConst lConst1 = new LConst(val1);
		final LConst lConst2 = new LConst(val2);
		final Disjunct disjunct = new Disjunct(lConst1, lConst2);
		return new ExpressionInfo(disjunct, val1, val2, "New Disjunct");
		
	}

}
