package com.mikgeek.common.translation.core.impl;

import com.mikgeek.common.translation.annotation.TranslationType;
import com.mikgeek.common.translation.constant.TransConstant;
import com.mikgeek.common.translation.core.TranslationInterface;
import com.mikgeek.resource.api.RemoteFileService;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;

/**
 * OSS翻译实现
 *
 * @author chenkunbest
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.OSS_ID_TO_URL)
public class OssUrlTranslationImpl implements TranslationInterface<String> {

    @DubboReference
    private RemoteFileService ossService;

    @Override
    public String translation(Object key, String other) {
        return ossService.selectUrlByIds(key.toString());
    }
}