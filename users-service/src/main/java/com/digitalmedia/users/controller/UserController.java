package com.digitalmedia.users.controller;

import com.digitalmedia.users.model.User;
import com.digitalmedia.users.model.dto.UserRequest;
import com.digitalmedia.users.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.security.Principal;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
  private final IUserService userService;

  @GetMapping("/admin")
  /*@PreAuthorize("hasRole('ROLE_admin')")*/
  @RolesAllowed({"product_read"})
  public String siEsAdmin(){
    return "Funciona!";
  }


  @GetMapping("/me")
  @PreAuthorize("hasRole('ROLE_admin') AND hasAutority('GROUP_admin')")
  public User getUserExtra(@RequestParam String principal) {
    return userService.validateAndGetUserExtra(principal);
  }

  @PostMapping("/me")
  public User saveUserExtra(@Valid @RequestBody UserRequest updateUserRequest, @RequestParam(value = "principal") String principal) {
    Optional<User> userOptional = userService.getUserExtra(principal);
    User userExtra = userOptional.orElseGet(() -> new User(principal));
    userExtra.setAvatar(updateUserRequest.getAvatar());
    return userService.saveUserExtra(userExtra);
  }

}
