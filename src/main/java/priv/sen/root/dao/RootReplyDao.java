package priv.sen.root.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import priv.sen.root.entity.ReplyAndTopicByName;
import priv.sen.root.entity.RootReply;

public interface RootReplyDao {

	/**
	 * 查询全部评论
	 * @return
	 */
	List<RootReply> selectAll();
	
	/**
	 * 分页查询所有评论
	 * @param start
	 * @param limit
	 * @return
	 */
	List<RootReply> selectAll(@Param("start") Integer start, @Param("limit") Integer limit);
	
	/**
	 * 根据评论人昵称分页查询所有评论
	 * 关联话题表
	 * @param start
	 * @param limit
	 * @return
	 */
	List<ReplyAndTopicByName> selectAllByNameAndTopic(@Param("replyAuthorName")String replyAuthorName,@Param("start") Integer start, @Param("limit") Integer limit);
	
	/**
	 * 根据评论ID查询评论
	 * @param replyId
	 * @return
	 */
	RootReply selectByReplyId(@Param("replyId") Integer replyId);
	
	/**
	 * 根据话题ID查询评论
	 * @param topicId
	 * @return
	 */
	List<RootReply> selectByTopicId(@Param("topicId") Integer topicId);
	
	/**
	 * 根据话题ID分页查询评论
	 * @param start
	 * @param limit
	 * @param topicId
	 * @return
	 */
	List<RootReply> selectByTopicId(@Param("start") Integer start, @Param("limit") Integer limit,@Param("topicId") Integer topicId);
	
	/**
	 * 根据话题作者ID查询评论
	 * @param authorId
	 * @return
	 */
	List<RootReply> selectByTopicAuthorId(@Param("topicAuthorId") Integer topicAuthorId);
	
	/**
	 * 根据评论人ID查询评论
	 * @param replyAuthorId
	 * @return
	 */
	List<RootReplyDao> selectByReplyAuthorId(@Param("replyAuthorId") Integer replyAuthorId);
	
	/**
	 * 添加评论
	 */
	int insert(RootReply reply);
	
	/**
	 * 根据评论ID删除评论
	 * @param replyId
	 * @return
	 */
	int deleteByReplyId(@Param("replyId") Integer replyId);
	
	/**
	 * 根据话题ID删除评论
	 * @param replyId
	 * @return
	 */
	int deleteByTopicId(@Param("topicId") Integer topicId);
	
	/**
	 * 更新评论
	 * @param reply
	 * @return
	 */
	int update(RootReply reply);
	
	/**
	 * 统计所有评论
	 * @return
	 */
	int countAll();
	
	/**
	 * 根据话题ID统计评论数
	 * @param topicId
	 * @return
	 */
	int countByTopicId(@Param("topicId") Integer topicId);
	
	/**
	 * 根据用户ID统计评论数
	 * @param userId
	 * @return
	 */
	int countByUserId(@Param("userId") Integer userId);
	
	/**
	 * 根据用户昵称统计评论数
	 * @param userId
	 * @return
	 */
	int countByName(@Param("name") String name);
	
}
