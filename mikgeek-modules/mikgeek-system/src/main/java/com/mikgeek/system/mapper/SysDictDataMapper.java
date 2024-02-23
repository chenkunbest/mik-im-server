package com.mikgeek.system.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mikgeek.common.core.constant.UserConstants;
import com.mikgeek.common.mybatis.core.mapper.BaseMapperPlus;
import com.mikgeek.system.api.domain.SysDictData;

import java.util.List;

/**
 * 字典表 数据层
 *
 * @author chenkunbest
 */
public interface SysDictDataMapper extends BaseMapperPlus<SysDictDataMapper, SysDictData, SysDictData> {

    default List<SysDictData> selectDictDataByType(String dictType) {
        return selectList(
            new LambdaQueryWrapper<SysDictData>()
                .eq(SysDictData::getStatus, UserConstants.DICT_NORMAL)
                .eq(SysDictData::getDictType, dictType)
                .orderByAsc(SysDictData::getDictSort));
    }

}
