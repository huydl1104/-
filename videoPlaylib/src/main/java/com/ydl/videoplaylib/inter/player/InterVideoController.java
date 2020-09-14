
package com.ydl.videoplaylib.inter.player;

import android.widget.ImageView;

import androidx.annotation.DrawableRes;

import com.ydl.videoplaylib.constant.ConstantKeys;


/**
 *视频控制器接口,定义一些设置视图属性接口
 */
public interface InterVideoController {


    /**
     * 设置top到顶部的距离
     * @param top                   top距离
     */
    void setTopPadding(float top);

    /**
     * 设置横屏播放时，tv和audio图标是否显示
     * @param isVisibility1                 tv图标是否显示
     * @param isVisibility2                 audio图标是否显示
     */
    void setTvAndAudioVisibility(boolean isVisibility1, boolean isVisibility2);

    /**
     * 视频底图
     *
     * @param resId 视频底图资源
     */
    void setImage(@DrawableRes int resId);

    /**
     * 设置总时长
     */
    void setLength(long length);

    /**
     * 设置总时长
     */
    void setLength(String length);

    /**
     * 视频底图ImageView控件，提供给外部用图片加载工具来加载网络图片
     *
     * @return 底图ImageView
     */
    ImageView imageView();

    /**
     * 获取是否是锁屏模式
     * @return                      true表示锁屏
     */
    boolean getLock();

    /**
     * 设置是否显示视频头部的下载，分享布局控件
     * @param isVisibility          是否可见
     */
    void setTopVisibility(boolean isVisibility);

    /**
     * 设置不操作后，多久自动隐藏头部和底部布局
     * @param time                  时间
     */
    void setHideTime(long time);

    /**
     * 设置加载loading类型
     *
     * @param type 加载loading的类型
     *             目前1，是仿腾讯加载loading
     *             2，是转圈加载loading
     */
    void setLoadingType(@ConstantKeys.LoadingType int type);

    /**
     * 设置播放的视频的标题
     *
     * @param title 视频标题
     */
    void setTitle(String title);

    /**
     * 当播放器的播放状态发生变化，在此方法中国你更新不同的播放状态的UI
     *
     * @param playState 播放状态：
     */
    void onPlayStateChanged(@ConstantKeys.CurrentState int playState);

    /**
     * 当播放器的播放模式发生变化，在此方法中更新不同模式下的控制器界面。
     *
     * @param playMode 播放器的模式：
     */
    void onPlayModeChanged(@ConstantKeys.PlayMode int playMode);

    /**
     * 重置控制器，将控制器恢复到初始状态。
     */
    void reset();

    /**
     * 控制器意外销毁，比如手动退出，意外崩溃等等
     */
    void destroy();
}
