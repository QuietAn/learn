package red.silence.learn.springboot.service;


import red.silence.learn.springboot.model.User;

/**
 * 描述：
 * 创建人：WangDongling
 * 创建时间：2019-10-24
 */
public interface IUserService {

	Integer save(User user);

	User findById(String uuid);

	Integer deleteById(String uuid);

	Integer updateById(User user);
}
