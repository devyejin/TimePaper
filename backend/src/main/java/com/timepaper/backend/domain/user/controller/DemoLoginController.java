package com.timepaper.backend.domain.user.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.timepaper.backend.domain.user.entity.User;
import com.timepaper.backend.global.auth.service.AuthService;
import com.timepaper.backend.global.common.dto.ApiResponse;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class DemoLoginController {

    private final AuthenticationManager authenticationManager;
    private final AuthService authService;
    private final ObjectMapper objectMapper;
    @Value("${DEMO_EMAIL}")
    private String demoEmail;
    @Value("${DEMO_PASSWORD}")
    private String demoPassword;

    @PostMapping("/auth/demo-login")
    public ResponseEntity<?> demoLogin(HttpServletResponse response) throws IOException {
        UsernamePasswordAuthenticationToken authToken =
                new UsernamePasswordAuthenticationToken(demoEmail, demoPassword);

        try {
            Authentication authentication = authenticationManager.authenticate(authToken);
            User user = (User) authentication.getPrincipal();

            // 로그인 성공 시 토큰 설정
            authService.setTokensResponse(response, authentication, user.getId());

            return ResponseEntity.ok().body(ApiResponse.ok("데모 로그인 성공"));

        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(ApiResponse.error("유효하지 않은 데모 로그인 정보입니다.", "DEMO_LOGIN_FAIL"));
        }
    }
}