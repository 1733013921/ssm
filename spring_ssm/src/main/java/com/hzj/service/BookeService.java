package com.hzj.service;

import com.hzj.pojo.Bookes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookeService {
    //增
    int addBooke(Bookes booke);

    //删
    int deleteBooke(@Param("id") int id);

    //改
    int updateBooke(Bookes booke);

    //查询所有
    List<Bookes> showBooke();

    //按id查询
    Bookes findBooke(@Param("id") int id);


}
