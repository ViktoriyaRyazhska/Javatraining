package com.romanbaida.hw4;

public enum HTTPError {

  BAD_REQUEST(400, "Bad Request"),
  UNAUTHORIZED(401, "Unauthorized"),
  FORBIDDEN(403, "Forbidden"),
  NOT_FOUND(404, "Not Found"),
  CONFLICT(409, "Conflict");

  private int code;
  private String description;

  HTTPError(int code, String description) {
    this.code = code;
    this.description = description;
  }

  public static HTTPError getErrorByCode(int code) {
    for (HTTPError error : HTTPError.values()) {
      if (error.code == code) {
        return error;
      }
    }

    return null;
  }

  @Override
  public String toString() {
    return "code = " + code + ", description = '" + description + "'";
  }

}
