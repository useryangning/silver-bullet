package com.silverbullet.auth.domain;

import com.silverbullet.core.validate.AddValidate;
import com.silverbullet.core.validate.FullValidate;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

public class SysAuthActionTree {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.name
     *
     * @mbggenerated
     */
    @NotBlank(message = "不能为空", groups = {FullValidate.class, AddValidate.class})
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.sort
     *
     * @mbggenerated
     */
    private Integer sort;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.parent_id
     *
     * @mbggenerated
     */
    private String parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.path
     *
     * @mbggenerated
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.comments
     *
     * @mbggenerated
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.type
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.modify_user
     *
     * @mbggenerated
     */
    private String modifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.state
     *
     * @mbggenerated
     */
    private String state = "1";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.action_id
     *
     * @mbggenerated
     */
    private String actionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.domain
     *
     * @mbggenerated
     */
    private String domain = "back";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.icon
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_actiontree.params
     *
     * @mbggenerated
     */
    private String params;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.id
     *
     * @return the value of sys_auth_actiontree.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.id
     *
     * @param id the value for sys_auth_actiontree.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.name
     *
     * @return the value of sys_auth_actiontree.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.name
     *
     * @param name the value for sys_auth_actiontree.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.sort
     *
     * @return the value of sys_auth_actiontree.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.sort
     *
     * @param sort the value for sys_auth_actiontree.sort
     *
     * @mbggenerated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.parent_id
     *
     * @return the value of sys_auth_actiontree.parent_id
     *
     * @mbggenerated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.parent_id
     *
     * @param parentId the value for sys_auth_actiontree.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.path
     *
     * @return the value of sys_auth_actiontree.path
     *
     * @mbggenerated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.path
     *
     * @param path the value for sys_auth_actiontree.pathpath
     *
     * @mbggenerated
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.comments
     *
     * @return the value of sys_auth_actiontree.comments
     *
     * @mbggenerated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.comments
     *
     * @param comments the value for sys_auth_actiontree.comments
     *
     * @mbggenerated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.type
     *
     * @return the value of sys_auth_actiontree.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.type
     *
     * @param type the value for sys_auth_actiontree.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.create_user
     *
     * @return the value of sys_auth_actiontree.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.create_user
     *
     * @param createUser the value for sys_auth_actiontree.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.create_time
     *
     * @return the value of sys_auth_actiontree.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.create_time
     *
     * @param createTime the value for sys_auth_actiontree.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.modify_user
     *
     * @return the value of sys_auth_actiontree.modify_user
     *
     * @mbggenerated
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.modify_user
     *
     * @param modifyUser the value for sys_auth_actiontree.modify_user
     *
     * @mbggenerated
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.modify_time
     *
     * @return the value of sys_auth_actiontree.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.modify_time
     *
     * @param modifyTime the value for sys_auth_actiontree.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.state
     *
     * @return the value of sys_auth_actiontree.state
     *
     * @mbggenerated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.state
     *
     * @param state the value for sys_auth_actiontree.state
     *
     * @mbggenerated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.action_id
     *
     * @return the value of sys_auth_actiontree.action_id
     *
     * @mbggenerated
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.action_id
     *
     * @param actionId the value for sys_auth_actiontree.action_id
     *
     * @mbggenerated
     */
    public void setActionId(String actionId) {
        this.actionId = actionId == null ? null : actionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.domain
     *
     * @return the value of sys_auth_actiontree.domain
     *
     * @mbggenerated
     */
    public String getDomain() {
        return domain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.domain
     *
     * @param domain the value for sys_auth_actiontree.domain
     *
     * @mbggenerated
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.icon
     *
     * @return the value of sys_auth_actiontree.icon
     *
     * @mbggenerated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.icon
     *
     * @param icon the value for sys_auth_actiontree.icon
     *
     * @mbggenerated
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_actiontree.params
     *
     * @return the value of sys_auth_actiontree.params
     *
     * @mbggenerated
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_actiontree.params
     *
     * @param params the value for sys_auth_actiontree.params
     *
     * @mbggenerated
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }
}