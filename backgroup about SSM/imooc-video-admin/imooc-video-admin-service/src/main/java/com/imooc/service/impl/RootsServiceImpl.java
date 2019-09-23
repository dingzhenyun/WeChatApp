package com.imooc.service.impl;/**
 * @author DingZhenYun
 * @create 2019-09-23 上午 9:00
 */

import com.imooc.mapper.RootsMapper;
import com.imooc.pojo.Roots;
import com.imooc.pojo.RootsExample;
import com.imooc.service.RootsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: imooc-video-admin->RootsServiceImpl
 * @description:
 **/
@Service
public class RootsServiceImpl implements RootsService {
    @Autowired
    private RootsMapper rootsMapper;
    @Override
    public boolean queryUsernameIsExist(String username) {

        return false;
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryRootForLogin(String username, String password) {
        RootsExample rootsExample=new RootsExample();
        RootsExample.Criteria criteria = rootsExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);

        List<Roots> list = rootsMapper.selectByExample(rootsExample);
        if(list!=null&&list.size()==1){
            return true;
        }
        return false;
    }
    
}
