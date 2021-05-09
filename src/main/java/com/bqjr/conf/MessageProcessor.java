package com.bqjr.conf;

import org.apache.rocketmq.common.message.MessageExt;

/**
 * 消息处理器接口
 */
public interface MessageProcessor {

    /**
     * 处理消息的接口
     * @param messageExt
     * @return
     */
    boolean handleMessage(MessageExt messageExt);
}
