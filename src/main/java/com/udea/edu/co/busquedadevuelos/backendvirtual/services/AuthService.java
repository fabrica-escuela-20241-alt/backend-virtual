package com.udea.edu.co.busquedadevuelos.backendvirtual.services;

import com.udea.edu.co.busquedadevuelos.backendvirtual.controllers.dto.UserLoginDto;
import com.udea.edu.co.busquedadevuelos.backendvirtual.controllers.dto.UserRegisterDto;
import com.udea.edu.co.busquedadevuelos.backendvirtual.domain.Credentials;

public interface AuthService {

    void registerUser(UserRegisterDto userRegisterDto);
    Credentials authenticateUser(UserLoginDto userLoginDto);
    Credentials refreshToken(String token);
//    Void changePassword(UserChangePassCommand command);
}
