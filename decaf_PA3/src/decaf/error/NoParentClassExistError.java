package decaf.error;

import decaf.Location;

/**
 * example：function 'length' expects 0 argument(s) but 2 given<br>
 * PA2
 */
public class NoParentClassExistError extends DecafError {

	private String classname;

	public NoParentClassExistError(Location location, String classname) {
		super(location);
		this.classname = classname;
	}

	@Override
	protected String getErrMsg() {
		return "no parent class exist for "+classname;
	}

}
