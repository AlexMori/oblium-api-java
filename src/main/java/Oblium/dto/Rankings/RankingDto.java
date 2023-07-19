package Oblium.dto.Rankings;

public class RankingDto {

    public String id;
    public String user_id;
    public String experience;
    public String test_account;
    public String energy;
    public String gold;
    public String oblium;
    public String rating;
    public String champion_token;
    public String deck_id;
    public String champion_id;
    public String weapon_id;
    public String rank;

    public RankingDto() {}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getTest_account() {
        return test_account;
    }

    public void setTest_account(String test_account) {
        this.test_account = test_account;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getOblium() {
        return oblium;
    }

    public void setOblium(String oblium) {
        this.oblium = oblium;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getChampion_token() {
        return champion_token;
    }

    public void setChampion_token(String champion_token) {
        this.champion_token = champion_token;
    }

    public String getDeck_id() {
        return deck_id;
    }

    public void setDeck_id(String deck_id) {
        this.deck_id = deck_id;
    }

    public String getChampion_id() {
        return champion_id;
    }

    public void setChampion_id(String champion_id) {
        this.champion_id = champion_id;
    }

    public String getWeapon_id() {
        return weapon_id;
    }

    public void setWeapon_id(String weapon_id) {
        this.weapon_id = weapon_id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "RankingDto{" +
                "id='" + id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", experience='" + experience + '\'' +
                ", test_account='" + test_account + '\'' +
                ", energy='" + energy + '\'' +
                ", gold='" + gold + '\'' +
                ", oblium='" + oblium + '\'' +
                ", rating='" + rating + '\'' +
                ", champion_token='" + champion_token + '\'' +
                ", deck_id='" + deck_id + '\'' +
                ", champion_id='" + champion_id + '\'' +
                ", weapon_id='" + weapon_id + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

}
