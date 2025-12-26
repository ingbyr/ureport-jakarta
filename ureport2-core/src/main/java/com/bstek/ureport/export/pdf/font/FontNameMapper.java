package com.bstek.ureport.export.pdf.font;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * 支持中文与英文运行环境字体映射
 */
public class FontNameMapper {
    private static Map<String, String> FONTS = new HashMap<>();

    static {
        FONTS.put("Arial", "Arial");
        FONTS.put("Comic Sans MS", "Comic Sans MS");
        FONTS.put("Courier New", "Courier New");
        FONTS.put("仿宋", "FangSong");
        FONTS.put("黑体", "SimHei");
        FONTS.put("Impact", "Impact");
        FONTS.put("楷体", "KaiTi");
        FONTS.put("宋体", "SimSun");
        FONTS.put("Times New Roman", "Times New Roman");
        FONTS.put("微软雅黑", "Microsoft YaHei");
    }

    public static String transfer(String cnFontName) {
        Locale locale = Locale.getDefault();
        if (locale == Locale.US || locale == Locale.ENGLISH) {
            String enFontName = FONTS.get(cnFontName);
            if (StringUtils.isNoneBlank(enFontName)) {
                return enFontName;
            }
        }
        return cnFontName;
    }

}
