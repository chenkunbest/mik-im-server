package com.mikgeek.stream.mq;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author chenkunbest
 */
@Data
@Accessors(chain = true)
public class TestMessaging {
    /**
     * 消息id
     */
    private String msgId;
    /**
     * 消息内容
     */
    private String msgText;
}
