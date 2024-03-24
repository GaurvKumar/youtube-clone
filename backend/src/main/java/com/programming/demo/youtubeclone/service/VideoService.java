package com.programming.demo.youtubeclone.service;

import com.programming.demo.youtubeclone.models.Video;
import com.programming.demo.youtubeclone.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final S3Service s3Service;
    private final VideoRepository videoRepository;
    //private final UserService userService;

    public void uploadVideo(MultipartFile multipartFile){
        String videoUrl = s3Service.uploadFile(multipartFile);
        var video = new Video();
        video.setUrl(videoUrl);

        videoRepository.save(video);
    }
}
