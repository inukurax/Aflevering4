package spreadsheet.arithmetic;

import spreadsheet.ExpressionGenerator;
import spreadsheet.ExpressionInfo;

public class AddGenerator extends ExpressionGenerator {

	@Override
	public ExpressionInfo next() {
		final int val1 = this.intGen.next();
		final int val2 = this.intGen.next();
		final AConst aConst1 = new AConst(val1);
		final AConst aConst2 = new AConst(val2);
		final Add add = new Add(aConst1, aConst2);
		return new ExpressionInfo(add, val1, val2 , "new Add");
	}

}
