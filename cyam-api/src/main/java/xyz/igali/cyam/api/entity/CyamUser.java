package xyz.igali.cyam.api.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Cyam
 * @since 2021-04-16
 */
@EqualsAndHashCode(callSuper = false)
@TableName("cyam_user")
@Accessors(chain = true)
public class CyamUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("username")
    private String username;

    @TableField("user_phone")
    private String userPhone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "CyamUser{" +
            "username=" + username +
            ", userPhone=" + userPhone +
        "}";
    }
}
