package cn.ac.sec.mapper.system;

import cn.ac.sec.domain.system.SysUser;
import java.util.List;

public interface  {
    int deleteByPrimaryKey(Integer userId);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Integer userId);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}