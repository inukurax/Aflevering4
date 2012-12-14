package spreadsheet;

import quickcheck.*;
import spreadsheet.arithmetic.*;

public class ExpressionTest {
	
	
	  private ExpressionGenerator aConstGen;
	  private ExpressionGenerator addGen;
	  private ExpressionGenerator negGen;

	
	  @org.junit.Before
	  public void intializeExpressionGenerator() {
	    this.aConstGen = new AConstGenerator();
	    this.addGen = new AddGenerator();
	    this.negGen = new NegGenerator();
	  }
	
	  @org.junit.Test
	  public void testAConst() {

	    final Values<ExpressionInfo> infos =
	      new Values<ExpressionInfo>(this.aConstGen);

	    for (final ExpressionInfo info : infos) {
	      final int expected = info.result();
	      final int actual = info.getValue().toInt();

	      if (actual == expected) {
	        continue;
	      }

	      System.err.println("AConst failed. " + info);
	      
	    }
	  }
	  
	  @org.junit.Test
	  public void testAdd() {

	    final Values<ExpressionInfo> infos =
	      new Values<ExpressionInfo>(this.addGen);

	    for (final ExpressionInfo info : infos) {
	      final int expected = info.result();
	      final int actual = info.getValue().toInt();

	      if (actual == expected) {
	        continue;
	      }

	      System.err.println("Add failed. " + info);
	      
	    }
	  }
	  
	  @org.junit.Test
	  public void testNeg() {

	    final Values<ExpressionInfo> infos =
	      new Values<ExpressionInfo>(this.negGen);

	    for (final ExpressionInfo info : infos) {
	      final int expected = info.result();
	      final int actual = info.getValue().toInt();

	      if (actual == expected) {
	        continue;
	      }

	      System.err.println("Neg failed. " + info);
	      
	    }
	  }


}
