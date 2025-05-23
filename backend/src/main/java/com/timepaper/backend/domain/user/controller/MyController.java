package com.timepaper.backend.domain.user.controller;

import com.timepaper.backend.domain.user.dto.response.MyPostitListResponseDto;
import com.timepaper.backend.domain.user.dto.response.MyTimepaperListResponseDto;
import com.timepaper.backend.domain.user.service.MyService;
import com.timepaper.backend.domain.user.entity.User;
import com.timepaper.backend.global.common.dto.ApiResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/my")
public class MyController {

  private final MyService myService;

  @GetMapping("/timepapers")
  public ResponseEntity<ApiResponse<List<MyTimepaperListResponseDto>>> getMyTimepapers(
      @AuthenticationPrincipal User authenticatedUser) {
    return ResponseEntity.ok(ApiResponse.ok(myService.getMyTimepapers(authenticatedUser)));
  }

  @GetMapping("/postits")
  public ResponseEntity<ApiResponse<List<MyPostitListResponseDto>>> getMyPostits(
      @AuthenticationPrincipal User authenticatedUser) {
    return ResponseEntity.ok(ApiResponse.ok(myService.getMyPostits(authenticatedUser)));
  }

}

