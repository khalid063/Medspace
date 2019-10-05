package com.example.medspace.Model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserData implements Serializable
{

    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("background_image")
    @Expose
    private String backgroundImage;
    @SerializedName("relationship_id")
    @Expose
    private String relationshipId;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("working")
    @Expose
    private String working;
    @SerializedName("working_link")
    @Expose
    private String workingLink;
    @SerializedName("about")
    @Expose
    private Object about;
    @SerializedName("school")
    @Expose
    private String school;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("country_id")
    @Expose
    private String countryId;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("facebook")
    @Expose
    private String facebook;
    @SerializedName("google")
    @Expose
    private String google;
    @SerializedName("twitter")
    @Expose
    private String twitter;
    @SerializedName("linkedin")
    @Expose
    private String linkedin;
    @SerializedName("youtube")
    @Expose
    private String youtube;
    @SerializedName("vk")
    @Expose
    private String vk;
    @SerializedName("instagram")
    @Expose
    private String instagram;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("ip_address")
    @Expose
    private String ipAddress;
    @SerializedName("follow_privacy")
    @Expose
    private String followPrivacy;
    @SerializedName("friend_privacy")
    @Expose
    private String friendPrivacy;
    @SerializedName("post_privacy")
    @Expose
    private String postPrivacy;
    @SerializedName("message_privacy")
    @Expose
    private String messagePrivacy;
    @SerializedName("confirm_followers")
    @Expose
    private String confirmFollowers;
    @SerializedName("show_activities_privacy")
    @Expose
    private String showActivitiesPrivacy;
    @SerializedName("birth_privacy")
    @Expose
    private String birthPrivacy;
    @SerializedName("visit_privacy")
    @Expose
    private String visitPrivacy;
    @SerializedName("verified")
    @Expose
    private String verified;
    @SerializedName("lastseen")
    @Expose
    private String lastseen;
    @SerializedName("emailNotification")
    @Expose
    private String emailNotification;
    @SerializedName("e_liked")
    @Expose
    private String eLiked;
    @SerializedName("e_wondered")
    @Expose
    private String eWondered;
    @SerializedName("e_shared")
    @Expose
    private String eShared;
    @SerializedName("e_followed")
    @Expose
    private String eFollowed;
    @SerializedName("e_commented")
    @Expose
    private String eCommented;
    @SerializedName("e_visited")
    @Expose
    private String eVisited;
    @SerializedName("e_liked_page")
    @Expose
    private String eLikedPage;
    @SerializedName("e_mentioned")
    @Expose
    private String eMentioned;
    @SerializedName("e_joined_group")
    @Expose
    private String eJoinedGroup;
    @SerializedName("e_accepted")
    @Expose
    private String eAccepted;
    @SerializedName("e_profile_wall_post")
    @Expose
    private String eProfileWallPost;
    @SerializedName("e_sentme_msg")
    @Expose
    private String eSentmeMsg;
    @SerializedName("e_last_notif")
    @Expose
    private String eLastNotif;
    @SerializedName("notification_settings")
    @Expose
    private String notificationSettings;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("admin")
    @Expose
    private String admin;
    @SerializedName("registered")
    @Expose
    private String registered;
    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("is_pro")
    @Expose
    private String isPro;
    @SerializedName("pro_type")
    @Expose
    private String proType;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("referrer")
    @Expose
    private String referrer;
    @SerializedName("balance")
    @Expose
    private String balance;
    @SerializedName("paypal_email")
    @Expose
    private String paypalEmail;
    @SerializedName("notifications_sound")
    @Expose
    private String notificationsSound;
    @SerializedName("order_posts_by")
    @Expose
    private String orderPostsBy;
    @SerializedName("device_id")
    @Expose
    private String deviceId;
    @SerializedName("web_device_id")
    @Expose
    private String webDeviceId;
    @SerializedName("wallet")
    @Expose
    private String wallet;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("last_location_update")
    @Expose
    private String lastLocationUpdate;
    @SerializedName("share_my_location")
    @Expose
    private String shareMyLocation;
    @SerializedName("last_data_update")
    @Expose
    private String lastDataUpdate;
    @SerializedName("details")
    @Expose
    private Details details;
    @SerializedName("last_avatar_mod")
    @Expose
    private String lastAvatarMod;
    @SerializedName("last_cover_mod")
    @Expose
    private String lastCoverMod;
    @SerializedName("points")
    @Expose
    private String points;
    @SerializedName("last_follow_id")
    @Expose
    private String lastFollowId;
    @SerializedName("share_my_data")
    @Expose
    private String shareMyData;
    @SerializedName("last_login_data")
    @Expose
    private Object lastLoginData;
    @SerializedName("two_factor")
    @Expose
    private String twoFactor;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("mutual_friends_data")
    @Expose
    private String mutualFriendsData;
    @SerializedName("lastseen_unix_time")
    @Expose
    private String lastseenUnixTime;
    @SerializedName("lastseen_status")
    @Expose
    private String lastseenStatus;
    @SerializedName("is_following")
    @Expose
    private Integer isFollowing;
    @SerializedName("can_follow")
    @Expose
    private Integer canFollow;
    @SerializedName("is_following_me")
    @Expose
    private Integer isFollowingMe;
    @SerializedName("gender_text")
    @Expose
    private String genderText;
    @SerializedName("lastseen_time_text")
    @Expose
    private String lastseenTimeText;
    @SerializedName("is_blocked")
    @Expose
    private Boolean isBlocked;
    private final static long serialVersionUID = 6639420457648124012L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public String getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(String relationshipId) {
        this.relationshipId = relationshipId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public String getWorkingLink() {
        return workingLink;
    }

    public void setWorkingLink(String workingLink) {
        this.workingLink = workingLink;
    }

    public Object getAbout() {
        return about;
    }

    public void setAbout(Object about) {
        this.about = about;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getVk() {
        return vk;
    }

    public void setVk(String vk) {
        this.vk = vk;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getFollowPrivacy() {
        return followPrivacy;
    }

    public void setFollowPrivacy(String followPrivacy) {
        this.followPrivacy = followPrivacy;
    }

    public String getFriendPrivacy() {
        return friendPrivacy;
    }

    public void setFriendPrivacy(String friendPrivacy) {
        this.friendPrivacy = friendPrivacy;
    }

    public String getPostPrivacy() {
        return postPrivacy;
    }

    public void setPostPrivacy(String postPrivacy) {
        this.postPrivacy = postPrivacy;
    }

    public String getMessagePrivacy() {
        return messagePrivacy;
    }

    public void setMessagePrivacy(String messagePrivacy) {
        this.messagePrivacy = messagePrivacy;
    }

    public String getConfirmFollowers() {
        return confirmFollowers;
    }

    public void setConfirmFollowers(String confirmFollowers) {
        this.confirmFollowers = confirmFollowers;
    }

    public String getShowActivitiesPrivacy() {
        return showActivitiesPrivacy;
    }

    public void setShowActivitiesPrivacy(String showActivitiesPrivacy) {
        this.showActivitiesPrivacy = showActivitiesPrivacy;
    }

    public String getBirthPrivacy() {
        return birthPrivacy;
    }

    public void setBirthPrivacy(String birthPrivacy) {
        this.birthPrivacy = birthPrivacy;
    }

    public String getVisitPrivacy() {
        return visitPrivacy;
    }

    public void setVisitPrivacy(String visitPrivacy) {
        this.visitPrivacy = visitPrivacy;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public String getLastseen() {
        return lastseen;
    }

    public void setLastseen(String lastseen) {
        this.lastseen = lastseen;
    }

    public String getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(String emailNotification) {
        this.emailNotification = emailNotification;
    }

    public String getELiked() {
        return eLiked;
    }

    public void setELiked(String eLiked) {
        this.eLiked = eLiked;
    }

    public String getEWondered() {
        return eWondered;
    }

    public void setEWondered(String eWondered) {
        this.eWondered = eWondered;
    }

    public String getEShared() {
        return eShared;
    }

    public void setEShared(String eShared) {
        this.eShared = eShared;
    }

    public String getEFollowed() {
        return eFollowed;
    }

    public void setEFollowed(String eFollowed) {
        this.eFollowed = eFollowed;
    }

    public String getECommented() {
        return eCommented;
    }

    public void setECommented(String eCommented) {
        this.eCommented = eCommented;
    }

    public String getEVisited() {
        return eVisited;
    }

    public void setEVisited(String eVisited) {
        this.eVisited = eVisited;
    }

    public String getELikedPage() {
        return eLikedPage;
    }

    public void setELikedPage(String eLikedPage) {
        this.eLikedPage = eLikedPage;
    }

    public String getEMentioned() {
        return eMentioned;
    }

    public void setEMentioned(String eMentioned) {
        this.eMentioned = eMentioned;
    }

    public String getEJoinedGroup() {
        return eJoinedGroup;
    }

    public void setEJoinedGroup(String eJoinedGroup) {
        this.eJoinedGroup = eJoinedGroup;
    }

    public String getEAccepted() {
        return eAccepted;
    }

    public void setEAccepted(String eAccepted) {
        this.eAccepted = eAccepted;
    }

    public String getEProfileWallPost() {
        return eProfileWallPost;
    }

    public void setEProfileWallPost(String eProfileWallPost) {
        this.eProfileWallPost = eProfileWallPost;
    }

    public String getESentmeMsg() {
        return eSentmeMsg;
    }

    public void setESentmeMsg(String eSentmeMsg) {
        this.eSentmeMsg = eSentmeMsg;
    }

    public String getELastNotif() {
        return eLastNotif;
    }

    public void setELastNotif(String eLastNotif) {
        this.eLastNotif = eLastNotif;
    }

    public String getNotificationSettings() {
        return notificationSettings;
    }

    public void setNotificationSettings(String notificationSettings) {
        this.notificationSettings = notificationSettings;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIsPro() {
        return isPro;
    }

    public void setIsPro(String isPro) {
        this.isPro = isPro;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getPaypalEmail() {
        return paypalEmail;
    }

    public void setPaypalEmail(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    public String getNotificationsSound() {
        return notificationsSound;
    }

    public void setNotificationsSound(String notificationsSound) {
        this.notificationsSound = notificationsSound;
    }

    public String getOrderPostsBy() {
        return orderPostsBy;
    }

    public void setOrderPostsBy(String orderPostsBy) {
        this.orderPostsBy = orderPostsBy;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getWebDeviceId() {
        return webDeviceId;
    }

    public void setWebDeviceId(String webDeviceId) {
        this.webDeviceId = webDeviceId;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLastLocationUpdate() {
        return lastLocationUpdate;
    }

    public void setLastLocationUpdate(String lastLocationUpdate) {
        this.lastLocationUpdate = lastLocationUpdate;
    }

    public String getShareMyLocation() {
        return shareMyLocation;
    }

    public void setShareMyLocation(String shareMyLocation) {
        this.shareMyLocation = shareMyLocation;
    }

    public String getLastDataUpdate() {
        return lastDataUpdate;
    }

    public void setLastDataUpdate(String lastDataUpdate) {
        this.lastDataUpdate = lastDataUpdate;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public String getLastAvatarMod() {
        return lastAvatarMod;
    }

    public void setLastAvatarMod(String lastAvatarMod) {
        this.lastAvatarMod = lastAvatarMod;
    }

    public String getLastCoverMod() {
        return lastCoverMod;
    }

    public void setLastCoverMod(String lastCoverMod) {
        this.lastCoverMod = lastCoverMod;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getLastFollowId() {
        return lastFollowId;
    }

    public void setLastFollowId(String lastFollowId) {
        this.lastFollowId = lastFollowId;
    }

    public String getShareMyData() {
        return shareMyData;
    }

    public void setShareMyData(String shareMyData) {
        this.shareMyData = shareMyData;
    }

    public Object getLastLoginData() {
        return lastLoginData;
    }

    public void setLastLoginData(Object lastLoginData) {
        this.lastLoginData = lastLoginData;
    }

    public String getTwoFactor() {
        return twoFactor;
    }

    public void setTwoFactor(String twoFactor) {
        this.twoFactor = twoFactor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMutualFriendsData() {
        return mutualFriendsData;
    }

    public void setMutualFriendsData(String mutualFriendsData) {
        this.mutualFriendsData = mutualFriendsData;
    }

    public String getLastseenUnixTime() {
        return lastseenUnixTime;
    }

    public void setLastseenUnixTime(String lastseenUnixTime) {
        this.lastseenUnixTime = lastseenUnixTime;
    }

    public String getLastseenStatus() {
        return lastseenStatus;
    }

    public void setLastseenStatus(String lastseenStatus) {
        this.lastseenStatus = lastseenStatus;
    }

    public Integer getIsFollowing() {
        return isFollowing;
    }

    public void setIsFollowing(Integer isFollowing) {
        this.isFollowing = isFollowing;
    }

    public Integer getCanFollow() {
        return canFollow;
    }

    public void setCanFollow(Integer canFollow) {
        this.canFollow = canFollow;
    }

    public Integer getIsFollowingMe() {
        return isFollowingMe;
    }

    public void setIsFollowingMe(Integer isFollowingMe) {
        this.isFollowingMe = isFollowingMe;
    }

    public String getGenderText() {
        return genderText;
    }

    public void setGenderText(String genderText) {
        this.genderText = genderText;
    }

    public String getLastseenTimeText() {
        return lastseenTimeText;
    }

    public void setLastseenTimeText(String lastseenTimeText) {
        this.lastseenTimeText = lastseenTimeText;
    }

    public Boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

}

