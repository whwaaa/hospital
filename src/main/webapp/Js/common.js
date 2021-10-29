/**
 * Created with JetBrains PhpStorm.
 * User: kk
 * Date: 13-8-28
 * Time: 下午4:44
 */
function U() {
    var url = arguments[0] || [];
    var param = arguments[1] || {};
    var url_arr = url.split('/');

    if (!$.isArray(url_arr) || url_arr.length < 2 || url_arr.length > 3) {
        return '';
    }

    if (url_arr.length == 2)
        url_arr.unshift(_GROUP_);

    var pre_arr = ['g', 'm', 'a'];

    var arr = [];
    for (d in pre_arr)
        arr.push(pre_arr[d] + '=' + url_arr[d]);

    for (d in param)
        arr.push(d + '=' + param[d]);

    return _APP_+'?'+arr.join('&');
}

let jwtToken;
document.write("<script src=\"https://cdn.staticfile.org/jquery-cookie/1.4.1/jquery.cookie.min.js\"></script>");
document.write("<script src=\"https://cdn.bootcdn.net/ajax/libs/layer/3.5.1/layer.js\"></script>");
$(function(){
    // TODO: 从cookie中获取jwtToken令牌, 每一个请求都需要带上这个参数, "&jwtToken="+jwtToken
    jwtToken = $.cookie("jwtToken");
})

// ajax配合拦截器跳转登陆界面
function myComplete(xhr, status){
    // 通过xhr取得响应头
    var REDIRECT = xhr.getResponseHeader("REDIRECT");
    // 如果响应头中包含 REDIRECT 则说明是拦截器返回的
    if(REDIRECT == "REDIRECT"){
        // 跳到登陆界面, 传入当前URL作为参数, 登陆成功再跳回来
        let callBackUrL = window.location.href;
        window.location.href = xhr.getResponseHeader("CONTENTPATH") + "?callBackUrL=" + callBackUrL;
    }
}

// 填充分页信息
// TODO: 使用这个函数需要配置两点: 1. 分页信息的div的id值为: pageInfo-box, 2. 查询函数格式: function queryList(pageNum){}
function fillPageData(pageInfo) {
    // 清空div内容
    $("#pageInfo-box").empty();
    let box = "<span id='total'>"+pageInfo.total+"</span> 条记录 <span id='pages'>"+pageInfo.pageNum+"</span>/<span id='pages'>"+pageInfo.pages+"</span>页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;每页显示<select id='pageSize' style='width:42px;position:relative;top:3px;'><option value='5'>5<option value='10'>10</select>条&nbsp;<a id='prePage' href='javascript:queryList("+pageInfo.prePage+")'>上一页</a>";
    // 例: 总页数16, 当前页13, 则显示(Math.ceil(13/5)*5-4)=10 - (Math.ceil(13/5)*4)=15   11-15
    let showPages_start = Math.ceil(pageInfo.pageNum/5)*5 - 4;
    let showPages_end = Math.ceil(pageInfo.pageNum/5)*5<=pageInfo.pages ? Math.ceil(pageInfo.pageNum/5)*5 : pageInfo.pages;
    for(let i=showPages_start; i<=showPages_end; i++){
        if(i == pageInfo.pageNum){ // 是当前页
            box += "<span class='current'>"+pageInfo.pageNum+"</span>"
        }else{  // 非当前页
            if(i != 0)
                box += "<a href='javascript:queryList("+i+")'>"+ i +"</a>"
        }
    }
    // 还有后页
    if(showPages_end < pageInfo.pages){
        box += "<a href='javascript:queryList("+(showPages_end+1)+")'>...</a>"
    }
    box += "<a id='nextPage' href='javascript:queryList("+pageInfo.nextPage+")'>下一页</a><a id='lastPage' href='javascript:queryList("+pageInfo.pages+")'>最后一页</a>";
    $("#pageInfo-box").append($(box));
    // 如果当前页是第一页: 上一页不可用
    if(pageInfo.pageNum == 1){
        $("#prePage").removeAttr("href");
    }
    // 如果是尾页: 尾页和下一页不可用
    if(pageInfo.pageNum == pageInfo.pages){
        $("#nextPage").removeAttr("href");
        $("#lastPage").removeAttr("href");
    }
    // 每页查询条数赋值
    $("#pageSize").val(pageInfo.pageSize);
    // 监听每页显示的值发生变化
    $("#pageSize").bind("input propertychange", function (){
        // 再次查询
        queryList(pageInfo.pageNum);
    })
}
function queryList(pageNum){}



























