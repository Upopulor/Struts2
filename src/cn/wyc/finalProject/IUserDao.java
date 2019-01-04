package cn.wyc.finalProject;

import java.util.List;

public interface IUserDao {

	User selectUserByInfo(String logonName, String logonPwd);

	int addUser(User user);

	int updateUser(User user);

	int deleteUser(Integer userID);

	User selectUserById(Integer userID);

	List<User> selectAllUser();

	List<User> selectUserByCondition(String userName, String sex, String education, String isUpload);
	
}
