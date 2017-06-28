package com.jonnyliu.proj.wechat.handler;


import com.jonnyliu.proj.wechat.pojo.message.request.BaseRequestMessage;
import com.jonnyliu.proj.wechat.pojo.message.response.BaseResponseMessage;


/**
 * 消息处理器接口.
 * @author jonny0525@qq.com
 */
public interface MessageHandler {


    /**
     * 处理消息的方法.
     *
     * @param baseRequestMessage 请求消息对象
     * @return 响应消息对象
     */
    BaseResponseMessage doHandleMessage(BaseRequestMessage baseRequestMessage);
}
