package renxiaolong_study;

import javax.swing.JOptionPane;

import com.sobte.cqp.jcq.entity.Anonymous;
import com.sobte.cqp.jcq.entity.CQDebug;
import com.sobte.cqp.jcq.entity.GroupFile;
import com.sobte.cqp.jcq.entity.ICQVer;
import com.sobte.cqp.jcq.entity.IMsg;
import com.sobte.cqp.jcq.entity.IRequest;
import com.sobte.cqp.jcq.event.JcqAppAbstract;

/**
 * 鏈枃浠舵槸JCQ鎻掍欢鐨勪富绫�<br>
 * <br>
 * 
 * 娉ㄦ剰淇敼json涓殑class鏉ュ姞杞戒富绫伙紝濡備笉璁剧疆鍒欏埄鐢╝ppid鍔犺浇锛屾渶鍚庝竴涓崟璇嶈嚜鍔ㄥぇ鍐欐煡鎵�<br>
 * 渚嬶細appid(com.example.demo) 鍒欏姞杞界被 com.example.Demo<br>
 * 鏂囨。鍦板潃锛� https://gitee.com/Sobte/JCQ-CoolQ <br>
 * 甯栧瓙锛歨ttps://cqp.cc/t/37318 <br>
 * 杈呭姪寮�鍙戝彉閲�: {@link JcqAppAbstract#CQ CQ}({@link com.sobte.cqp.jcq.entity.CoolQ 閰稱鏍稿績鎿嶄綔绫粆),
 * 			 {@link JcqAppAbstract#CC CC}({@link com.sobte.cqp.jcq.entity.CQCode 閰稱鐮佹搷浣滅被}),
 * 			   鍏蜂綋鍔熻兘鍙互鏌ョ湅鏂囨。
 */
public class Demo extends JcqAppAbstract implements ICQVer, IMsg, IRequest {

	/**
     * 鐢╩ain鏂规硶璋冭瘯鍙互鏈�澶у寲鐨勫姞蹇紑鍙戞晥鐜囷紝妫�娴嬪拰瀹氫綅閿欒浣嶇疆<br/>
     * 浠ヤ笅灏辨槸浣跨敤Main鏂规硶杩涜娴嬭瘯鐨勪竴涓畝鏄撴渚�
     *
     * @param args 绯荤粺鍙傛暟
     */
    public static void main(String[] args) {
        // CQ姝ゅ彉閲忎负鐗规畩鍙橀噺锛屽湪JCQ鍚姩鏃跺疄渚嬪寲璧嬪�肩粰姣忎釜鎻掍欢锛岃�屽湪娴嬭瘯涓彲浠ョ敤CQDebug绫绘潵浠ｆ浛浠�
        CQ = new CQDebug();//new CQDebug("搴旂敤鐩綍","搴旂敤鍚嶇О") 鍙互鐢ㄦ鏋勯�犲櫒鍒濆鍖栧簲鐢ㄧ殑鐩綍
        CQ.logInfo("[JCQ] TEST Demo", "娴嬭瘯鍚姩");// 鐜板湪灏卞彲浠ョ敤CQ鍙橀噺鏉ユ墽琛屼换浣曟兂瑕佺殑鎿嶄綔浜�
        // 瑕佹祴璇曚富绫诲氨鍏堝疄渚嬪寲涓�涓富绫诲璞�
        Demo demo = new Demo();
        // 涓嬮潰瀵逛富绫昏繘琛屽悇鏂规硶娴嬭瘯,鎸夌収JCQ杩愯杩囩▼锛屾ā鎷熷疄闄呮儏鍐�
        demo.startup();// 绋嬪簭杩愯寮�濮� 璋冪敤搴旂敤鍒濆鍖栨柟娉�
        demo.enable();// 绋嬪簭鍒濆鍖栧畬鎴愬悗锛屽惎鐢ㄥ簲鐢紝璁╁簲鐢ㄦ甯稿伐浣�
        // 寮�濮嬫ā鎷熷彂閫佹秷鎭�
        // 妯℃嫙绉佽亰娑堟伅
        // 寮�濮嬫ā鎷烸Q鐢ㄦ埛鍙戦�佹秷鎭紝浠ヤ笅QQ鍏ㄩ儴缂栭�狅紝璇峰嬁娣诲姞
        demo.privateMsg(0, 10001, 2234567819L, "灏忓濮愮害鍚�", 0);
        demo.privateMsg(0, 10002, 2222222224L, "鍠靛憸鍠靛憸鍠靛憸", 0);
        demo.privateMsg(0, 10003, 2111111334L, "鍙互缁欐垜浣犵殑寰俊鍚�", 0);
        demo.privateMsg(0, 10004, 3111111114L, "浠婂ぉ澶╂皵鐪熷ソ", 0);
        demo.privateMsg(0, 10005, 3333333334L, "浣犲ソ鍧忥紝閮戒笉鐞嗘垜QAQ", 0);
        // 妯℃嫙缇よ亰娑堟伅
        // 寮�濮嬫ā鎷熺兢鑱婃秷鎭�
        demo.groupMsg(0, 10006, 3456789012L, 3333333334L, "", "鑿滃崟", 0);
        demo.groupMsg(0, 10008, 3456789012L, 11111111114L, "", "灏忓柕鍛紝鍑烘潵鐜╃帺鍛�", 0);
        demo.groupMsg(0, 10009, 427984429L, 3333333334L, "", "[CQ:at,qq=2222222224] 鏉ヤ竴璧风帺娓告垙锛屽紑杞﹀紑杞�", 0);
        demo.groupMsg(0, 10010, 427984429L, 3333333334L, "", "濂戒箙涓嶈鍟� [CQ:at,qq=11111111114]", 0);
        demo.groupMsg(0, 10011, 427984429L, 11111111114L, "", "qwq 鏈夋病鏈変竴璧峰紑鐨刓n[CQ:at,qq=3333333334]浣犵帺鍢�", 0);
        // ......
        // 渚濇绫绘帹锛屽彲浠ユ牴鎹疄闄呮儏鍐典慨鏀瑰弬鏁帮紝鍜屾柟娉曟祴璇曟晥鏋�
        // 浠ヤ笅鏄敹灏捐Е鍙戝嚱鏁�
        // demo.disable();// 瀹為檯杩囩▼涓▼搴忕粨鏉熶笉浼氳Е鍙慸isable锛屽彧鏈夌敤鎴峰叧闂簡姝ゆ彃浠舵墠浼氳Е鍙�
        demo.exit();// 鏈�鍚庣▼搴忚繍琛岀粨鏉燂紝璋冪敤exit鏂规硶
    }

    /**
     * 鎵撳寘鍚庡皢涓嶄細璋冪敤 璇蜂笉瑕佸湪姝や簨浠朵腑鍐欏叾浠栦唬鐮�
     *
     * @return 杩斿洖搴旂敤鐨凙piVer銆丄ppid
     */
    public String appInfo() {
        // 搴旂敤AppID,瑙勫垯瑙� http://d.cqp.me/Pro/寮�鍙�/鍩虹淇℃伅#appid
        String AppID = "com.example.demo";// 璁颁綇缂栬瘧鍚庣殑鏂囦欢鍜宩son涔熻浣跨敤appid鍋氭枃浠跺悕
        /**
         * 鏈嚱鏁般�愮姝€�戝鐞嗗叾浠栦换浣曚唬鐮侊紝浠ュ厤鍙戠敓寮傚父鎯呭喌銆�
         * 濡傞渶鎵ц鍒濆鍖栦唬鐮佽鍦� startup 浜嬩欢涓墽琛岋紙Type=1001锛夈��
         */
        return CQAPIVER + "," + AppID;
    }

    /**
     * 閰稱鍚姩 (Type=1001)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愪富绾跨▼銆戜腑琚皟鐢ㄣ��<br>
     * 璇峰湪杩欓噷鎵ц鎻掍欢鍒濆鍖栦唬鐮併��<br>
     * 璇峰姟蹇呭敖蹇繑鍥炴湰瀛愮▼搴忥紝鍚﹀垯浼氬崱浣忓叾浠栨彃浠朵互鍙婁富绋嬪簭鐨勫姞杞姐��
     *
     * @return 璇峰浐瀹氳繑鍥�0
     */
    public int startup() {
        // 鑾峰彇搴旂敤鏁版嵁鐩綍(鏃犻渶鍌ㄥ瓨鏁版嵁鏃讹紝璇峰皢姝よ娉ㄩ噴)
        String appDirectory = CQ.getAppDirectory();
        // 杩斿洖濡傦細D:\CoolQ\app\com.sobte.cqp.jcq\app\com.example.demo\
        // 搴旂敤鐨勬墍鏈夋暟鎹�侀厤缃�愬繀椤汇�戝瓨鏀句簬姝ょ洰褰曪紝閬垮厤缁欑敤鎴峰甫鏉ュ洶鎵般��
        return 0;
    }

    /**
     * 閰稱閫�鍑� (Type=1002)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愪富绾跨▼銆戜腑琚皟鐢ㄣ��<br>
     * 鏃犺鏈簲鐢ㄦ槸鍚﹁鍚敤锛屾湰鍑芥暟閮戒細鍦ㄩ叿Q閫�鍑哄墠鎵ц涓�娆★紝璇峰湪杩欓噷鎵ц鎻掍欢鍏抽棴浠ｇ爜銆�
     *
     * @return 璇峰浐瀹氳繑鍥�0锛岃繑鍥炲悗閰稱灏嗗緢蹇叧闂紝璇蜂笉瑕佸啀閫氳繃绾跨▼绛夋柟寮忔墽琛屽叾浠栦唬鐮併��
     */
    public int exit() {
        return 0;
    }

    /**
     * 搴旂敤宸茶鍚敤 (Type=1003)<br>
     * 褰撳簲鐢ㄨ鍚敤鍚庯紝灏嗘敹鍒版浜嬩欢銆�<br>
     * 濡傛灉閰稱杞藉叆鏃跺簲鐢ㄥ凡琚惎鐢紝鍒欏湪 {@link #startup startup}(Type=1001,閰稱鍚姩) 琚皟鐢ㄥ悗锛屾湰鍑芥暟涔熷皢琚皟鐢ㄤ竴娆°��<br>
     * 濡傞潪蹇呰锛屼笉寤鸿鍦ㄨ繖閲屽姞杞界獥鍙ｃ��
     *
     * @return 璇峰浐瀹氳繑鍥�0銆�
     */
    public int enable() {
        enable = true;
        return 0;
    }

    /**
     * 搴旂敤灏嗚鍋滅敤 (Type=1004)<br>
     * 褰撳簲鐢ㄨ鍋滅敤鍓嶏紝灏嗘敹鍒版浜嬩欢銆�<br>
     * 濡傛灉閰稱杞藉叆鏃跺簲鐢ㄥ凡琚仠鐢紝鍒欐湰鍑芥暟銆愪笉浼氥�戣璋冪敤銆�<br>
     * 鏃犺鏈簲鐢ㄦ槸鍚﹁鍚敤锛岄叿Q鍏抽棴鍓嶆湰鍑芥暟閮姐�愪笉浼氥�戣璋冪敤銆�
     *
     * @return 璇峰浐瀹氳繑鍥�0銆�
     */
    public int disable() {
        enable = false;
        return 0;
    }

    /**
     * 绉佽亰娑堟伅 (Type=21)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��<br>
     *
     * @param subType 瀛愮被鍨嬶紝11/鏉ヨ嚜濂藉弸 1/鏉ヨ嚜鍦ㄧ嚎鐘舵�� 2/鏉ヨ嚜缇� 3/鏉ヨ嚜璁ㄨ缁�
     * @param msgId   娑堟伅ID
     * @param fromQQ  鏉ユ簮QQ
     * @param msg     娑堟伅鍐呭
     * @param font    瀛椾綋
     * @return 杩斿洖鍊�*涓嶈兘*鐩存帴杩斿洖鏂囨湰 濡傛灉瑕佸洖澶嶆秷鎭紝璇疯皟鐢╝pi鍙戦��<br>
     * 杩欓噷 杩斿洖  {@link IMsg#MSG_INTERCEPT MSG_INTERCEPT} - 鎴柇鏈潯娑堟伅锛屼笉鍐嶇户缁鐞�<br>
     * 娉ㄦ剰锛氬簲鐢ㄤ紭鍏堢骇璁剧疆涓�"鏈�楂�"(10000)鏃讹紝涓嶅緱浣跨敤鏈繑鍥炲��<br>
     * 濡傛灉涓嶅洖澶嶆秷鎭紝浜ょ敱涔嬪悗鐨勫簲鐢�/杩囨护鍣ㄥ鐞嗭紝杩欓噷 杩斿洖  {@link IMsg#MSG_IGNORE MSG_IGNORE} - 蹇界暐鏈潯娑堟伅
     */
    public int privateMsg(int subType, int msgId, long fromQQ, String msg, int font) {
        // 杩欓噷澶勭悊娑堟伅
        CQ.sendPrivateMsg(fromQQ, "浣犲彂閫佷簡杩欐牱鐨勬秷鎭細" + msg + "\n鏉ヨ嚜Java鎻掍欢");
        return MSG_IGNORE;
    }

    /**
     * 缇ゆ秷鎭� (Type=2)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��<br>
     *
     * @param subType       瀛愮被鍨嬶紝鐩墠鍥哄畾涓�1
     * @param msgId         娑堟伅ID
     * @param fromGroup     鏉ユ簮缇ゅ彿
     * @param fromQQ        鏉ユ簮QQ鍙�
     * @param fromAnonymous 鏉ユ簮鍖垮悕鑰�
     * @param msg           娑堟伅鍐呭
     * @param font          瀛椾綋
     * @return 鍏充簬杩斿洖鍊艰鏄�, 瑙� {@link #privateMsg 绉佽亰娑堟伅} 鐨勬柟娉�
     */
    public int groupMsg(int subType, int msgId, long fromGroup, long fromQQ, String fromAnonymous, String msg,
                        int font) {
        // 濡傛灉娑堟伅鏉ヨ嚜鍖垮悕鑰�
        if (fromQQ == 80000000L && !fromAnonymous.equals("")) {
            // 灏嗗尶鍚嶇敤鎴蜂俊鎭斁鍒� anonymous 鍙橀噺涓�
            Anonymous anonymous = CQ.getAnonymous(fromAnonymous);
        }

        // 瑙ｆ瀽CQ鐮佹渚� 濡傦細[CQ:at,qq=100000]
        // 瑙ｆ瀽CQ鐮� 甯哥敤鍙橀噺涓� CC(CQCode) 姝ゅ彉閲忎笓涓篊Q鐮佽繖绉嶇壒瀹氭牸寮忓仛浜嗚В鏋愬拰灏佽
        // CC.analysis();// 姝ゆ柟娉曞皢CQ鐮佽В鏋愪负鍙洿鎺ヨ鍙栫殑瀵硅薄
        // 瑙ｆ瀽娑堟伅涓殑QQID
        //long qqId = CC.getAt(msg);// 姝ゆ柟娉曚负绠�渚挎柟娉曪紝鑾峰彇绗竴涓狢Q:at閲岀殑QQ鍙凤紝閿欒鏃朵负锛�-1000
        //List<Long> qqIds = CC.getAts(msg); // 姝ゆ柟娉曚负鑾峰彇娑堟伅涓墍鏈夌殑CQ鐮佸璞★紝閿欒鏃惰繑鍥� 宸茶В鏋愮殑鏁版嵁
        // 瑙ｆ瀽娑堟伅涓殑鍥剧墖
        //CQImage image = CC.getCQImage(msg);// 姝ゆ柟娉曚负绠�渚挎柟娉曪紝鑾峰彇绗竴涓狢Q:image閲岀殑鍥剧墖鏁版嵁锛岄敊璇椂鎵撳嵃寮傚父鍒版帶鍒跺彴锛岃繑鍥� null
        //List<CQImage> images = CC.getCQImages(msg);// 姝ゆ柟娉曚负鑾峰彇娑堟伅涓墍鏈夌殑CQ鍥剧墖鏁版嵁锛岄敊璇椂鎵撳嵃寮傚父鍒版帶鍒跺彴锛岃繑鍥� 宸茶В鏋愮殑鏁版嵁

        // 杩欓噷澶勭悊娑堟伅
        CQ.sendGroupMsg(fromGroup, CC.at(fromQQ) + "浣犲彂閫佷簡杩欐牱鐨勬秷鎭細" + msg + "\n鏉ヨ嚜Java鎻掍欢");
        return MSG_IGNORE;
    }

    /**
     * 璁ㄨ缁勬秷鎭� (Type=4)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��<br>
     *
     * @param subtype     瀛愮被鍨嬶紝鐩墠鍥哄畾涓�1
     * @param msgId       娑堟伅ID
     * @param fromDiscuss 鏉ユ簮璁ㄨ缁�
     * @param fromQQ      鏉ユ簮QQ鍙�
     * @param msg         娑堟伅鍐呭
     * @param font        瀛椾綋
     * @return 鍏充簬杩斿洖鍊艰鏄�, 瑙� {@link #privateMsg 绉佽亰娑堟伅} 鐨勬柟娉�
     */
    public int discussMsg(int subtype, int msgId, long fromDiscuss, long fromQQ, String msg, int font) {
        // 杩欓噷澶勭悊娑堟伅

        return MSG_IGNORE;
    }

    /**
     * 缇ゆ枃浠朵笂浼犱簨浠� (Type=11)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��<br>
     *
     * @param subType   瀛愮被鍨嬶紝鐩墠鍥哄畾涓�1
     * @param sendTime  鍙戦�佹椂闂�(鏃堕棿鎴�)// 10浣嶆椂闂存埑
     * @param fromGroup 鏉ユ簮缇ゅ彿
     * @param fromQQ    鏉ユ簮QQ鍙�
     * @param file      涓婁紶鏂囦欢淇℃伅
     * @return 鍏充簬杩斿洖鍊艰鏄�, 瑙� {@link #privateMsg 绉佽亰娑堟伅} 鐨勬柟娉�
     */
    public int groupUpload(int subType, int sendTime, long fromGroup, long fromQQ, String file) {
        GroupFile groupFile = CQ.getGroupFile(file);
        if (groupFile == null) { // 瑙ｆ瀽缇ゆ枃浠朵俊鎭紝濡傛灉澶辫触鐩存帴蹇界暐璇ユ秷鎭�
            return MSG_IGNORE;
        }
        // 杩欓噷澶勭悊娑堟伅
        return MSG_IGNORE;
    }

    /**
     * 缇や簨浠�-绠＄悊鍛樺彉鍔� (Type=101)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��<br>
     *
     * @param subtype        瀛愮被鍨嬶紝1/琚彇娑堢鐞嗗憳 2/琚缃鐞嗗憳
     * @param sendTime       鍙戦�佹椂闂�(鏃堕棿鎴�)
     * @param fromGroup      鏉ユ簮缇ゅ彿
     * @param beingOperateQQ 琚搷浣淨Q
     * @return 鍏充簬杩斿洖鍊艰鏄�, 瑙� {@link #privateMsg 绉佽亰娑堟伅} 鐨勬柟娉�
     */
    public int groupAdmin(int subtype, int sendTime, long fromGroup, long beingOperateQQ) {
        // 杩欓噷澶勭悊娑堟伅

        return MSG_IGNORE;
    }

    /**
     * 缇や簨浠�-缇ゆ垚鍛樺噺灏� (Type=102)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��<br>
     *
     * @param subtype        瀛愮被鍨嬶紝1/缇ゅ憳绂诲紑 2/缇ゅ憳琚涪
     * @param sendTime       鍙戦�佹椂闂�(鏃堕棿鎴�)
     * @param fromGroup      鏉ユ簮缇ゅ彿
     * @param fromQQ         鎿嶄綔鑰匭Q(浠呭瓙绫诲瀷涓�2鏃跺瓨鍦�)
     * @param beingOperateQQ 琚搷浣淨Q
     * @return 鍏充簬杩斿洖鍊艰鏄�, 瑙� {@link #privateMsg 绉佽亰娑堟伅} 鐨勬柟娉�
     */
    public int groupMemberDecrease(int subtype, int sendTime, long fromGroup, long fromQQ, long beingOperateQQ) {
        // 杩欓噷澶勭悊娑堟伅

        return MSG_IGNORE;
    }

    /**
     * 缇や簨浠�-缇ゆ垚鍛樺鍔� (Type=103)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��<br>
     *
     * @param subtype        瀛愮被鍨嬶紝1/绠＄悊鍛樺凡鍚屾剰 2/绠＄悊鍛橀個璇�
     * @param sendTime       鍙戦�佹椂闂�(鏃堕棿鎴�)
     * @param fromGroup      鏉ユ簮缇ゅ彿
     * @param fromQQ         鎿嶄綔鑰匭Q(鍗崇鐞嗗憳QQ)
     * @param beingOperateQQ 琚搷浣淨Q(鍗冲姞缇ょ殑QQ)
     * @return 鍏充簬杩斿洖鍊艰鏄�, 瑙� {@link #privateMsg 绉佽亰娑堟伅} 鐨勬柟娉�
     */
    public int groupMemberIncrease(int subtype, int sendTime, long fromGroup, long fromQQ, long beingOperateQQ) {
        // 杩欓噷澶勭悊娑堟伅

        return MSG_IGNORE;
    }

    /**
     * 濂藉弸浜嬩欢-濂藉弸宸叉坊鍔� (Type=201)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��<br>
     *
     * @param subtype  瀛愮被鍨嬶紝鐩墠鍥哄畾涓�1
     * @param sendTime 鍙戦�佹椂闂�(鏃堕棿鎴�)
     * @param fromQQ   鏉ユ簮QQ
     * @return 鍏充簬杩斿洖鍊艰鏄�, 瑙� {@link #privateMsg 绉佽亰娑堟伅} 鐨勬柟娉�
     */
    public int friendAdd(int subtype, int sendTime, long fromQQ) {
        // 杩欓噷澶勭悊娑堟伅

        return MSG_IGNORE;
    }

    /**
     * 璇锋眰-濂藉弸娣诲姞 (Type=301)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��<br>
     *
     * @param subtype      瀛愮被鍨嬶紝鐩墠鍥哄畾涓�1
     * @param sendTime     鍙戦�佹椂闂�(鏃堕棿鎴�)
     * @param fromQQ       鏉ユ簮QQ
     * @param msg          闄勮█
     * @param responseFlag 鍙嶉鏍囪瘑(澶勭悊璇锋眰鐢�)
     * @return 鍏充簬杩斿洖鍊艰鏄�, 瑙� {@link #privateMsg 绉佽亰娑堟伅} 鐨勬柟娉�
     */
    public int requestAddFriend(int subtype, int sendTime, long fromQQ, String msg, String responseFlag) {
        // 杩欓噷澶勭悊娑堟伅

        /**
         * REQUEST_ADOPT 閫氳繃
         * REQUEST_REFUSE 鎷掔粷
         */

        // CQ.setFriendAddRequest(responseFlag, REQUEST_ADOPT, null); // 鍚屾剰濂藉弸娣诲姞璇锋眰
        return MSG_IGNORE;
    }

    /**
     * 璇锋眰-缇ゆ坊鍔� (Type=302)<br>
     * 鏈柟娉曚細鍦ㄩ叿Q銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��<br>
     *
     * @param subtype      瀛愮被鍨嬶紝1/浠栦汉鐢宠鍏ョ兢 2/鑷繁(鍗崇櫥褰曞彿)鍙楅個鍏ョ兢
     * @param sendTime     鍙戦�佹椂闂�(鏃堕棿鎴�)
     * @param fromGroup    鏉ユ簮缇ゅ彿
     * @param fromQQ       鏉ユ簮QQ
     * @param msg          闄勮█
     * @param responseFlag 鍙嶉鏍囪瘑(澶勭悊璇锋眰鐢�)
     * @return 鍏充簬杩斿洖鍊艰鏄�, 瑙� {@link #privateMsg 绉佽亰娑堟伅} 鐨勬柟娉�
     */
    public int requestAddGroup(int subtype, int sendTime, long fromGroup, long fromQQ, String msg,
                               String responseFlag) {
        // 杩欓噷澶勭悊娑堟伅

        /**
         * REQUEST_ADOPT 閫氳繃
         * REQUEST_REFUSE 鎷掔粷
         * REQUEST_GROUP_ADD 缇ゆ坊鍔�
         * REQUEST_GROUP_INVITE 缇ら個璇�
         */
		/*if(subtype == 1){ // 鏈彿涓虹兢绠＄悊锛屽垽鏂槸鍚︿负浠栦汉鐢宠鍏ョ兢
			CQ.setGroupAddRequest(responseFlag, REQUEST_GROUP_ADD, REQUEST_ADOPT, null);// 鍚屾剰鍏ョ兢
		}
		if(subtype == 2){
			CQ.setGroupAddRequest(responseFlag, REQUEST_GROUP_INVITE, REQUEST_ADOPT, null);// 鍚屾剰杩涘彈閭�缇�
		}*/

        return MSG_IGNORE;
    }

    /**
     * 鏈嚱鏁颁細鍦↗CQ銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��
     *
     * @return 鍥哄畾杩斿洖0
     */
    public int menuA() {
        JOptionPane.showMessageDialog(null, "杩欐槸娴嬭瘯鑿滃崟A锛屽彲浠ュ湪杩欓噷鍔犺浇绐楀彛");
        return 0;
    }

    /**
     * 鏈嚱鏁颁細鍦ㄩ叿Q銆愮嚎绋嬨�戜腑琚皟鐢ㄣ��
     *
     * @return 鍥哄畾杩斿洖0
     */
    public int menuB() {
        JOptionPane.showMessageDialog(null, "杩欐槸娴嬭瘯鑿滃崟B锛屽彲浠ュ湪杩欓噷鍔犺浇绐楀彛");
        return 0;
    }

}
