package com.baqi.jave;

import java.io.File;

/***
 *      ┌─┐       ┌─┐
 *   ┌──┘ ┴───────┘ ┴──┐
 *   │                 │
 *   │       ───       │
 *   │  ─┬┘       └┬─  │
 *   │                 │
 *   │       ─┴─       │
 *   │                 │
 *   └───┐         ┌───┘
 *       │         │
 *       │         │
 *       │         │
 *       │         └──────────────┐
 *       │                        │
 *       │                        ├─┐
 *       │                        ┌─┘
 *       │                        │
 *       └─┐  ┐  ┌───────┬──┐  ┌──┘
 *         │ ─┤ ─┤       │ ─┤ ─┤
 *         └──┴──┘       └──┴──┘
 *                神兽保佑
 *               代码无BUG!
 */
public class ZTest {
    public static void main(String[] args) throws EncoderException {
        /*String src= "http://aikangcloudtest-new.oss-cn-qingdao.aliyuncs.com/oss/video/2019/11/353693303471890432.mp4";

        try {
            File file=new File(src);
            Encoder encoder = new Encoder();
            MultimediaInfo m = encoder.getInfo(file);

            System.out.println(m);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        String src= "https://aikangcloudtest-new.oss-cn-qingdao.aliyuncs.com/oss/video/2019/11/353693303471890432.mp4";
        Encoder encoder = new Encoder();
        encoder.getInfo(src);

    }
}
