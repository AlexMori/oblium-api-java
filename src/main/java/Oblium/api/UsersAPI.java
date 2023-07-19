package Oblium.api;

import Oblium.dto.Users.TotalUserInfo;
import Oblium.dto.Users.UserInfo;
import Oblium.http.HttpRequestImp;

import java.io.IOException;
import java.util.HashMap;

public class UsersAPI extends AbstractAPI {

    /**
     *
     * @return
     * @throws IOException
     */
    public static TotalUserInfo getTotalUser() throws IOException {
        return getData(new HttpRequestImp().Request( new HashMap<>(), "get_users_count"), TotalUserInfo.class);
    }

    /**
     *
     * @param userId
     * @return
     * @throws IOException
     */
    public static UserInfo getUserInfo(Integer userId) throws IOException {

        HashMap<String, String> queryParameters = new HashMap<>();
        queryParameters.put("user_id", userId.toString());

        return getData(new HttpRequestImp().Request(queryParameters, "get_user"), UserInfo.class);
    }
}
