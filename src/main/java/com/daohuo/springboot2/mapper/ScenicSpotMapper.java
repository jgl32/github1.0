package com.daohuo.springboot2.mapper;

import com.daohuo.springboot2.entity.ScenicSpot;
import com.daohuo.springboot2.entity.ScenicSpotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicSpotMapper {
    int countByExample(ScenicSpotExample example);

    int deleteByExample(ScenicSpotExample example);

    int deleteByPrimaryKey(Integer ssId);

    int insert(ScenicSpot record);

    int insertSelective(ScenicSpot record);

    List<ScenicSpot> selectByExample(ScenicSpotExample example);

    ScenicSpot selectByPrimaryKey(Integer ssId);

    int updateByExampleSelective(@Param("record") ScenicSpot record, @Param("example") ScenicSpotExample example);

    int updateByExample(@Param("record") ScenicSpot record, @Param("example") ScenicSpotExample example);

    int updateByPrimaryKeySelective(ScenicSpot record);

    int updateByPrimaryKey(ScenicSpot record);
    /**
     * @Description: 根据经度纬度查询景点
     * @Param: [record]
     * @return: com.bm.smallApp.entity.ScenicSpot
     * @Author: jgl
     * @Date: 2019/2/19 15:35
     **/
    ScenicSpot selectByLatitudeAndLongitude(ScenicSpot record);
}