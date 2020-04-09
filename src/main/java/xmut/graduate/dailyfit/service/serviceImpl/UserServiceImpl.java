package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmut.graduate.dailyfit.dao.UserDao;
import xmut.graduate.dailyfit.pojo.User;
import xmut.graduate.dailyfit.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findByAllUser(){
        return userDao.findByAllUser();
    }

    @Override
    public User adminLogin(String username, String password) {
        User user = userDao.adminLogin(username,password);
        String username1 = user.getUsername();
        String password1 = user.getPassword();
        System.out.println(username1+" "+password1);
        return user;
    }

}
