package com.example.medspace.Model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Details implements Serializable
{

    @SerializedName("post_count")
    @Expose
    private String postCount;
    @SerializedName("album_count")
    @Expose
    private String albumCount;
    @SerializedName("following_count")
    @Expose
    private String followingCount;
    @SerializedName("followers_count")
    @Expose
    private String followersCount;
    @SerializedName("groups_count")
    @Expose
    private String groupsCount;
    @SerializedName("likes_count")
    @Expose
    private String likesCount;
    @SerializedName("mutual_friends_count")
    @Expose
    private Integer mutualFriendsCount;
    private final static long serialVersionUID = 1028491628793490154L;

    public String getPostCount() {
        return postCount;
    }

    public void setPostCount(String postCount) {
        this.postCount = postCount;
    }

    public String getAlbumCount() {
        return albumCount;
    }

    public void setAlbumCount(String albumCount) {
        this.albumCount = albumCount;
    }

    public String getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(String followingCount) {
        this.followingCount = followingCount;
    }

    public String getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(String followersCount) {
        this.followersCount = followersCount;
    }

    public String getGroupsCount() {
        return groupsCount;
    }

    public void setGroupsCount(String groupsCount) {
        this.groupsCount = groupsCount;
    }

    public String getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
    }

    public Integer getMutualFriendsCount() {
        return mutualFriendsCount;
    }

    public void setMutualFriendsCount(Integer mutualFriendsCount) {
        this.mutualFriendsCount = mutualFriendsCount;
    }

}
