package kr.hs.study.MyBatis.service;

import kr.hs.study.MyBatis.dto.myUserDTO;

import java.util.List;

public interface myUserService {
    // insert
    public void insert(myUserDTO dto);

    //select
    public List<myUserDTO> select();

    //delete
    public void delete(String id);

    // update
    public void update(myUserDTO dto);
    public myUserDTO read(String id);
}
