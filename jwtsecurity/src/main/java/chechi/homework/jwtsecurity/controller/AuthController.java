package chechi.homework.jwtsecurity.controller;

import chechi.homework.jwtsecurity.dto.AuthResponse;
import chechi.homework.jwtsecurity.dto.LoginRequest;
import chechi.homework.jwtsecurity.dto.RegisterRequest;
import chechi.homework.jwtsecurity.entity.User;
import chechi.homework.jwtsecurity.repository.UserRepository;
import chechi.homework.jwtsecurity.security.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> registerUser (@RequestBody RegisterRequest request) {

        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> loginUser (@RequestBody LoginRequest request) {

        return ResponseEntity.ok(service.login(request));
    }





}
