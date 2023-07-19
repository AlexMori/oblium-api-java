package Oblium.dto.Rankings;

import java.util.List;
import java.util.stream.Collectors;

public class RankingsDto {

    private List<RankingDto> rankingsList;

    public RankingsDto() {}

    public RankingsDto(List<RankingDto> rankingList) {
        setRankingsList(rankingList);
    }

    public List<RankingDto> getRankingsList() {
        return rankingsList;
    }

    public void setRankingsList(List<RankingDto> rankingsList) {
        this.rankingsList = rankingsList;
    }

    @Override
    public String toString() {
        return rankingsList.stream().map(Object::toString).collect(Collectors.joining(","));
    }
}
