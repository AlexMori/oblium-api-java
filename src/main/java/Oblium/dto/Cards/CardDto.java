package Oblium.dto.Cards;

import Oblium.Utils.Enum.*;
import com.fasterxml.jackson.annotation.JsonAlias;

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

public class CardDto {

    public String id;
    public String ignoreCard;
    public String disabled;
    public String sprite;
    public String cost;
    public String card_name;
    public String card_name_esMX;
    public CardRarity rarity;
    public CardType card_type;
    public CardSchool school;
    @JsonAlias("class")
    public CardClass cardClass;
    public CardSpecialization specialization;
    public String description;
    public String description_esMX;
    public String winrate;
    public String matches_used;
    public String matches_won;
    public String created_date;
    public String updated_date;

    @Override
    public String toString() {
        return "CardDto{" +
                "id='" + id + '\'' +
                ", ignoreCard='" + ignoreCard + '\'' +
                ", disabled='" + disabled + '\'' +
                ", sprite='" + sprite + '\'' +
                ", cost='" + cost + '\'' +
                ", card_name='" + card_name + '\'' +
                ", card_name_esMX='" + card_name_esMX + '\'' +
                ", rarity='" + rarity + '\'' +
                ", card_type='" + card_type + '\'' +
                ", school='" + school + '\'' +
                ", cardClass='" + cardClass + '\'' +
                ", specialization='" + specialization + '\'' +
                ", description='" + description + '\'' +
                ", description_esMX='" + description_esMX + '\'' +
                ", winrate='" + winrate + '\'' +
                ", matches_used='" + matches_used + '\'' +
                ", matches_won='" + matches_won + '\'' +
                ", created_date='" + created_date + '\'' +
                ", updated_date='" + updated_date + '\'' +
                '}';
    }
}
