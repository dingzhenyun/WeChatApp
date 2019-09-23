package com.imooc.mapper;

import com.imooc.pojo.Roots;
import com.imooc.pojo.RootsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RootsMapper {
    int countByExample(RootsExample example);

    int deleteByExample(RootsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Roots record);

    int insertSelective(Roots record);

    List<Roots> selectByExample(RootsExample example);

    Roots selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Roots record, @Param("example") RootsExample example);

    int updateByExample(@Param("record") Roots record, @Param("example") RootsExample example);

    int updateByPrimaryKeySelective(Roots record);

    int updateByPrimaryKey(Roots record);
}