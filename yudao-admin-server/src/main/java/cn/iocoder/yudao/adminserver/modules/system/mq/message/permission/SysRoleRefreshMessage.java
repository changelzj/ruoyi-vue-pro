package cn.iocoder.yudao.adminserver.modules.system.mq.message.permission;

import cn.iocoder.yudao.framework.mq.core.pubsub.AbstractChannelMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色数据刷新 Message
 *
 * @author 芋道源码
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysRoleRefreshMessage extends AbstractChannelMessage {

    @Override
    public String getChannel() {
        return "system.role.refresh";
    }

}
