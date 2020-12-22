package com.application.VolunteerDiary;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserInfoTO registerUser(RegisterUserTO registerUserTO) {
        User user = User.builder()
                .email(registerUserTO.getEmail())
                .name(registerUserTO.getName())
                .password(registerUserTO.getPassword()).build();
        user = userRepository.save(user);
        return new UserInfoTO(user.getId(), user.getName());
    }

    public UserInfoTO login(LoginTO loginTO) {
        UserInfoTO userInfoTO = null;
        User user = userRepository.findByEmail(loginTO.getEmail());
        if(user != null && loginTO.getPassword() == user.getPassword()) {
            userInfoTO = new UserInfoTO(user.getId(), user.getName());
        }
        return userInfoTO;
    }

}
