package xyz.igali.cyam.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.igali.cyam.api.entity.CyamUser;
import xyz.igali.cyam.api.mapper.CyamUserMapper;
import xyz.igali.cyam.api.service.ICyamUserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Cyam
 * @since 2021-04-16
 */
@Service
public class CyamUserServiceImpl extends ServiceImpl<CyamUserMapper, CyamUser> implements ICyamUserService {

//    @Resource
//    CyamUserMapper cyamUserMapper;
}
