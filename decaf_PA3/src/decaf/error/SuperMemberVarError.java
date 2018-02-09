package decaf.error;

import decaf.Location;

/**
 * example：new array length must be an integer<br>
 * PA2
 */
public class SuperMemberVarError extends DecafError {

	public SuperMemberVarError(Location location) {
		super(location);
	}

	@Override
	protected String getErrMsg() {
		return "super.member_var is not supported";
	}

}
