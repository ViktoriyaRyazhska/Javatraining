

	public enum ErrorNumb {

    BADREQUEST(400), UNAUTHORIZED(401), FORBIDDEN(403), NOTFOUND(404), METHODNOTALLOWED(405), WRONG(123);

//	private String name;
	private int number;
	
	private ErrorNumb(int number) {
	//	this.name = name;
		this.number = number;

	}


		public int getNumber() {
			  return this.number;
		  }
}