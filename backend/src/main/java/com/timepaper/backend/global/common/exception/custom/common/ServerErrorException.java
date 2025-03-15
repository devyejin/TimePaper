package com.timepaper.backend.global.common.exception.custom.common;

import com.timepaper.backend.global.common.exception.ErrorCode;

public class ServerErrorException extends GlobalException {
  
  public ServerErrorException() {
    super(ErrorCode.SERVER_ERROR);
  }
}
