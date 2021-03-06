package com.jonnyliu.proj.wechat.enums;

/**
 * 返回国家地区语言版本，zh_CN 简体，zh_TW 繁体，en 英语
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-08-25 17:27.
 */
public enum Lang{

    CHINESE("zh_CN", "简体"),
    TAIWAN("zh_TW", "繁体"),
    ENGLISH("en", "英语");

    private String languageCode;
    private String languageName;

    Lang(String languageCode, String languageName) {
        this.languageCode = languageCode;
        this.languageName = languageName;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public String getLanguageName() {
        return languageName;
    }

    public static Lang valueBy(String languageCode) {
        for (Lang lang : Lang.values()) {
            if (lang.getLanguageCode().equalsIgnoreCase(languageCode)) {
                return lang;
            }
        }
        return null;
    }
}
