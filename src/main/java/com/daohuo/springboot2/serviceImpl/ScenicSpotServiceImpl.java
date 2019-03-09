package com.daohuo.springboot2.serviceImpl;/**
 * Greate by jgl on:2019/2/19
 */

import com.daohuo.springboot2.entity.ScenicSpot;
import com.daohuo.springboot2.entity.ScenicSpotExample;
import com.daohuo.springboot2.mapper.ScenicSpotMapper;
import com.daohuo.springboot2.service.ScenicSpotService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author     ：jgl.
 * @ Date       ：Created in 15:36 2019/2/19
 * @ Description：
 * @ Modified By：
 * @Version: 1.0$
 */
@Service
public class ScenicSpotServiceImpl implements ScenicSpotService{

    @Autowired
    private ScenicSpotMapper scenicSpotMapper;

    @Override
    public long countByExample(ScenicSpotExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ScenicSpotExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(ScenicSpot record) {
        return 0;
    }

    @Override
    public int insertSelective(ScenicSpot record) {
        return 0;
    }

    @Override
    public List<ScenicSpot> selectByExample(ScenicSpotExample example) {
        return null;
    }

    @Override
    public ScenicSpot selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(ScenicSpot record, ScenicSpotExample example) {
        return 0;
    }

    @Override
    public int updateByExample(ScenicSpot record, ScenicSpotExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(ScenicSpot record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ScenicSpot record) {
        return 0;
    }

    /**
    * @Description:
    * @Param: [record]
    * @return: com.daohuo.springboot2.entity.ScenicSpot
    * @Author: jgl
    * @Date: 2019/2/21 12:04
    **/
    @Override
    public ScenicSpot selectByLatitudeAndLongitude(ScenicSpot record) {
        return scenicSpotMapper.selectByLatitudeAndLongitude(record);
    }

}
