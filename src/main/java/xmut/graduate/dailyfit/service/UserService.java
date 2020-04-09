package xmut.graduate.dailyfit.service;

import xmut.graduate.dailyfit.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findByAllUser();

    User adminLogin(String username, String password);

}
