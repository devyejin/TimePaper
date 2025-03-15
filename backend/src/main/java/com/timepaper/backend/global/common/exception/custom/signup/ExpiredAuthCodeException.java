package com.timepaper.backend.global.common.exception.custom.signup;

import com.timepaper.backend.global.common.exception.ErrorCode;
import com.timepaper.backend.global.common.exception.custom.common.GlobalException;

public class ExpiredAuthCodeException extends GlobalException {

  public ExpiredAuthCodeException() {
    super(ErrorCode.EXPIRED_AUTH_CODE);
  }
}
