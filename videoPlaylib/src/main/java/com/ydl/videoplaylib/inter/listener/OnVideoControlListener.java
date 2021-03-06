
package com.ydl.videoplaylib.inter.listener;


import com.ydl.videoplaylib.constant.ConstantKeys;

/**
 * 视频顶部点击事件
 */
public interface OnVideoControlListener {

    /**
     * 视频顶部点击事件【下载，切换音频，分享等】
     * @param type      类型
     *                  在竖屏模式下
     *                  1.DOWNLOAD，下载
     *                  2.AUDIO，切换音频
     *                  3.SHARE，分享
     *                  4.MENU，菜单
     *
     *                  在横屏模式下
     *                  5.TV，tv映射
     *                  6.HOR_AUDIO，音频
     */
    void onVideoControlClick(@ConstantKeys.VideoControlType int type);
    
}
