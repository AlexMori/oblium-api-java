package Oblium;

import Oblium.dto.Boxes.BoxDto;
import Oblium.dto.Cards.CardDto;
import Oblium.dto.Matches.CardMatchDto;
import Oblium.dto.Matches.MatchesDto;
import Oblium.dto.Rankings.RankingsDto;
import Oblium.dto.Users.TotalUserInfo;
import Oblium.dto.Users.UserInfo;

import java.io.IOException;
import java.util.List;

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