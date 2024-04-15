package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

class UserServiceTest {

    UserRepository userRepository = mock(UserRepository.class);

    UserService userService = mock(UserService.class);
    @Test
    void getUserById() {
        long UserId = 123;
        User UserAttendu = new User(UserId, "Nana");

        //definir le comportement
        when(userRepository.findUserById(UserId)).thenReturn(UserAttendu);

        // le resultat actuel de la methode
        User UserActuel = userService.getUserById(UserId);

        //le verification
        verify(userRepository).findUserById(UserId);
    }
}