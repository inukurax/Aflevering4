package spreadsheet.textual;

import spreadsheet.ExpressionGenerator;
import spreadsheet.ExpressionInfo;

public class ConcatGenerator extends ExpressionGenerator {

	@Override
	public ExpressionInfo next() {
		final String val1 = this.strGen.next();
		final String val2 = this.strGen.next();
		final TConst tConst1 = new TConst(val1);
		final TConst tConst2 = new TConst(val2);
		final Concat concat = new Concat(tConst1, tConst2);
		return new ExpressionInfo(concat , val1, val2);

	}

}