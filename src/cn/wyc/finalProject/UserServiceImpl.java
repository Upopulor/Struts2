package cn.wyc.finalProject;

import java.util.List;

public class UserServiceImpl implements IUserService {
	private IUserDao dao = new UserDaoImpl();
	@Override
	public User login(String logonName, String logonPwd) {
		return dao.selectUserByInfo(logonName,logonPwd);
	}

	@Override
	public int saveUser(User user) {
		return dao.addUser(user);
	}

	@Override
	public int modifyUser(User user) {
		return dao.updateUser(user);
	}

	@Override
	public int removeUser(Integer userID) {
		return dao.deleteUser(userID);
	}

	@Override
	public User findUserById(Integer userID) {
		return dao.selectUserById(userID);
	}

	@Override
	public List<User> findAllUser() {
		return dao.selectAllUser();
	}

	@Override
	public List<User> findByCondition(String userName, String sex, String education, String isUpload) {
		return dao.selectUserByCondition(userName, sex,education,isUpload);
	}

}
