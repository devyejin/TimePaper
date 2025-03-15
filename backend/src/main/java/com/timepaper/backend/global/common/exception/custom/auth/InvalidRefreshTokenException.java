package com.timepaper.backend.global.common.exception.custom.auth;


import com.timepaper.backend.global.common.exception.ErrorCode;
import com.timepaper.backend.global.common.exception.custom.common.GlobalException;

public class InvalidRefreshTokenException extends GlobalException {

  public InvalidRefreshTokenException() {
    super(ErrorCode.INVALID_REFRESH_TOKEN);
  }

}
