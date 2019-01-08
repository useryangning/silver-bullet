package com.silverbullet.specialcloudstore.controller;

import com.silverbullet.specialcloudstore.domain.bitStore;
import com.silverbullet.specialcloudstore.service.IbitStoreService;
import com.silverbullet.utils.BaseDataResult;
import com.silverbullet.core.validate.AddValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

/**
 * 比特能管道管理 控制器
 * Created by jeffyuan on 2018/2/11.
 */
@Controller
@RequestMapping(value = "/specialcloudstore/bitstore")
public class bitStoreController {

    @Autowired
    private IbitStoreService bitStoreService;

    @RequestMapping(value = "/list/pub.html", method = RequestMethod.GET)
    public ModelAndView index(){
        int nCurPage = 1;

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/bitStore/list");

        BaseDataResult<bitStore> results = bitStoreService.list(nCurPage, 5);

        modelAndView.addObject("results", results);
        modelAndView.addObject("curPage", nCurPage);

        return modelAndView;
    }

    @RequestMapping(value = "/list.html", method = RequestMethod.POST)
    public ModelAndView listData(String curpage){
        int nCurPage = 1;
        if (curpage != null) {
            nCurPage = Integer.valueOf(curpage);
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/bitStore/listContent");

        BaseDataResult<bitStore> results = bitStoreService.list(nCurPage, 5);

        modelAndView.addObject("results", results);
        modelAndView.addObject("curPage", nCurPage);

        return modelAndView;
     }

    @RequestMapping(value = "/add.html", method = RequestMethod.POST)
    public String add(Model model) {
        return "/bitStore/model";
    }

    @RequestMapping(value = "/edit.html", method = RequestMethod.POST)
    public String edit(Model model, Long id) {
        bitStore bitStore = bitStoreService.getOneById(id);
        model.addAttribute("obj", bitStore);

        return "/bitStore/model";
    }

    @RequestMapping(value = "/delete.do", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> delete(String ids) {
        Map<String,Object> mapRet = new HashMap<String, Object>();
        if (ids == null || ids.isEmpty()) {
            mapRet.put("result", false);
            return mapRet;
        }

        boolean bRet = bitStoreService.delete(ids);

        mapRet.put("result", bRet);
        return mapRet;
    }

    @RequestMapping(value = "/save.do", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> save(@Validated({AddValidate.class}) bitStore bitStore,
                                    BindingResult result) {
        Map<String,Object> mapRet = new HashMap<String, Object>();
        if (result.hasErrors()) {
            mapRet.put("result", false);
            mapRet.put("errors", result.getFieldErrors());
            return mapRet;
        }

        boolean bTrue = false;
        String message = "";
        if (bitStore.getId() == null) {
            bTrue = bitStoreService.Insert(bitStore);
            message = bTrue ? "添加成功！" : "添加失败！";
        } else {
            bTrue = bitStoreService.Update(bitStore);
            message = bTrue ? "修改成功！" : "修改失败！";
        }

        mapRet.put("result", bTrue);
        mapRet.put("message", message);

        return mapRet;
    }
}
