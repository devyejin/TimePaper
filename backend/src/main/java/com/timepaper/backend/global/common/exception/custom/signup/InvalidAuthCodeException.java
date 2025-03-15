package com.timepaper.backend.global.common.exception.custom.signup;

import com.timepaper.backend.global.common.exception.ErrorCode;
import com.timepaper.backend.global.common.exception.custom.common.GlobalException;

public class InvalidAuthCodeException extends GlobalException {

  public InvalidAuthCodeException() {
    super(ErrorCode.INVALID_AUTH_CODE);
  }
}
