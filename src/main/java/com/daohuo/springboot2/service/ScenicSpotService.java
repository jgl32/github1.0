package com.daohuo.springboot2.service;/**
 * Greate by jgl on:2019/2/19
 */

import com.daohuo.springboot2.entity.ScenicSpot;
import com.daohuo.springboot2.entity.ScenicSpotExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ Author     ：jgl.
 * @ Date       ：Created in 15:36 2019/2/19
 * @ Description：
 * @ Modified By：
 * @Version: 1.0$
 */

public interface ScenicSpotService {

    long countByExample(ScenicSpotExample example);

    int deleteByExample(ScenicSpotExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScenicSpot record);

    int insertSelective(ScenicSpot record);

    List<ScenicSpot> selectByExample(ScenicSpotExample example);

    ScenicSpot selectByPrimaryKey(Integer id);

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
