# oblium-api-java
This is a Java wrapper/client for the [Oblium TCG API](https://www.postman.com/telecoms-saganist-93127602/workspace/oblium-api-public/collection/24236476-7e903d99-000f-4cc1-a132-f669cd82a5e2)

## Examples
```Java

public class Example {

    public static void main (String[] args) throws IOException {

        String userObliumAPIKey = args[0];

        if (userObliumAPIKey.isEmpty())
            return;

        ObliumClient obliumClient = new ObliumClient(userObliumAPIKey);

        UserInfo userInfo =  obliumClient.getUserInfo(1);
        TotalUserInfo totalUserInfo = obliumClient.getTotalUserInfo();
        RankingsDto rankingsDto = obliumClient.getRankings();
        MatchesDto matchesDto = obliumClient.getListMatches();

        List<CardMatchDto> cardsMatch = obliumClient.getCardsMatch(1);
        List<BoxDto> boxesList = obliumClient.getBoxesTypes(obliumClient.DEFAULT_OFFSET, obliumClient.DEFAULT_COUNT);
        List<CardDto> cardList = obliumClient.getCardList(obliumClient.DEFAULT_OFFSET, obliumClient.DEFAULT_COUNT);

        System.out.println(totalUserInfo);
        System.out.println(userInfo);
        System.out.println(rankingsDto.toString());

        cardsMatch.forEach(System.out::println);
        boxesList.forEach(System.out::println);
        cardList.forEach(System.out::println);


    }
}
```
## Todo
- [x] First commit
- [ ] Build all requests
- [ ] Write all the documentation
- [ ] Maven repository
