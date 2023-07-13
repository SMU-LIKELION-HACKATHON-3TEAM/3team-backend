package com.grishare.dto;

import com.grishare.domain.image.BackImage;
import com.grishare.domain.image.UserImage;
import com.grishare.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserReturnDto {
    private Long id;

    private String email;
    private String userName;
    private String nickName;
    private UserImage userImg;
    private String password;
    private BackImage backgroundImg;


    // 관심 국가
    // 스크랩 게시물
    // 내가 쓴 리뷰는 따로 dto를 불러서 하는게 맞겠지?

    public UserReturnDto(User user){
        this.email = user.getEmail();
        this.nickName = user.getNickName();
        this.userImg = user.getUserImg();
        this.id =user.getId();
        this.userName = user.getUserName();
        this.backgroundImg = user.getBackgroundImg();
        this.password = user.getPassword();

    }
}
