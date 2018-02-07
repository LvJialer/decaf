package decaf.error;

import decaf.Location;

/**
 * example：function 'gotoMars' expects 1 argument(s) but 3 given<br>
 * PA2
 */
public class ACaseIsDifferentWithOtherError extends DecafError {

	private String given;

	private String expect;

	public ACaseIsDifferentWithOtherError(Location location, String given, String expect) {
		super(location);
		this.given = given;
		this.expect = expect;
	}

	@Override
	protected String getErrMsg() {
		return "type: "+given+" is different with other expr's type "+expect;
	}
}
