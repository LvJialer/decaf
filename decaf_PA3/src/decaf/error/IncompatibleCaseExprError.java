package decaf.error;

import decaf.Location;

/**
 * example：incompatible argument 3: int given, bool expected<br>
 * 3表示发生错误的是第三个参数<br>
 * PA2
 */
public class IncompatibleCaseExprError extends DecafError {

	private String given;

	public IncompatibleCaseExprError(Location location,String given) {
		super(location);
		this.given = given;
	}

	@Override
	protected String getErrMsg() {
		return "incompatible case expr: "+given+" given, but int expected";
	}

}
