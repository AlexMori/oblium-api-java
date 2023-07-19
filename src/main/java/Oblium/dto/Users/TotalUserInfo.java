package Oblium.dto.Users;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class TotalUserInfo {

    @JsonAlias({"total_users_count"})
    private long totalUser;

    public TotalUserInfo() {}

    public TotalUserInfo(InputStream json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        TotalUserInfo totalUserInfo = objectMapper.readValue(json, TotalUserInfo.class);

        this.totalUser = totalUserInfo.getTotalUser();
    }

    public long getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(long totalUser) {
        this.totalUser = totalUser;
    }


    @Override
    public String toString() {
        return "TotalUserInfo{" +
                "totalUser=" + totalUser +
                '}';
    }
}
