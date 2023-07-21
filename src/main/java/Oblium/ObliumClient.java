package Oblium;

import Oblium.api.*;
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

public class ObliumClient {

    public final Integer DEFAULT_OFFSET = 0;
    public final Integer DEFAULT_COUNT = 10;

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
    public MatchesDto getListMatches() throws IOException {
        return MatchesAPI.getListMatches();
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public List<CardMatchDto> getCardsMatch(Integer matchId) throws IOException {
        return MatchesAPI.getCardsMatch(matchId);
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
     *
     * @param userId
     * @return
     * @throws IOException
     */
    public UserInfo getUserInfo(Integer userId) throws IOException {
        return UsersAPI.getUserInfo(userId);
    }

    /**
     *
     * @param count
     * @param offset
     * @return
     */
    public List<BoxDto> getBoxesTypes(Integer offset, Integer count) throws IOException {
        return BoxAPI.getBoxesTypes(offset, count);
    }

    /**
     *
     * @param count
     * @param offset
     * @return
     */
    public List<CardDto> getCardList(Integer offset, Integer count) throws IOException {
        return CardsAPI.getCardList(offset, count);
    }


}


