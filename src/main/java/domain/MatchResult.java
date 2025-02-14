package domain;

import java.util.List;

public class MatchResult {

    private final List<MatchStatus> matchStatusList;

    public MatchResult(List<MatchStatus> matchStatusList) {
        this.matchStatusList = matchStatusList;
    }

    public boolean isCorrect() {
        return !(matchStatusList.contains(MatchStatus.YELLOW) || matchStatusList.contains(MatchStatus.GREY));
    }

    public List<MatchStatus> getMatchStatusList() {
        return matchStatusList;
    }

    @Override
    public String toString() {
        return "MatchResult{" +
                "matchStatusList=" + matchStatusList +
                '}';
    }
}
