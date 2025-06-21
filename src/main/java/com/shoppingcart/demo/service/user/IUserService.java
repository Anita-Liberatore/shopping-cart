package com.shoppingcart.demo.service.user;

import com.shoppingcart.demo.model.User;
import com.shoppingcart.demo.request.CreateUserRequest;
import com.shoppingcart.demo.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

}
