package com.bqjr.conf;

import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.stereotype.Component;

/**
 * 消息处理接口的实现
 */
@Component
public class MessageProcessorImplTest implements MessageProcessor {
    @Override
    public boolean handleMessage(MessageExt messageExt) {
        System.out.println("receive : " + messageExt.toString());
        return true;
    }
}
