package com.silverbullet.specialcloudstore.domain;

import javax.validation.constraints.Size;
import java.util.Date;
import com.silverbullet.core.validate.AddValidate;
import java.lang.Long;
import java.lang.String;
import com.silverbullet.core.validate.FullValidate;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import com.silverbullet.core.validate.AddValidate;
import com.silverbullet.core.validate.FullValidate;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class bitStore {

    // id 
    @NotNull(message = "id 不能为空" , groups = {FullValidate.class})
    @Size(message = "id 长度不能超过9223372036854775807", groups = {FullValidate.class})
    private Long id;
    // version 
    @NotNull(message = "version 不能为空" , groups = {FullValidate.class, AddValidate.class})
    @Size(message = "version 长度不能超过9223372036854775807", groups = {FullValidate.class, AddValidate.class})
    private Long version;
    // author 
    @NotNull(message = "author 不能为空" , groups = {FullValidate.class, AddValidate.class})
    @Size( message = "author 长度不能超过9223372036854775807", groups = {FullValidate.class, AddValidate.class})
    private Long author;
    // createDate 
    
    private Date createDate;
    // remark 
    
    private String remark;
    // reportStatus 
    
    private String reportStatus;
    // storetech 
    @NotBlank(message = "storetech 不能为空" , groups = {FullValidate.class, AddValidate.class})
    @Size(max=20, message = "storetech 长度不能超过20", groups = {FullValidate.class, AddValidate.class})
    private String storetech;
    // storetype 
    @NotBlank(message = "storetype 不能为空" , groups = {FullValidate.class, AddValidate.class})
    @Size(max=100, message = "storetype 长度不能超过100", groups = {FullValidate.class, AddValidate.class})
    private String storetype;
    // storeurl 
    @NotBlank(message = "storeurl 不能为空" , groups = {FullValidate.class, AddValidate.class})
    @Size(max=200, message = "storeurl 长度不能超过200", groups = {FullValidate.class, AddValidate.class})
    private String storeurl;
    // updateDate 
    
    private Date updateDate;
    // updator 
    
    private Long updator;
    // microStoreId 
    @NotNull(message = "microStoreId 不能为空" , groups = {FullValidate.class, AddValidate.class})
    @Size(message = "microStoreId 长度不能超过9223372036854775807", groups = {FullValidate.class, AddValidate.class})
    private Long microStoreId;
    // name 
    @NotBlank(message = "name 不能为空" , groups = {FullValidate.class, AddValidate.class})
    @Size(max=255, message = "name 长度不能超过255", groups = {FullValidate.class, AddValidate.class})
    private String name;
    // storefrom 
    @NotBlank(message = "storefrom 不能为空" , groups = {FullValidate.class, AddValidate.class})
    @Size(max=255, message = "storefrom 长度不能超过255", groups = {FullValidate.class, AddValidate.class})
    private String storefrom;
    // storesource 
    @NotBlank(message = "storesource 不能为空" , groups = {FullValidate.class, AddValidate.class})
    @Size(max=255, message = "storesource 长度不能超过255", groups = {FullValidate.class, AddValidate.class})
    private String storesource;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {

        this.version = version;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {

        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {

        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {

        this.remark = remark == null ? null : remark.trim();
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {

        this.reportStatus = reportStatus == null ? null : reportStatus.trim();
    }

    public String getStoretech() {
        return storetech;
    }

    public void setStoretech(String storetech) {

        this.storetech = storetech == null ? null : storetech.trim();
    }

    public String getStoretype() {
        return storetype;
    }

    public void setStoretype(String storetype) {

        this.storetype = storetype == null ? null : storetype.trim();
    }

    public String getStoreurl() {
        return storeurl;
    }

    public void setStoreurl(String storeurl) {

        this.storeurl = storeurl == null ? null : storeurl.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {

        this.updateDate = updateDate;
    }

    public Long getUpdator() {
        return updator;
    }

    public void setUpdator(Long updator) {

        this.updator = updator;
    }

    public Long getMicroStoreId() {
        return microStoreId;
    }

    public void setMicroStoreId(Long microStoreId) {

        this.microStoreId = microStoreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name == null ? null : name.trim();
    }

    public String getStorefrom() {
        return storefrom;
    }

    public void setStorefrom(String storefrom) {

        this.storefrom = storefrom == null ? null : storefrom.trim();
    }

    public String getStoresource() {
        return storesource;
    }

    public void setStoresource(String storesource) {

        this.storesource = storesource == null ? null : storesource.trim();
    }
}