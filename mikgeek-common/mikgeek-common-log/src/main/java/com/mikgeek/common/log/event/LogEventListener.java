package com.mikgeek.common.log.event;

import com.mikgeek.common.core.utils.BeanCopyUtils;
import com.mikgeek.system.api.RemoteLogService;
import com.mikgeek.system.api.domain.SysLogininfor;
import com.mikgeek.system.api.domain.SysOperLog;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 异步调用日志服务
 *
 * @author mikgeek
 */
@Component
public class LogEventListener {

    @DubboReference
    private RemoteLogService remoteLogService;

    /**
     * 保存系统日志记录
     */
    @Async
    @EventListener
    public void saveLog(OperLogEvent operLogEvent) {
        SysOperLog sysOperLog = BeanCopyUtils.copy(operLogEvent, SysOperLog.class);
        remoteLogService.saveLog(sysOperLog);
    }

    @Async
    @EventListener
    public void saveLogininfor(LogininforEvent logininforEvent) {
        SysLogininfor sysLogininfor = BeanCopyUtils.copy(logininforEvent, SysLogininfor.class);
        remoteLogService.saveLogininfor(sysLogininfor);
    }

}