package priv.geekjoker.joy.blog.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class User {
    private Long id;
    private Date createTime;
    private Date updateTime;
    private String nickname;
    private String password;
    private Boolean role;

}
