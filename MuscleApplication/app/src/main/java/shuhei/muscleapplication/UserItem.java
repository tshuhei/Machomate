package shuhei.muscleapplication;

public class UserItem {
    private String userType;
    private String gender;
    private String workoutExperience;
    private String height;
    private String weight;
    private String nickName;
    private String Introduction;
    private String userId;
    private String[] likedUserId;
    private String[] likeUserId;
    private String[] matchUserId;

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

    public String[] getLikedUserId() {
        return likedUserId;
    }

    public void setLikedUserId(String[] likedUserId) {
        this.likedUserId = likedUserId;
    }

    public String[] getLikeUserId() {
        return likeUserId;
    }

    public void setLikeUserId(String[] likeUserId) {
        this.likeUserId = likeUserId;
    }

    public String[] getMatchUserId() {
        return matchUserId;
    }

    public void setMatchUserId(String[] matchUserId) {
        this.matchUserId = matchUserId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
