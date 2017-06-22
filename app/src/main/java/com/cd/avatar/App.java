package com.cd.avatar;

import android.app.Application;
import android.os.CountDownTimer;
import android.os.Environment;

import java.io.File;

/**
 * 项目名称：Avatar.
 * 创建人： CT.
 * 创建时间: 2017/6/22.
 * GitHub:https://github.com/CNHTT
 */

public class App extends Application {
    public static String diskCachePath; // 缓存目录
    private static String mAppName;
    public static String DISK_CACHE_PATH = "/" + mAppName + "/image/"; // 图片缓存地址
    @Override
    public void onCreate() {
        mAppName ="AVATAR";
        DISK_CACHE_PATH = "/" + mAppName + "/image/";
        checkCachePath();
        super.onCreate();

    }

    private void checkCachePath() {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            diskCachePath = Environment.getExternalStorageDirectory().getPath() + DISK_CACHE_PATH;

            File outFilead = new File(diskCachePath + "ad/");

            File outFilechu = new File(diskCachePath + "chu/");

            File outFilechuimg = new File(diskCachePath + "chuimg/");

            File outFilevideodir01 = new File(diskCachePath + "chu/videodir01");

            File outFilevideodir02 = new File(diskCachePath + "chu/videodir02");

            File outFilechuimgdir01 = new File(diskCachePath + "chuimg/imgdir01");

            File outFilechuimgdir02 = new File(diskCachePath + "chuimg/imgdir02");

            File outFile = new File(diskCachePath);
            outFile.mkdirs();

            outFilead.mkdirs();

            outFilechu.mkdirs();

            outFilechuimg.mkdirs();

            outFilevideodir01.mkdirs();

            outFilevideodir02.mkdirs();

            outFilechuimgdir01.mkdirs();

            outFilechuimgdir02.mkdirs();
        } else {
            new CountDownTimer(2000, 1000) {

                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {
                    if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                        diskCachePath = Environment.getExternalStorageDirectory().getPath() + DISK_CACHE_PATH;

                        File outFilead = new File(diskCachePath + "ad/");

                        File outFilechu = new File(diskCachePath + "chu/");

                        File outFilechuimg = new File(diskCachePath + "chuimg/");

                        File outFilevideodir01 = new File(diskCachePath + "chu/videodir01");

                        File outFilevideodir02 = new File(diskCachePath + "chu/videodir02");

                        File outFilechuimgdir01 = new File(diskCachePath + "chuimg/imgdir01");

                        File outFilechuimgdir02 = new File(diskCachePath + "chuimg/imgdir02");

                        File outFile = new File(diskCachePath);
                        outFile.mkdirs();

                        outFilead.mkdirs();

                        outFilechu.mkdirs();

                        outFilechuimg.mkdirs();

                        outFilevideodir01.mkdirs();

                        outFilevideodir02.mkdirs();

                        outFilechuimgdir01.mkdirs();

                        outFilechuimgdir02.mkdirs();
                        this.cancel();
                    } else {
                        this.start();
                    }
                }
            }.start();
        }

    }

}
