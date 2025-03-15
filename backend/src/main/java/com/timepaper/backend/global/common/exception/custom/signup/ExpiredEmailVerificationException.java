package com.timepaper.backend.global.common.exception.custom.signup;

import com.timepaper.backend.global.common.exception.ErrorCode;
import com.timepaper.backend.global.common.exception.custom.common.GlobalException;

public class ExpiredEmailVerificationException extends GlobalException {

  public ExpiredEmailVerificationException() {
    super(ErrorCode.EXPIRED_EMAIL_VERIFICATION);
  }
}
