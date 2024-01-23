package com.hb.demo.test.translateWeb;

import java.util.Base64;

public class translateResultTest {
    public static void main(String[] args) {
        String encodeStr = "Z21kD9ZK1ke6ugku2ccWuwRmpItPkRr5XcmzOgAKD0GcaHTZL9kyNKkN2aYY6yiOfCIbzZZuEGgS-eiCGLtr7XXYSYOrO4jAVzrdNbwESE_1lxrXHlXQPBdBP5YWVyt091TqZywUAVhfC-8 lYc7mlsFmmZgmIF8R7Y5RO2o_potCwozEv7sr-GMOLXuNVtMo9YbBYpdT3MWSVNf1UrxKKCpE1e8B3efHVvGZ22OuWv5eGs8QOGnAYZ4eLgFHRltlFdYyLBAA3ZZR8X6_hMqDVwDc4rNQYB_jS1lOtH5bz-nZ8M1LzY5152q9DFHlo_QiBZyG5dtfKYeyULprifn_yhy3bFHJ1ZyRYgYk-2 pNtHsLDyyY2mlFCAoqOSdTgUKHaimkR8YF_iyWvtmqTVivEUNtr5qkisaH7BUUqGGJUgVnCDbqEtp7N0eBVT38ArQL58CDLdIklNoPSgalryYCoXosxus2y4XljVTnrFCy2HrwRtbEUyw7A_JSjCS8R65Ote3hfZINbwEIJMfza32HyiLTZJkMDYSV3X-_1GWJiSbXYb_I6SgJk-ATH36eTP7347GHiP3MSujrjiDJPi_QlmI1zr-AGsTDf8xDVq9Vv_OFQlticY2o1ywb531cr5ujze-l78hdXpyfd1EVcV1Vmyp_4kr3E_MrCeDTowNmzr3VCHMXfz_XWBPcLSl5zSsO";
        byte[] decode = Base64.getDecoder().decode(encodeStr);
        String s = new String(decode);
        System.out.println(s);
    }
}
