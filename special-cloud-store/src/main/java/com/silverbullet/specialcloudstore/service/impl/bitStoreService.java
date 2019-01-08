package com.silverbullet.specialcloudstore.service.impl;

import com.github.pagehelper.PageHelper;
import com.silverbullet.specialcloudstore.dao.bitStoreMapper;
import com.silverbullet.specialcloudstore.domain.bitStore;
import com.silverbullet.specialcloudstore.service.IbitStoreService;
import com.silverbullet.utils.BaseDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.silverbullet.utils.ToolUtil;
import com.silverbullet.core.pojo.UserInfo;;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 比特能管道管理 service接口
 * Created by jeffyuan on 2018/2/11.
 */
@Service
public class bitStoreService implements IbitStoreService {

    private static final Logger logger = LoggerFactory.getLogger(bitStoreService.class);

    @Autowired
    private bitStoreMapper bitStoreMapper;

    @Override
    public int countNum() {
        return bitStoreMapper.countNum();
    }

    @Override
    public BaseDataResult<bitStore> list(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        BaseDataResult<bitStore> listResults = new BaseDataResult<bitStore>();
        listResults.setResultList(bitStoreMapper.findList());
        listResults.setTotalNum(bitStoreMapper.countNum());

        return listResults;
    }

    @Override
    public bitStore getOneById(Long id) {
        return bitStoreMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean Update(bitStore bitStore) {
        try {
            bitStore bitStoreNew = getOneById(bitStore.getId());

            if (bitStoreNew == null) {
                return false;
            }

            UserInfo userInfo = (UserInfo) SecurityUtils.getSubject().getPrincipal();

            return bitStoreMapper.updateByPrimaryKey(bitStore) == 1;
        } catch (Exception ex) {
            logger.error("Update Error: " + ex.getMessage());
            return false;
        }
    }

    @Override
    @Transactional
    public boolean delete(String ids) {
        String [] arrIds = ids.split(",");
        boolean bret = true;
        for (String idTmp : arrIds) {

            Long id = null;

            try {
            } catch (Exception ex) {
                throw new RuntimeException("delete faild");
            }

            bret = bitStoreMapper.deleteByPrimaryKey(id) == 1;
            if (!bret) {
                throw new RuntimeException("delete faild");
            }
        }

        return bret;
    }

    @Override
    public boolean Insert(bitStore bitStore) {
      try {
            UserInfo userInfo = (UserInfo) SecurityUtils.getSubject().getPrincipal();

            return bitStoreMapper.insert(bitStore) == 1;
        } catch (Exception ex) {
            logger.error("Insert Error: " + ex.getMessage());
            return false;
        }
    }
}
