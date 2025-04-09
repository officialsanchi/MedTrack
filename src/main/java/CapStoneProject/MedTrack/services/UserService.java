package CapStoneProject.MedTrack.services;

import CapStoneProject.MedTrack.dtos.request.CreateUserRequest;
import CapStoneProject.MedTrack.dtos.request.LoginRequest;
import CapStoneProject.MedTrack.dtos.responds.CreateUserResponse;
import CapStoneProject.MedTrack.dtos.responds.LoginResponse;

public interface UserService {
    CreateUserResponse addUser(CreateUserRequest createUserRequest);
    LoginResponse login(LoginRequest loginRequest);
}
