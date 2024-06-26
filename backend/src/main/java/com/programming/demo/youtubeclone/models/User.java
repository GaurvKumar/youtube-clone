package com.programming.demo.youtubeclone.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "User")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String picture;
    private String emailAddress;
    private String sub;
    private Set<String> subscribedToUser = new HashSet<>();
    private Set<String> subscribers = new HashSet<>();
    private Set<String> videoHistory = new LinkedHashSet<>();
    private Set<String> likedVideos = new HashSet<>();
    private Set<String> disLikedVideos = new HashSet<>();

    public void addToLikedVideos(String videoId){
        likedVideos.add(videoId);
    }

    public void removeFromLikedVideos(String videoId){
        likedVideos.remove(videoId);
    }

    public void addToDisLikedVideo(String videoId){
        disLikedVideos.add(videoId);
    }

    public void removeFromDisLikedVideo(String videoId){
        disLikedVideos.remove(videoId);
    }

    public void addToVideoHistory(String videoId){
        videoHistory.add(videoId);
    }

    public void addToSubscribedUsers(String userId){
        subscribedToUser.add(userId);
    }

    public void addToSubscribers(String userId){
        subscribers.add(userId);
    }
}
