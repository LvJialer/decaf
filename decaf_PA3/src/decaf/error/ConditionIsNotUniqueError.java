package decaf.error;

import decaf.Location;

/**
 * example：illegal class inheritance (should be a cyclic)<br>
 * PA2
 */
public class ConditionIsNotUniqueError extends DecafError {

	public ConditionIsNotUniqueError(Location location) {
		super(location);
	}

	@Override
	protected String getErrMsg() {
		return "condition is not unique";
	}

}
