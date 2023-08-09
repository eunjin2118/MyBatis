package kr.hs.study.MyBatis.mapper;

import kr.hs.study.MyBatis.dto.myUserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface myUserMapper {

    public void insert(myUserDTO dto);

    public List<myUserDTO> select();

    public void delete(String id);

    public void update(myUserDTO dto);

    public myUserDTO read(String id);
}
