package xyz.igali.cyam.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import xyz.igali.cyam.api.entity.CyamUser;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Cyam
 * @since 2021-04-16
 */
@Repository
public interface CyamUserMapper extends BaseMapper<CyamUser> {

    public Integer addUser();
}
