package top.mmforum.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import top.mmforum.entity.User;

@Mapper
public interface UserMapper {
    List<User> findAll();
}
