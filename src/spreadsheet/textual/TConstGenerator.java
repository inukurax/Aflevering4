package spreadsheet.textual;

import spreadsheet.ExpressionGenerator;
import spreadsheet.ExpressionInfo;

public class TConstGenerator extends ExpressionGenerator {

	@Override
	public ExpressionInfo next() {
		final String value = this.strGen.next();
		final TConst tConst = new TConst(value);
		return new ExpressionInfo(tConst, value);

	}

}