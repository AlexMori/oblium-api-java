package Oblium;

import Oblium.api.RankingsAPI;
import Oblium.api.UsersAPI;
import Oblium.dto.Rankings.RankingsDto;
import Oblium.dto.Users.TotalUserInfo;
import Oblium.dto.Users.UserInfo;

import java.io.IOException;

public class ObliumClient {

    private static String obliumAPIKey;

    public ObliumClient(String apiKey)
    {
        setOblilumAPIKey(apiKey);
    }

    public static String getOblilumAPIKey() {
        return obliumAPIKey;
    }

    public static void setOblilumAPIKey(String oblilumAPIKey) {
        ObliumClient.obliumAPIKey = oblilumAPIKey;
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public TotalUserInfo getTotalUserInfo() throws IOException {
        return UsersAPI.getTotalUser();
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public RankingsDto getRankings() throws IOException {
        return RankingsAPI.getRankings();
    }

    /**
     * @return Wrapper for the specified Resource as described on the official Oblium API documentation
     * @throws IOException
     */
    public UserInfo getUserInfo(Integer userId) throws IOException{
        return UsersAPI.getUserInfo(userId);
    }

}


