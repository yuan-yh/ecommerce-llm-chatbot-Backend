package com.atguigu.system.mapper;

import com.atguigu.system.domain.ChatProject;

import java.util.List;

/**
 * 项目配置Mapper接口
 * 
 * @author lixianfeng
 * @date 2025-04-11
 */
public interface ChatProjectMapper 
{
    /**
     * 查询项目配置
     * 
     * @param projectId 项目配置主键
     * @return 项目配置
     */
    public ChatProject selectChatProjectByProjectId(Long projectId);

    /**
     * 查询项目配置列表
     * 
     * @param chatProject 项目配置
     * @return 项目配置集合
     */
    public List<ChatProject> selectChatProjectList(ChatProject chatProject);

    /**
     * 新增项目配置
     * 
     * @param chatProject 项目配置
     * @return 结果
     */
    public int insertChatProject(ChatProject chatProject);

    /**
     * 修改项目配置
     * 
     * @param chatProject 项目配置
     * @return 结果
     */
    public int updateChatProject(ChatProject chatProject);

    /**
     * 删除项目配置
     * 
     * @param projectId 项目配置主键
     * @return 结果
     */
    public int deleteChatProjectByProjectId(Long projectId);

    /**
     * 批量删除项目配置
     * 
     * @param projectIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChatProjectByProjectIds(Long[] projectIds);
}
