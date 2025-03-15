package com.timepaper.backend.global.common.exception.custom.signup;

import com.timepaper.backend.global.common.exception.ErrorCode;
import com.timepaper.backend.global.common.exception.custom.common.GlobalException;

public class DuplicateEmailException extends GlobalException {

  public DuplicateEmailException() {
    super(ErrorCode.DUPLICATE_EMAIL);
  }
}
