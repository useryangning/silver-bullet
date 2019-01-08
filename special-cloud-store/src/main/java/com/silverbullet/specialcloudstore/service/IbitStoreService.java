package com.silverbullet.specialcloudstore.service;

import com.silverbullet.specialcloudstore.domain.bitStore;
import com.silverbullet.utils.BaseDataResult;


/**
 * 比特能管道管理 service接口
 * Created by jeffyuan on 2018/2/11.
 */
public interface IbitStoreService {
    public int countNum();
    public BaseDataResult<bitStore> list(int pageNum, int pageSize);
    public bitStore getOneById(Long id);
    public boolean Update(bitStore bitStore);
    public boolean delete(String ids);
    public boolean Insert(bitStore bitStore);
}
