package cn.wyc.strutsRegist;

public interface IUserDao {

	User selectUserByName(String username);

	int addUser(User user);

}
