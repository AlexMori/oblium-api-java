# oblium-api-java
Java client for the oblium TCG API

## Table of Contents
1. **[Examples](#Examples)**
2. **[Todo-List](#Todo)**

##Examples
```Java

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
```
#Todo
- [x] First commit
- [ ] Build all requests
- [ ] Write all the documentation
- [ ] Maven repository
