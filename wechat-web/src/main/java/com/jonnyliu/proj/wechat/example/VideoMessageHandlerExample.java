package com.jonnyliu.proj.wechat.example;

import com.jonnyliu.proj.wechat.annotation.MessageProcessor;
import com.jonnyliu.proj.wechat.enums.MessageType;
import com.jonnyliu.proj.wechat.handler.AbstractMessageHandler;
import com.jonnyliu.proj.wechat.pojo.message.request.BaseRequestMessage;
import com.jonnyliu.proj.wechat.pojo.message.request.VideoRequestMessage;
import com.jonnyliu.proj.wechat.pojo.message.response.BaseResponseMessage;
import com.jonnyliu.proj.wechat.utils.MessageUtils;
import org.springframework.stereotype.Component;

/**
 * 图片消息接收和响应的code com.jonnyliu.proj.wechat.example
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-08-19 11:42.
 */
@Component
@MessageProcessor(messageType = MessageType.VIDEO_MESSAGE)
public class VideoMessageHandlerExample extends AbstractMessageHandler {
    @Override
    public BaseResponseMessage doHandleMessage(BaseRequestMessage baseRequestMessage) {
        //在这里实现你自己的业务逻辑
        VideoRequestMessage videoRequestMessage = (VideoRequestMessage) baseRequestMessage;
        String mediaId = videoRequestMessage.getMediaId();
        String thumbMediaId = videoRequestMessage.getThumbMediaId();
        String content = "您发送的视频mediaId:%s \t,ThumbMediaId:%s ";
        content = String.format(content,mediaId,thumbMediaId);
        return MessageUtils.buildTextResponseMessage(baseRequestMessage,content);
    }
}
