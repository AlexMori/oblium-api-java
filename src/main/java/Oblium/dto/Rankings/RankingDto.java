package Oblium.dto.Rankings;

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

public class RankingDto {

    public String id;
    public String user_id;
    public String experience;
    public String test_account;
    public String energy;
    public String gold;
    public String oblium;
    public String rating;
    public String champion_token;
    public String deck_id;
    public String champion_id;
    public String weapon_id;
    public String rank;

    public RankingDto() {}

    @Override
    public String toString() {
        return "RankingDto{" +
                "id='" + id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", experience='" + experience + '\'' +
                ", test_account='" + test_account + '\'' +
                ", energy='" + energy + '\'' +
                ", gold='" + gold + '\'' +
                ", oblium='" + oblium + '\'' +
                ", rating='" + rating + '\'' +
                ", champion_token='" + champion_token + '\'' +
                ", deck_id='" + deck_id + '\'' +
                ", champion_id='" + champion_id + '\'' +
                ", weapon_id='" + weapon_id + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

}
