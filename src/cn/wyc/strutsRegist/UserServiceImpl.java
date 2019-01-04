package cn.wyc.strutsRegist;

public class UserServiceImpl implements IUserService{
	private IUserDao dao = new UserDaoImpl();
	@Override
	public User findUserByName(String username) {
		return dao.selectUserByName(username);
	}

	@Override
	public int register(User user) {
		return dao.addUser(user);
	}

}
