package com.libinyu.book.mapper;

import com.libinyu.book.pojo.Device;
import com.libinyu.book.pojo.DeviceExample;
import java.util.List;

public interface DeviceMapper {
    int deleteByPrimaryKey(Integer device_id);

    int insert(Device record);

    int insertSelective(Device record);

    List<Device> selectByExample(DeviceExample example);

    Device selectByPrimaryKey(Integer device_id);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);
}