package Oblium.dto.Matches;

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
