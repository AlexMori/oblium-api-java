package Oblium.api;

import Oblium.dto.Rankings.RankingDto;
import Oblium.dto.Rankings.RankingsDto;
import Oblium.http.HttpRequestImp;

import java.io.IOException;
import java.util.HashMap;

public class RankingsAPI extends AbstractAPI {

    /**
     *
     * @return
     * @throws IOException
     */
    public static RankingsDto getRankings() throws IOException {
        return new RankingsDto(getDataAsList(new HttpRequestImp().Request( new HashMap<>(), "get_rankings"), RankingDto.class));
    }

}
