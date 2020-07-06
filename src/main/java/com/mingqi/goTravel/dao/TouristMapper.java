package com.mingqi.goTravel.dao;

import com.mingqi.goTravel.pojo.Tourist;
import com.mingqi.goTravel.pojo.TouristExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TouristMapper {
    long countByExample(TouristExample example);

    int deleteByExample(TouristExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tourist record);

    int insertSelective(Tourist record);

    List<Tourist> selectByExample(TouristExample example);

    Tourist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tourist record, @Param("example") TouristExample example);

    int updateByExample(@Param("record") Tourist record, @Param("example") TouristExample example);

    int updateByPrimaryKeySelective(Tourist record);

    int updateByPrimaryKey(Tourist record);
}