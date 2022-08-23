/*
 * @Author: error: git config user.name && git config user.email & please set dead value or install git
 * @Date: 2022-08-23 23:55:45
 * @LastEditors: error: git config user.name && git config user.email & please set dead value or install git
 * @LastEditTime: 2022-08-24 00:02:41
 * @FilePath: \CareUEveryDay\src\main\java\cn\ofpp\Application.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package cn.ofpp;

import cn.ofpp.core.BoyFriend;
import cn.ofpp.core.GirlFriend;
import cn.ofpp.core.MessageFactory;
import cn.ofpp.core.Wx;

/**
 * 启动类
 *
 * 这个理论上只能用测试号 正式的号 个人认证是不支持模板消息的 企业认证的又必须使用微信模板库里的模板 只有测试的可以自定义模板内容
 * <a href="https://mp.weixin.qq.com/debug/cgi-bin/sandboxinfo?action=showinfo&t=sandbox/index">申请公众号测试应用地址</a>
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Application {

    /**
     * <li>创建配置</li>
     * <li>创建几个 男/女 朋友</li>
     * <li>发消息</li>
     */
    public static void main(String[] args) {
        // load and init
        Bootstrap.init();

        // -----------------  以下为演示数据  ------------------------

        // new 一个 女友
        GirlFriend girlFriend = new GirlFriend("某女友",
                "江苏省", "南京市", "1999-08-08", "2011-04-16", "oV7oE56Ptipba5kSXWlNk2CG6-uA");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(girlFriend));

        // new 一个 男友 也可单独针对一个friend设置模板ID 以达到不同人不同消息
        BoyFriend boyFriend = new BoyFriend("某男友",
                "江苏省", "南京市", "1999-08-08", "2011-04-16", "oV7oE5ywPoqRjCOLOjZkZMDni1Qo");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(boyFriend));
    }

}
