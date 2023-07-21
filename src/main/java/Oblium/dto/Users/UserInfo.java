package Oblium.dto.Users;

/**
 * MIT License
 * <p>
 * Copyright (c) 2023 Alex Canton
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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