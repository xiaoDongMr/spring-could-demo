package cn.ylcf.portal.service;


import cn.ylcf.pojo.TbContent;
import cn.ylcf.portal.service.hystrix.PortalContentServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 首页操作 Service
 *
 * @create 2017-05-04
 */

@FeignClient(value = "xbin-store-cloud-service-portal",fallback = PortalContentServiceHystrix.class)
public interface PortalContentService {

    @RequestMapping(value = "/getContentByCid",method = RequestMethod.POST)
    List<TbContent> getContentByCid(@RequestParam("bigAdIndex") Long bigAdIndex);
}
