package Oblium.dto.Matches;


public class ParticipantDto {

    private String id;
    private String player1ID;
    private String player2ID;
    private String player1PrevRating;
    private String player2PrevRating;
    private String player1NewRating;
    private String player2NewRating;
    private String result;
    private String end_time;
    private String duration;
    private String turn;
    private String reason;

    public ParticipantDto() { }

    public String getId() {
        return id;
    }

    public String getPlayer1ID() {
        return player1ID;
    }

    public String getPlayer2ID() {
        return player2ID;
    }

    public String getPlayer1PrevRating() {
        return player1PrevRating;
    }

    public String getPlayer2PrevRating() {
        return player2PrevRating;
    }

    public String getPlayer1NewRating() {
        return player1NewRating;
    }

    public String getPlayer2NewRating() {
        return player2NewRating;
    }

    public String getResult() {
        return result;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getDuration() {
        return duration;
    }

    public String getTurn() {
        return turn;
    }

    public String getReason() {
        return reason;
    }
}
