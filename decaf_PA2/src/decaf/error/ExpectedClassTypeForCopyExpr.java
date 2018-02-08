package decaf.error;

import decaf.Location;

/**
 * example：function 'length' expects 0 argument(s) but 2 given<br>
 * PA2
 */
public class ExpectedClassTypeForCopyExpr extends DecafError {

	private String type;

	public ExpectedClassTypeForCopyExpr(Location location, String type) {
		super(location);
		this.type = type;
	}

	@Override
	protected String getErrMsg() {
		return "expected class type for copy expr but "+type+" given";
	}

}
