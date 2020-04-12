package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    @Transactional
    @Override
    public boolean insertUser(User user){
        if(user.getImg() != null&& !"".equals(user.getImg())){
            try{
                int effectNum = userDao.insertUser(user);
                if(effectNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("插入用户信息失败");
                }
            }catch (Exception e){
                throw new RuntimeException("插入用户信息失败"+e.getMessage());
            }
        }else{
            throw new RuntimeException("用户名不能为空");
        }
    }

    @Override
    public Integer findIdByName(String username){
        return userDao.findIdByName(username);
    }

}
