package com.scatl.uestcbbs.util;

import java.util.ArrayList;

public class Constant {

    public static final String PACKAGE_NAME = "com.scatl.uestcbbs";

    public static class AppPath {
        public static final String TEMP_PATH = "temp";  //临时数据，压缩的图片等
        public static final String JSON_PATH = "json";  //主要保存json数据
        public static final String BOARD_IMG_PATH = "board_img";  //自定义的板块图片
        public static final String AVATAR_PATH = "avatar";
    }

    public static class FileName {
        public static final String HOME_BANNER_JSON = "home_banner.json";
        public static final String HOME_SIMPLE_POST_JSON = "home_simple_post.json";
        public static final String HOME1_ALL_POST_JSON = "home_all_post.json";
        public static final String HOME1_NEW_POST_JSON = "home_new_post.json";
        public static final String HOME1_HOT_POST_JSON = "home_hot_post.json";
        public static final String HOME1_ESSENCE_POST_JSON = "home_essence_post.json";
    }

    public static class IntentKey {
        public static final String ID = "id";
        public static final String USER_ID = "user_id";
        public static final String TOPIC_ID = "topic_id";
        public static final String POST_ID = "post_id";
        public static final String POST_STICK = "post_stick";
        public static final String ALBUM_ID = "album_id";
        public static final String COLLECTION_ID = "collection_id";
        public static final String TOPIC_URL = "topic_url";
        public static final String TYPE = "type";
        public static final String DATA_1 = "data1";
        public static final String DATA_2 = "data2";
        public static final String SUB_BOARD_DATA = "sub_board_data";
        public static final String BOARD_CAT_DATA = "cat_data";
        public static final String SORT_BY = "sort_by";
        public static final String BOARD_ID = "board_id";
        public static final String LOCATE_BOARD_ID = "locate_board_id";
        public static final String BOARD_NAME= "board_name";
        public static final String FILTER_ID = "filter_id";
        public static final String ALBUM_NAME = "album_name";
        public static final String FILTER_NAME = "filter_name";
        public static final String QUOTE_ID = "quote_id";
        public static final String IS_QUOTE = "is_quote";
        public static final String USER_NAME = "user_name";
        public static final String IMAGE_URL = "image_url";
        public static final String COPY_RIGHT = "copy_right";
        public static final String AT_USER = "at_user";
        public static final String CURRENT_SELECT = "current_select";
        public static final String URL = "url";
        public static final String TITLE = "title";
        public static final String CONTENT = "content";
        public static final String TIME = "time";
        public static final String POLL_OPTIONS = "poll_options";
        public static final String POLL_EXPIRATION  = "poll_expiration";
        public static final String POLL_CHOICES = "poll_max_choices";
        public static final String POLL_VISIBLE = "poll_visible";
        public static final String POLL_SHOW_VOTERS = "poll_show_voters";
        public static final String LOGIN_TYPE = "login_type";
        public static final String MAGIC_ID = "magic_id";
        public static final String FORM_HASH = "form_hash";
        public static final String MESSAGE = "message";
        public static final String FILE_NAME = "file_name";
        public static final String NOTIFICATION_ID = "notification_id";
        public static final String POSITION = "position";
        public static final String IS_NEW_CONTENT = "is_new_content";
        public static final String LOCATED_PID = "located_pid";
        public static final String LOCATE_COMMENT = "located_comment";
        public static final String NEED_CONFIRM = "need_confirm";
        public static final String COUNT = "count";
        public static final String SHORT_CUT_HOT = "short_cut_hot";
        public static final String VIEW_DIANPING = "view_dianping";
        public static final String DRAGGABLE = "draggable";
        public static final String MAX_HEIGHT_MULTIPLIER = "max_height_Multiplier";
        public static final String CANCELABLE = "cancelable";
    }

    //腾讯buglg
    public static final String BUGLY_ID = "c9542eaf0b";

    //河畔sdkversion
    //当>=2.4.2时，可以获取系统消息提醒
    public static final String SDK_VERSION = "2.4.2";

    //部门直通车id
    public static final int DEPARTMENT_BOARD_ID = 403;
    public static final String DEPARTMENT_BOARD_NAME = "部门直通车";

    public static final int LOST_FOUND_BOARD_ID = 305;
    public static final String LOST_FOUND_BOARD_NAME = "失物招领";

    //密语板块id
    public static final int MIYU_BOARD_ID = 371;
    public static final String MIYU_BOARD_USER_NAME = "匿名";

    //楼层
    public static final String[] FLOOR = {"沙发", "板凳", "地板", "地下"};

    //tag随机背景颜色
    public static final String[] TAG_COLOR = {"#1296db", "#B76565", "#a686ba",
            "#7b6ab9", "#5B9FAB", "#9C566A",
            "#0b988f", "#83C6C2", "#3f81c1",
            "#5A8DB3", "#d55294"};

    public static final int[] SECURE_BOARD_ID = {174, 214, 395, 389, 263, 267, 378};

    //校车时刻链接
    public static final String BUS_TIME = "http://bbs.uestc.edu.cn/bus";

    public static final String REGISTER_URL = "https://bbs.uestc.edu.cn/member.php?mod=register";

    //默认头像
    public static final String DEFAULT_AVATAR = "https://bbs.uestc.edu.cn/uc_server/images/noavatar_middle.gif";
    public static final String USER_AVATAR_URL = "https://bbs.uestc.edu.cn/uc_server/avatar.php?size=middle&uid=";
    public static final String ANONYMOUS_NAME = "匿名";

    public static final String VIEW_VOTER_LINK = "https://bbs.uestc.edu.cn/forum.php?mod=misc&action=viewvote&tid=";

    public static final String TOPIC_URL = "https://bbs.uestc.edu.cn/forum.php?mod=viewthread&tid=";

    public static final ArrayList<String> SPLIT_LINES = new ArrayList<String>() {
        {
            add("https://bbs.uestc.edu.cn/static/image/hrline/1.gif");
            add("https://bbs.uestc.edu.cn/static/image/hrline/2.gif");
            add("https://bbs.uestc.edu.cn/static/image/hrline/3.gif");
            add("https://bbs.uestc.edu.cn/static/image/hrline/4.gif");
            add("https://bbs.uestc.edu.cn/static/image/hrline/line1.png");
            add("https://bbs.uestc.edu.cn/static/image/hrline/line2.png");
            add("https://bbs.uestc.edu.cn/static/image/hrline/line3.png");
            add("https://bbs.uestc.edu.cn/static/image/hrline/line4.png");
            add("https://bbs.uestc.edu.cn/static/image/hrline/line5.png");
            add("https://bbs.uestc.edu.cn/static/image/hrline/line6.png");
            add("https://bbs.uestc.edu.cn/static/image/hrline/line7.png");
            add("https://bbs.uestc.edu.cn/static/image/hrline/line8.png");
            add("https://bbs.uestc.edu.cn/static/image/hrline/line9.png");
            add("http://bbs.uestc.edu.cn/static/image/hrline/1.gif");
            add("http://bbs.stuhome.net/static/image/hrline/1.gif");
        }
    };
}
