
package com.ydl.videoplaylib.inter.player;

import java.util.Map;


/**
 * VideoPlayer抽象接口，控制播放状态和获取播放状态的接口
 */
public interface InterStateVideoPlayer {

    /**
     * 设置视频Url，以及headers
     *
     * @param url           视频地址，可以是本地，也可以是网络视频
     * @param headers       请求header.
     */
    void setUp(String url, Map<String, String> headers);

    /**
     * 开始播放
     */
    void start();

    /**
     * 从指定的位置开始播放
     *
     * @param position      播放位置
     */
    void start(long position);

    /**
     * 重新播放，播放器被暂停、播放错误、播放完成后，需要调用此方法重新播放
     */
    void restart();

    /**
     * 暂停播放
     */
    void pause();

    /**------------------以下9个方法是播放器在当前的播放状态----------------------------*/
    boolean isIdle();
    boolean isPreparing();
    boolean isPrepared();
    boolean isBufferingPlaying();
    boolean isBufferingPaused();
    boolean isPlaying();
    boolean isPaused();
    boolean isError();
    boolean isCompleted();

}
