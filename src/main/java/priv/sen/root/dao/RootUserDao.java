package priv.sen.root.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import priv.sen.root.entity.RootUser;

public interface RootUserDao {

	/**
	 * 查询所有用户
	 * @param start
	 * @param limit
	 * @return
	 */
	List<RootUser> selectAll(@Param("start") Integer start,@Param("limit") Integer limit);
	
	/**
	 * 积分榜用户
	 * @param score
	 * @return
	 */
	List<RootUser> selectByScore(@Param("limit") Integer limit);
	
	/**
	 * 通过用户ID查询单个用户
	 * @param UserId
	 * @return
	 */
	RootUser selectByUserId(@Param("userId") Integer userId);
	
	/**
	 * 通过用户昵称查询单个用户
	 * @param userName
	 * @return
	 */
	RootUser selectByUserName(@Param("userName") String userName);
	
	/**
	 * 通过邮箱查询单个用户
	 * @param email
	 * @return
	 */
	RootUser selectByEmail(@Param("email") String email);
	
	/**
	 * 通过昵称和密码查询单个用户
	 * @param userName
	 * @param password
	 * @return
	 */
	RootUser selectByUserNameAndPassword(@Param("userName") String userName,@Param("password") String password);
	
	/**
	 * 通过邮箱和密码查询单个用户
	 * @param email
	 * @param password
	 * @return
	 */
	RootUser selectByEmailAndPassword(@Param("email") String email,@Param("password") String password);
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	int insertUser(RootUser user);
	
	/**
	 * 通过昵称和密码添加用户
	 * @param userName
	 * @param password
	 * @return
	 */
	int insertByUserNameAndPassword(@Param("userName") String userName,@Param("password") String password);
	
	/**
	 * 通过昵称、密码、邮箱添加用户
	 * @param userName
	 * @param password
	 * @param email
	 * @return
	 */
	int insertByUserNameAndPasswordAndEmail(@Param("userName") String userName,@Param("password") String password,@Param("email") String email);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	int updateUser(RootUser user);
	
	/**
	 * 通过昵称修改昵称、邮箱、个人主页、个性签名、邮件是否接受社区消息
	 * @param userName
	 * @param newUserName
	 * @param email
	 * @param url
	 * @param signature
	 * @return
	 */
	int updateUserByUserName(@Param("userName") String userName,@Param("newUserName") String newUserName,
			@Param("email") String email,@Param("url") String url,@Param("signature") String signature,
			@Param("receive_msg") Integer receive_msg);
	
	/**
	 * 通过ID修改昵称、邮箱、个人主页、个性签名、邮件是否接受社区消息
	 * @param userName
	 * @param newUserName
	 * @param email
	 * @param url
	 * @param signature
	 * @return
	 */
	int updateUserByUserId(@Param("userId") String userName,@Param("newUserName") String newUserName,
			@Param("email") String email,@Param("url") String url,@Param("signature") String signature,
			@Param("receive_msg") Integer receive_msg);
	
	/**
	 * 通过ID修改头像
	 * @param userId
	 * @param avatar
	 * @return
	 */
	int updateAvatarByUserId(@Param("userId") Integer userId,@Param("avatar") String avatar);
	
	/**
	 * 通过昵称修改头像
	 * @param userName
	 * @param avatar
	 * @return
	 */
	int updateAvatarByUserName(@Param("userName") String userName,@Param("avatar") String avatar);
	
	/**
	 * 通过ID修改密码
	 * @param userId
	 * @param password
	 * @return
	 */
	int updatePasswordByUserId(@Param("userId") Integer userId,@Param("password") String password);
	
	/**
	 * 通过昵称修改密码
	 * @param userName
	 * @param passwrod
	 * @return
	 */
	int updatePasswordByUserName(@Param("userName") String userName,@Param("password") String passwrod);
	
	/**
	 * 通过ID删除用户
	 * @param userId
	 * @return
	 */
	int deleteUserByUserId(@Param("userId") Integer userId);
	
	/**
	 * 通过昵称删除用户
	 * @param userName
	 * @return
	 */
	int deleteUserByUserName(@Param("userName") String userName);
	
	/**
	 * 统计所有注册会员的数量
	 * @return
	 */
	int countUserAll();

}
