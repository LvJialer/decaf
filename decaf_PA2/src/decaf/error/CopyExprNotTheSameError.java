package decaf.error;

import decaf.Location;

/**
 * example：incompatible argument 3: int[] given, int/bool/string expected<br>
 * 3表示发生错误的是第三个参数<br>
 * PA2
 */
public class CopyExprNotTheSameError extends DecafError {

	private String left;

	private String expr;

	public CopyExprNotTheSameError(Location location, String left, String expr) {
		super(location);
		this.left = left;
		this.expr = expr;
	}

	@Override
	protected String getErrMsg() {
		return "For copy expr, the source "+expr+" and the destination "+left+" are not same";
	}

}
