package spreadsheet.logical;

import spreadsheet.ExpressionGenerator;
import spreadsheet.ExpressionInfo;

public class LConstGenerator extends ExpressionGenerator {

	@Override
	public ExpressionInfo next() {
		final boolean value = this.boolGen.next();
		final LConst lConst = new LConst(value);
		return new ExpressionInfo(lConst, value);
		
	}

}
