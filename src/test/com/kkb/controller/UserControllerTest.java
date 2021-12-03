package com.kkb.controller;

import com.kkb.mapper.*;
import com.kkb.pojo.*;
import com.kkb.service.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.print.Doc;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

/**
 * ControllerTest
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserControllerTest extends TestCase {

    @Resource
    private UserService userService;
    @Resource
    private BeHospitalMapper beHospitalMapper;
    @Resource
    private ChargeProjectMapper chargeProjectMapper;
    @Resource
    private DoctorMapper doctorMapper;
    @Resource
    private DrugMapper drugMapper;
    @Resource
    private DrugPeopleMapper drugPeopleMapper;
    @Resource
    private HosRegisterMapper hosRegisterMapper;
    @Resource
    private HosrHospitalMiddleMapper hosrHospitalMiddleMapper;
    @Resource
    private MenuMapper menuMapper;
    @Resource
    private PricePeopleMapper pricePeopleMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private RoleMenuMapper roleMenuMapper;
    @Resource
    private UserMapper userMapper;


    @Test
    public void passwd(){
        String str = "1234567890QWERTYUIOPLKJHGFDSAZXCVBNMqwertyuioplkjhgfdsazxcvbnm!_.";
        int index;
        int num;
        List<String> passList = new ArrayList<>();
        for(int j=0; j<40; j++){
            num = (int) Math.floor(Math.random() * 5) + 10;
            StringBuilder stringBuilder;
            String test1 = ".*[!_.]+.*";
            String test2 = ".*[A-Z]+.*";
            String test3 = ".*[a-z]+.*";
            String test4 = ".*[0-9]+.*";
            String passStr;
            do{
                stringBuilder = new StringBuilder();
                for(int i=0; i<num; i++){
                    index = (int) Math.floor(Math.random() * str.length());
                    stringBuilder.append(str.charAt(index));
                }
                passStr = stringBuilder.toString();
            }while(!passStr.matches(test1) ||
                    !passStr.matches(test2) ||
                    !passStr.matches(test3) ||
                    !passStr.matches(test4));

            passList.add(passStr);
        }
        System.out.print("{");
        for (String s : passList) {
            System.out.print("\"" + s + "\", ");
        }
        System.out.print("}");
    }

    @Test
    public void roleId(){
        int 管理员 = 11;
        int 药品管理员 = 12;
        int 医生 = 13;
        int 医院前台 = 14;
        int 专员办理员 = 15;
        List<Integer> list = new LinkedList<>();
        for(int i=0; i<27; i++){
            list.add(医生);
        }
        for(int i=0; i<3; i++){
            list.add(管理员);
        }
        for(int i=0; i<4; i++){
            list.add(药品管理员);
        }
        for(int i=0; i<3; i++){
            list.add(医院前台);
        }
        for(int i=0; i<3; i++){
            list.add(专员办理员);
        }
        System.out.print("{");
        for (Integer i : list) {
            System.out.print(i + ", ");
        }
        System.out.println("}");
    }

    @Test
    public void getDateAgeSex() {
        String[] doctorIdCard = {"110102197610017148","110102197610017164","110102197610017180","110102197610017201","110102197610017228","110102197610017244","110102197610017260","320100198506020794","320100198506020815","320100198506020831","320100198506020858","320100198506020874","320100198506020890","320100198506020911","320100198506020938","110102197610017148","110102197610017164","110102197610017180","110102197610017201","110102197610017228","110102197610017244","110102197610017260","320100198506020794","320100198506020815","320100198506020831","320100198506020858","320100198506020874","320100198506020890","320100198506020911","320100198506020938","110101199003071022","110101199003079446","110101199003077723","110101199003070388","110101199003079761","310101199903074269","31010119990307092X","310101199903079449","310101199903078403","310101199903072685"};
//        String[] behIdCard = {"110101200006183906","110101200006181708","110101200006187069","320602200109287647","110101199003070257","110101199003079577","110101199003078515","110101199003071719","110101199003071997","320602200109284403","320602200109281069","430102199906169881","430102199906165389","43010219990616006X","430102199906160342","43010219990616524X","410102199904185729","410102199904186924","43010219960307261X","430102199603070470","430102199603079977","430102199603072919","430102199603074770","41010219990418294X","410102199904180303","410102199904186764","320602200109282184","320602200109287049","110101200006180721","110101200006181644"};
        String[] idCards = doctorIdCard;
        // 获取出身年月日
        System.out.print("{");
        for (String idcard : idCards) {
            String year = idcard.substring(6, 10);
            String month = idcard.substring(10, 12);
            String day = idcard.substring(12, 14);
            String dateStr = year + "-" + month + "-" + day;
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            Date date = null;
//            try {
//                date = sdf.parse(dateStr);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//            System.out.println(date.toLocaleString());
            System.out.print("\"" + dateStr + "\",");
        }
        System.out.println("}");

        // 获取年龄
        System.out.print("{");
        for (String idCard : idCards) {
            int year = Integer.parseInt(idCard.substring(6,10));
            int month = Integer.parseInt(idCard.substring(10,12));
            int day = Integer.parseInt(idCard.substring(12,14));
            Calendar instance = Calendar.getInstance();
            int nowYear = instance.get(Calendar.YEAR);
            int nowMonth = instance.get(Calendar.MONTH) + 1;
            int nowDay = instance.get(Calendar.DAY_OF_MONTH);
            int age;
            if(nowMonth - month > 0){   // 年龄即年份相减 || 月分相等, 日相等或更大, 即刚好满岁或不超出一个月 -> 年龄即年份相减
                age = nowYear - year;
            }else{ // 年龄即年份相减再减一 || 今年生日没到 -> 年龄即年份相减再减一
                age = nowYear - year - 1;
            }
            System.out.print(age + ",");
        }
        System.out.println("}");

        // 获取性别
        System.out.print("{");
        for (String idCard : idCards) {
            int i = Integer.parseInt(idCard.substring(16, 17))%2;
            System.out.print(i + ", ");
        }
        System.out.println("}");
    }


    @Test
//    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void addUser() throws ParseException {
        // 登录名(40)
        String[] loginName = {"邮寄夏日", "小生不乱来", "Allabout_Jay", "今晚也不睡噢", "心有千千结乄", "邮寄夏日", "记得冬天见一面", "康超宠琪", "琪小姐_GiKx", "七情梦凝雪", "此号以换--逸飞", "七情梦凝雪", "美女选手小婧", "今天的奶茶一样甜", "记得冬天见一面", "爽歪歪ying", "Dear211123", "等睡醒了明天我还喜欢你", "韵见", "邮寄夏日", "心有千千结乄", "东城向西", "小方方方方方方方v", "今天的奶茶一样甜", "康超宠琪", "此号以换--逸飞", "偏爱_l8Ys", "无言对望", "心有千千结乄", "记得冬天见一面", "啊哈嘚嘚", "琪小姐_GiKx", "七情梦凝雪", "Dear211123", "等睡醒了明天我还喜欢你", "还好吧过一会吧", "记得冬天见一面", "总会被谁替代", "记得冬天见一面", "今天的奶茶一样甜"};
        // 真实姓名(40)
        String[] trueName = {"谯雅雯","溥诗","祭照南","华佗","张仲景","皇甫谧","叶桂","孙思邈","薛生白","宋慈","李时珍","葛洪","景彤","应甜雅","姒丹","阴凌熙","盖树泽","凭月","战爱霖","承钧溢","堵玉轩","冯皓","弭弋","廖雨泽","可琳贺","养沐希","栾昕","闭柯","环兴翰","高童","戏帆","逯珂簪","睢梓豪","巫怡博","渠琪","漆宇航","仲阳阳","后米阳","貊致远","颜统思","庹树涵"};
        // 密码(40)
        String[] passwd = {"ed8C9Ra_Va0m", "duFwE!p9IS", "rjVN1s1lxGK_", "_2mXmBsaKK", "!t8GyDzxde8", "zQnEVNMukqv_4b", "5FoSb0WJC.", "!gyq4qa2_YT8", "uV5df_6CQTUR", "nHgW!098YWJO.", "j!2XjD6R4Vo.", "YcgQXXtlJ_2A", "DbdaS5X!bF", "UEkk6p_W!Y8l", "IowfWx85S_T_y", "flbB!Jd3Pd", "qH4d0Fg_bZ3", "PISCV_.y2q", "RZZ4UwDscj.", "A06yinXTx_X", "SnDY.VV82T.BE", "0T27pgj_3ve", "CKJ_0IHfpt", "cSmUp3K.NC_lv!", "r72hC!VgqvLpL", "9HUr0v9_kZ", "6.yY3kxw3CRZ", "5afMP3F19T.Ll", "T6_uxDKG6yW", "3X3ygad_DPij", "iDqYV32_7J", "PV0Bdx!E8i7H", "!.UZVVcx2i", "V4facS_JY9i", "pT.4Ulhq6Y", "q_hv0!9K_PGd", "h8nu3LLOJ.Pt8Q", "0A03aSNVM5.oWt", "FP2_FDl_WXArUY", "Jsu3QgQ!fGFZ0K"};
        // 邮箱(40)
        String[] email = {"dmslodejqlf@35.com","anlgiin@sogou@com","hdrcmph@sohu.com","dcpapsmc@eastday.com","umalwhptvqdq@sohu.com","bfor@tom.com","mbgtbgfau@tom.com","fokkmgpsrtt@citiz.com","lkwbwjer@email.com.cn","nsgejpcpvf@163.com","bodlwvwrqppmhog@35.com","lkwol@sina.com","gbgcpeudrniiuk@yeah.net","stkucqtr@yahoo.com.cn","okrwgnqm@sogou@com","ptcmr@sogou@com","rgvgnafdsa@msn.com","nfl@xinhuanet","mkirgroifnm@citiz.com","vcnuclloajmtlmq@email.com.cn","pee@tom.com","hebklgv@enet.com.cn","pebcvvq@xinhuanet","ddmb@enet.com.cn","seuhouirivsis@sogou@com","eqpvuojksdu@126.com","aejgjdpgj@163.net","mgkpdcmulw@email.com.cn","tcugirceqieqdmm@etang.com","wqscwjneqgpnabe@eastday.com","ndl@hotmail.com","mgjwecqmonnelg@263.net","uqhbp@eyou.com","nqhwpivik@etang.com","empwelleobasm@email.com.cn","kqketnbttftdadp@265.com","jscopu@sohu.com","mlsinvras@msn.com","ugvccptrhhkavsu@yahoo.com.cn","tfrswig@citiz.com"};
        // 角色(40)
        int[] roleId = {13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 11, 11, 11, 12, 12, 12, 12, 14, 14, 14, 15, 15, 15};

        // 医生数(27)
        int doctorNum = 27;
        // 医生身份证号(40)
        String[] doctorIdCard = {"110102197610017148","110102197610017164","110102197610017180","110102197610017201","110102197610017228","110102197610017244","110102197610017260","320100198506020794","320100198506020815","320100198506020831","320100198506020858","320100198506020874","320100198506020890","320100198506020911","320100198506020938","110102197610017148","110102197610017164","110102197610017180","110102197610017201","110102197610017228","110102197610017244","110102197610017260","320100198506020794","320100198506020815","320100198506020831","320100198506020858","320100198506020874","320100198506020890","320100198506020911","320100198506020938","110101199003071022","110101199003079446","110101199003077723","110101199003070388","110101199003079761","310101199903074269","31010119990307092X","310101199903079449","310101199903078403","310101199903072685"};
        // 对应生日
        String[] doctorBirth = {"1976-10-01","1976-10-01","1976-10-01","1976-10-01","1976-10-01","1976-10-01","1976-10-01","1985-06-02","1985-06-02","1985-06-02","1985-06-02","1985-06-02","1985-06-02","1985-06-02","1985-06-02","1976-10-01","1976-10-01","1976-10-01","1976-10-01","1976-10-01","1976-10-01","1976-10-01","1985-06-02","1985-06-02","1985-06-02","1985-06-02","1985-06-02","1985-06-02","1985-06-02","1985-06-02","1990-03-07","1990-03-07","1990-03-07","1990-03-07","1990-03-07","1999-03-07","1999-03-07","1999-03-07","1999-03-07","1999-03-07"};
        // 对应年龄
        int[] doctorAge = {45,45,45,45,45,45,45,36,36,36,36,36,36,36,36,45,45,45,45,45,45,45,36,36,36,36,36,36,36,36,31,31,31,31,31,22,22,22,22,22};
        // 对应性别
        int[] doctorSex = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        // 科室
        String[] keshi = {"急诊科","骨科","血液科","皮肤科","内科","外科","儿科","中医科","口腔科","眼科","麻醉科","药剂科","放射科","手术室","输血科","理疗科","急诊科","骨科","血液科","皮肤科","内科","外科","儿科","中医科","口腔科","眼科","麻醉科"};
        // 学历
        String[] xtli = {"专科","本科","硕士","博士","博士后","专科","本科","硕士","博士","博士后","专科","本科","硕士","博士","博士后","专科","本科","硕士","博士","博士后","专科","本科","硕士","博士","博士后","博士","博士后"};
        // 备注 "此医生太懒,没有备注"

        // 病人姓名(30)
        String[] behName = {"魏菲","朱娆","余静","曹紫","姜缨","罗卿","赖妃","钱钗","唐烟","梁紫","唐融","郑冷","顾晶","李好","徐融","郝苹","袁梦","汪蓓","刘家颖","周千亦","李羽莹","廖访蕊","范念寒","范惠玲","宋鲲","田言","康洲","李振","萧昮","马鲲"};
        // 病人身份证号,社保号(30)
        String[] behIdCard = {"110101200006183906","110101200006181708","110101200006187069","320602200109287647","110101199003070257","110101199003079577","110101199003078515","110101199003071719","110101199003071997","320602200109284403","320602200109281069","430102199906169881","430102199906165389","43010219990616006X","430102199906160342","43010219990616524X","410102199904185729","410102199904186924","43010219960307261X","430102199603070470","430102199603079977","430102199603072919","430102199603074770","41010219990418294X","410102199904180303","410102199904186764","320602200109282184","320602200109287049","110101200006180721","110101200006181644"};
        // 对应生日
        String[] behBirth = {"2000-06-18","2000-06-18","2000-06-18","2001-09-28","1990-03-07","1990-03-07","1990-03-07","1990-03-07","1990-03-07","2001-09-28","2001-09-28","1999-06-16","1999-06-16","1999-06-16","1999-06-16","1999-06-16","1999-04-18","1999-04-18","1996-03-07","1996-03-07","1996-03-07","1996-03-07","1996-03-07","1999-04-18","1999-04-18","1999-04-18","2001-09-28","2001-09-28","2000-06-18","2000-06-18"};
        // 对应年龄
        int[] behAge = {21,21,21,20,31,31,31,31,31,20,20,22,22,22,22,22,22,22,25,25,25,25,25,22,22,22,20,20,21,21};
        // 对应性别
        int[] behSex = {0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        // 用户手机号(40)
        String[] userPhone = {"15562608508","17088467967","13865574031","13122923889","15594536087","14581876708","13467347340","18254923704","13629802890","17520503770","18259906941","13972264119","19818813260","13653777449","15274345430","13752628564","17306825599","19803334482","13756829229","13828874555","17584146882","13778127863","16638013292","13428471609","13916806848","18352212118","15233836356","18854304739","18315498268","15024929626","18547355192","16537735023","13234082111","18171052708","17330984767","19987804900","18420571392","15261146129","13292252319","13731089267"};
        // 病人手机号(30)
        String[] behPhone = {"18152319703","18000015485","18481333893","19925055410","15374308412","13360351903","18960698331","14511266101","18002733763","19186057426","13439968454","15631863856","17510979415","15594855590","18657069013","13250778367","13945796846","13320073278","15698217409","17097824648","13640461178","13529431500","13747148202","19984139115","17805235361","15669617403","13236215705","13056622506","19973534700","17663992264"};
        // 备注 此人疑似神经有问题
        // 职业
        String[] work = {"司机","军人","律师","商人","学生","学生","学生","学生","店员","学生","学生","画家","教师","学生","导游","学生","学生","学生","学生","学生","消防员","理发师","学生","学生","学生","学生","学生","学生","飞行员","理发师"};

//        // 创建用户信息
//        List<User> userList = new ArrayList<>();
//        for(int i=0; i<40; i++){
//            User user = new User();
//            user.setuId(i+1);
//            user.setuLoginName(loginName[i]);
//            user.setuPassword(passwd[i]);
//            user.setuTrueName(trueName[i]);
//            user.setuEmail(email[i]);
//            user.setuState(0);
//            user.setrId(roleId[i]);
//            user.setuCreateTime(new Date());
//            userList.add(user);
//            userMapper.insertSelective(user);
//        }
//        // 创建医生信息
//        List<Doctor> doctorList = new ArrayList<>();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        for(int i=0; i<doctorNum; i++){
//            Doctor doctor = new Doctor();
//            doctor.setdId(i+1);
//            doctor.setdIdCar(doctorIdCard[i]);
//            doctor.setdPhone(userPhone[i]);
//            doctor.setdTelphone(userPhone[i]);
//            doctor.setdSex(doctorSex[i]);
//            doctor.setdBirthday(sdf.parse(doctorBirth[i]));
//            doctor.setdAge(doctorAge[i]);
//            doctor.setdEmail(email[i]);
//            doctor.setdKeshi(keshi[i]);
//            doctor.setdXueli(xtli[i]);
//            doctor.setdDesc("此医生太懒,没有备注");
//            doctor.setdIntime(new Date());
//            doctor.setdState(0);
//            doctor.setuId(i+1);
//            doctorList.add(doctor);
//            doctorMapper.insertSelective(doctor);
//        }
        // 创建病人挂号信息
        List<HosRegister> hosRegisterList = new ArrayList<>();
        for(int i=0; i<30; i++){
            HosRegister hosRegister = new HosRegister();
            hosRegister.setHosrId(i+1001);
            hosRegister.setHosrName(behName[i]);
            hosRegister.setHosrIdcar(behIdCard[i]);
            hosRegister.setHosrMedical(behIdCard[i]);
            hosRegister.setHosrRegPrice(new BigDecimal("100"));
            hosRegister.setHosrPhone(behPhone[i]);
            hosRegister.setHosrSelfPrice(0);
            hosRegister.setHosrSex(behSex[i]);
            hosRegister.setHosrAge(behAge[i]);
            hosRegister.setHosrWork(work[i]);
            hosRegister.setHosrLookDoctor("0");
            // 医生1-27
            hosRegister.setdId((int)Math.ceil((float)(Math.random()*260+10)/10));
            hosRegister.setHosrRemark("此人疑似精神病");
            hosRegister.setHosrState(0);
            hosRegister.setHosrCreateTime(new Date());
            hosRegisterList.add(hosRegister);
            hosRegisterMapper.insertSelective(hosRegister);
        }

        System.out.println("ok");
    }



    @Test
    public void testQueryById() {
        String str = "110101200006183906";
        int i = Integer.parseInt(str.substring(16, 17));
        System.out.println(i);
    }

    @Test
    public void testAddUser() {
        int[] nums = new int[1000];
        for(int i=0; i<1000; i++){
            nums[i] = (int)Math.ceil((float)(Math.random()*260+10)/10);
        }
        Arrays.sort(nums);
        System.out.println(nums.toString());
    }

    @Test
    public void testDeleteById() {
        User user = new User();
        user.setuId(21);
        user.setuIsDel(1);
        user.setuUpdateTime(new Date());
        int i = userMapper.updateByPrimaryKeySelective(user);
    }

    public void testUpdateById() {
    }
}