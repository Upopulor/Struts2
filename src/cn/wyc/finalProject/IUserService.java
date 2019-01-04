package cn.wyc.finalProject;

import java.util.List;

public interface IUserService {
	User login(String logonName,String logonPwd);
	int saveUser(User user);
	int modifyUser(User user);
	int removeUser(Integer userID);
	User findUserById(Integer userID);
	List<User> findAllUser();
	List<User> findByCondition(String userName,String sex,String education,String isUpload);
}
