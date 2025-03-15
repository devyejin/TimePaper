package com.timepaper.backend.global.common.exception.custom.common;

import com.timepaper.backend.global.common.exception.ErrorCode;

public class ResourceNotFoundException extends GlobalException {

  public ResourceNotFoundException(ErrorCode errorCode) {
    super(errorCode);
  }

  public ResourceNotFoundException() {
    super(ErrorCode.DEFAULT_NOT_FOUND);
  }
}
