package decaf.error;

import decaf.Location;

/**
 * example：function 'length' expects 0 argument(s) but 2 given<br>
 * PA2
 */
public class DoStmtRequestdTypeBoolError extends DecafError {

	private String type;

	public DoStmtRequestdTypeBoolError(Location location, String type) {
		super(location);
		this.type = type;
	}

	@Override
	protected String getErrMsg() {
		return "The condition of Do Stmt requestd type bool but "+type+" given";
	}

}
