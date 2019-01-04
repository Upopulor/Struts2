package cn.wyc.strutsRegist;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

public class UserDaoImpl implements IUserDao {
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
	@Override
	public User selectUserByName(String username) {
		try {
			return qr.query("select * from user2 where username=?", new BeanHandler<User>(User.class),username);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	@Override
	public int addUser(User user) {
		try {
			return qr.update("insert into user2(username,password,birthday,hobby,married)values(?,?,?,?,?)",user.getUsername(),user.getPassword(),user.getBirthday(),user.getHobby(),user.isMarried());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
