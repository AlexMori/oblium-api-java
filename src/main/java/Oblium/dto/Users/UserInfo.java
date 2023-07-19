package Oblium.dto.Users;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UserInfo {

    private String id;
    private String steamid;
    private String username;
    private String regdate;
    private String logdate;
    private String user_id;
    private String experience;
    private String test_account;
    private String energy;
    private String gold;
    private String oblium;
    private String rating;
    private String champion_token;
    private String deck_id;
    private String champion_id;
    private String weapon_id;
    private String last_match_date;
    private String total_matches;
    private String total_wins;
    private Integer winrate;

    public UserInfo() {}

    public UserInfo(InputStream json) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        UserInfo user = objectMapper.readValue(json, UserInfo.class);

        this.id = user.getId();
        this.steamid = user.getSteamid();
        this.username = user.getUsername();
        this.regdate = user.getRegdate();
        this.logdate = user.getLogdate();
        this.user_id = user.getUser_id();
        this.experience = user.getExperience();
        this.test_account = user.getTest_account();
        this.energy = user.getEnergy();
        this.gold = user.getGold();
        this.oblium = user.getOblium();
        this.rating = user.getRating();
        this.champion_token = user.getChampion_token();
        this.deck_id = user.getDeck_id();
        this.champion_id = user.getChampion_id();
        this.weapon_id = user.getWeapon_id();
        this.last_match_date = user.getLast_match_date();
        this.total_matches = user.getTotal_matches();
        this.total_wins = user.getTotal_wins();
        this.winrate = user.getWinrate();
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", steamid='" + steamid + '\'' +
                ", username='" + username + '\'' +
                ", regdate='" + regdate + '\'' +
                ", logdate='" + logdate + '\'' +
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
                ", last_match_date='" + last_match_date + '\'' +
                ", total_matches='" + total_matches + '\'' +
                ", total_wins='" + total_wins + '\'' +
                ", winrate=" + winrate +
                '}';
    }

    public String getSteamid() {
        return steamid;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getRegdate() {
        return regdate;
    }

    public String getLogdate() {
        return logdate;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getExperience() {
        return experience;
    }

    public String getTest_account() {
        return test_account;
    }

    public String getEnergy() {
        return energy;
    }

    public String getGold() {
        return gold;
    }

    public String getOblium() {
        return oblium;
    }

    public String getRating() {
        return rating;
    }

    public String getChampion_token() {
        return champion_token;
    }

    public String getDeck_id() {
        return deck_id;
    }

    public String getChampion_id() {
        return champion_id;
    }

    public String getWeapon_id() {
        return weapon_id;
    }

    public String getLast_match_date() {
        return last_match_date;
    }

    public String getTotal_matches() {
        return total_matches;
    }

    public String getTotal_wins() {
        return total_wins;
    }

    public Integer getWinrate() {
        return winrate;
    }
}