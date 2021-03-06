package top.cocoawork.chat.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import top.cocoawork.chat.dao.entity.User;
import top.cocoawork.chat.dao.entity.UserFriend;

import java.util.List;

@Component
@Mapper
public interface UserFriendMapper extends BaseMapper<UserFriend> {

    List<User> getFriendsById(Long id);

    boolean delete(@Param("uid") Long uid, @Param("fid") Long fid);



}
