package cn.wyc.strutsRegist;

public interface IUserService {
	//判断用户是否存在
	User findUserByName(String username);
	//用户注册
	int register(User user);
}
