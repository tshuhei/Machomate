package shuhei.muscleapplication;

import java.util.ArrayList;
import java.util.List;

public class UserItem {
    private String userType;
    private String gender;
    private String workoutExperience;
    private String height;
    private String weight;
    private String nickName;
    private String Introduction;
    private String userId;
    private List<String> likedUserId;
    private List<String> likeUserId;
    private List<String> matchUserId;

    public UserItem(){

    }

    public UserItem(String userType, String gender, String workoutExperience,
                    String height, String weight, String nickName, String Introduction, String userId){
        this.userType = userType;
        this.gender = gender;
        this.workoutExperience = workoutExperience;
        this.height = height;
        this.weight = weight;
        this.nickName = nickName;
        this.Introduction = Introduction;
        this.userId = userId;
        likedUserId = new ArrayList<String>();
        likeUserId = new ArrayList<String>();
        matchUserId = new ArrayList<String>();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWorkoutExperience() {
        return workoutExperience;
    }

    public void setWorkoutExperience(String workoutExperience) {
        this.workoutExperience = workoutExperience;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String introduction) {
        Introduction = introduction;
    }

    public List<String> getLikedUserId() {
        return likedUserId;
    }

    public void setLikedUserId(List<String> likedUserId) {
        this.likedUserId = likedUserId;
    }

    public List<String> getLikeUserId() {
        return likeUserId;
    }

    public void setLikeUserId(List<String> likeUserId) {
        this.likeUserId = likeUserId;
    }

    public List<String> getMatchUserId() {
        return matchUserId;
    }

    public void setMatchUserId(List<String> matchUserId) {
        this.matchUserId = matchUserId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
