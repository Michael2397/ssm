package ssm.dao;

import org.apache.ibatis.annotations.Param;
import ssm.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> queryUserListByUsername(String username);

    public List<User> queryUserListByUsername2Sex(@Param("username")String username, @Param("sex") int sex);
}
