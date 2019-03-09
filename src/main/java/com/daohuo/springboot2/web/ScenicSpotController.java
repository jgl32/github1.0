package com.daohuo.springboot2.web;/**
 * Greate by jgl on:2019/2/19
 */

import com.daohuo.springboot2.common.Res;
import com.daohuo.springboot2.entity.ScenicSpot;
import com.daohuo.springboot2.service.ScenicSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author     ：jgl.
 * @ Date       ：Created in 15:40 2019/2/19
 * @ Description：
 * @ Modified By：
 * @Version: 1.0$
 */
@Controller
@RequestMapping("/scenicSpot")
public class ScenicSpotController {

    @Autowired
    private ScenicSpotService scenicSpotService;

    /** 
    * @Description: 根据经度纬度查询景点
    * @Param: [page, limit, scenicSpot] 
    * @return: com.bm.smallApp.common.Res 
    * @Author: jgl 
    * @Date: 2019/2/19 16:00
    **/ 
    @RequestMapping("/selectByLatitudeAndLongitude")
    @ResponseBody
    public Res selectByLatitudeAndLongitude(@RequestParam(value = "ssLatitude", required = false) Double ssLatitude
                                             , @RequestParam(value = "ssLongitude", required = false) Double ssLongitude
                                             , ScenicSpot scenicSpot){
        if (ssLatitude == null) {
            return Res.error("ssLatitude  不能为空");
        }
        if (ssLongitude == null) {
            return Res.error("ssLongitude  不能为空");
        }
        scenicSpot.setSsLatitude(ssLatitude);
        scenicSpot.setSsLongitude(ssLongitude);

        scenicSpot=scenicSpotService.selectByLatitudeAndLongitude(scenicSpot);
        return scenicSpot!=null? Res.ok().put("scenicSpot",scenicSpot):Res.error();
    }

    /**
    * @Description:  新增景点
    * @Param: [ssLatitude, ssLongitude, scenicSpot]
    * @return: com.bm.smallApp.common.Res
    * @Author: jgl
    * @Date: 2019/2/20 11:35
    **/
    @RequestMapping("/insertScenicSpot")
    @ResponseBody
    public Res insertScenicSpot(@RequestParam(value = "ssLatitude", required = false) Double ssLatitude
            ,@RequestParam(value = "ssLongitude", required = false) Double ssLongitude
            , ScenicSpot scenicSpot){
        if (ssLatitude == null) {
            return Res.error("ssLatitude  不能为空");
        }
        if (ssLongitude == null) {
            return Res.error("ssLongitude  不能为空");
        }

        /*scenicSpot.setSsLatitude(latitude);
        scenicSpot.setSsLongitude(longitude);*/
        Integer id=scenicSpot.getSsId();

        int num;
        if(id==null){
            num=scenicSpotService.insert(scenicSpot);
        }else{
            num=scenicSpotService.updateByPrimaryKeySelective(scenicSpot);
        }


        return num>0? Res.ok().put("scenicSpot",scenicSpot):Res.error();
    }




    /**
     * @Description:  删除景点根据id
     * @Param: [ssLatitude, ssLongitude, scenicSpot]
     * @return: com.bm.smallApp.common.Res
     * @Author: jgl
     * @Date: 2019/2/20 11:35
     **/
    @RequestMapping("/deleteScenicSpot")
    @ResponseBody
    public Res deleteScenicSpot(@RequestParam(value = "ssId", required = false) Integer ssId){
        if (ssId == null) {
            return Res.error("ssId  不能为空");
        }

        /*scenicSpot.setSsLatitude(latitude);
        scenicSpot.setSsLongitude(longitude);*/

        int num=scenicSpotService.deleteByPrimaryKey(ssId);
        return num>0? Res.ok():Res.error();
    }


}
