package com.timepaper.backend.global.common.exception.custom.common;

import com.timepaper.backend.global.common.exception.ErrorCode;

public class ForBiddenException extends GlobalException {

  public ForBiddenException(ErrorCode errorCode) {
    super(errorCode);
  }

  public ForBiddenException() {
    super(ErrorCode.DEFAULT_FORBIDDEN);
  }
}
