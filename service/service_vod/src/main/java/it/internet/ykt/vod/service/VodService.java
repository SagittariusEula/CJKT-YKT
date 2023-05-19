package it.internet.ykt.vod.service;

import com.baomidou.mybatisplus.extension.service.IService;

import java.io.InputStream;
import java.util.Map;

public interface VodService {
    //上传视频
    String uploadVideo(InputStream inputStream, String originalFilename);
    //删除视频
    void removeVideo(String videoSourceId);

    Map<String, Object> getPlayAuth(Long courseId, Long videoId);
}