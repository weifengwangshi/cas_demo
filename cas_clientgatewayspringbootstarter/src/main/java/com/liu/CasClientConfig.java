/**
 * Created on [2020/2/20 10:04] by Administrator
 * <p>
 * 项目名称： cas TODO(项目名称)
 * <p>
 * 本程序版权属于福建慧政通信息科技有限公司所有。
 * 任何组织和个人未经福建慧政通信息科技有限公司许可与授权,不得擅自传播、复制、更改该程序的内容。
 * 本程序受版权法和国际条约的保护。如未经授权而擅自复制或传播本程序(或其中任何部分),
 * 将受到严厉的刑事及民事制裁，并将在法律许可的范围内受到最大可能的起诉!
 * <p>
 * ©2020 福建慧政通信息科技有限公司
 */
package com.liu;

import lombok.Data;
import org.jasig.cas.client.Protocol;

/**
 * 功能： TODO(用一句话描述类的功能)
 *
 * ──────────────────────────────────────────
 *   version  变更日期    修改人    修改说明
 * ------------------------------------------
 *   V1.0.0   2020/2/20    Liush     初版
 * ──────────────────────────────────────────
 */
@Data
public class CasClientConfig {


    //客户端部署地址
    public String serverName;
    //cas登录地址
    public String casServerLoginUrl;

    //白名单的正则表达式的值
    public String ignorePattern;

    //白名单鉴权模式，现在只支持正则模式
    public String ignoreUrlPatternType="REGEX";

    //cookie保存登录信息方式默认本地存储
    public String cookieHolderPattern="com.liu.MapCookieHolder";

    //cookie 的key
    public String authKey="my_authKey";

    //代理设置配置参数，代理保存ptg和ptgiou的相对回调地址
    public String proxyReceptorUrl;
}
