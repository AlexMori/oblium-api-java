package Oblium;

import Oblium.dto.Rankings.RankingsDto;
import Oblium.dto.Users.TotalUserInfo;
import Oblium.dto.Users.UserInfo;

import java.io.IOException;
import java.net.URISyntaxException;

public class Example {

    public static void main (String[] args) throws IOException, URISyntaxException {

        String userObliumAPIKey = args[0];

        if (userObliumAPIKey.isEmpty())
            return;

        ObliumClient obliumClient = new ObliumClient(userObliumAPIKey);

        UserInfo userInfo =  obliumClient.getUserInfo(1);
        TotalUserInfo totalUserInfo = obliumClient.getTotalUserInfo();
        RankingsDto rankingsDto = obliumClient.getRankings();

        System.out.println(totalUserInfo);
        System.out.println(userInfo);
        System.out.println(rankingsDto.toString());
    }
}