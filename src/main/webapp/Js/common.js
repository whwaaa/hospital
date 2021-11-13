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

// 获取地址参数
String.prototype.GetValue= function(para) {
    let reg = new RegExp("(^|&)"+ para +"=([^&]*)(&|$)");
    let r = this.substr(this.indexOf("\?")+1).match(reg);
    if (r!=null) return unescape(r[2]); return null;
}

// 优先取URI地址参数
let globalPageNum = document.location.toString().GetValue("pageNum");
if(globalPageNum == undefined || globalPageNum == '' || globalPageNum == 'null'){
    // URI为空取分页模块参数
    globalPageNum = $(".current").text();
    if(globalPageNum == undefined || globalPageNum == '' || globalPageNum == 'null'){
        // 分页为空赋初值
        globalPageNum = 1;
    }
}
// 首次优先取URI地址参数
let globalPageSize = document.location.toString().GetValue("pageSize");
if(globalPageSize == undefined || globalPageSize == '' || globalPageSize == 'null'){
    // URI为空取分页模块参数
    globalPageSize = $("#pageSize").val();
    if(globalPageSize == undefined || globalPageSize == '' || globalPageSize == 'null'){
        // 分页为空赋初值
        globalPageSize = 10;
    }
}


// ajax配合拦截器跳转登陆界面
function myComplete(xhr, status){
    // 通过xhr取得响应头
    let REDIRECT = xhr.getResponseHeader("REDIRECT");
    let TOKEN_MSG = xhr.getResponseHeader("TOKEN-MSG");
    // 如果响应头中包含 REDIRECT 则说明是拦截器返回的
    if(REDIRECT == "REDIRECT"){
        layer.closeAll()
        if(TOKEN_MSG == "no-token"){
            layer.msg("请先登陆")
        }else if(TOKEN_MSG == "token-invalid"){
            layer.msg("登陆信息过期,请再次登陆")
        }
        // 跳到登陆界面, 传入当前URL作为参数, 登陆成功再跳回来
        setTimeout(function (){
            let callBackUrL = window.location.href;
            console.log(callBackUrL)
            window.location.href = xhr.getResponseHeader("CONTENTPATH") + "?callBackUrL=" + callBackUrL;
        }, 1500)
    }

}

// 填充分页信息
// TODO: 使用这个函数需要配置两点: 1. 分页信息的div的id值为: pageInfo-box, 2. 查询函数格式: function queryList(pageNum){}
function fillPageData(pageInfo) {
    // 清空div内容
    $("#pageInfo-box").empty();
    let box = "<span></span>共 <span id='total'>"+pageInfo.total+"</span>条记录 <span id='pages'>"+pageInfo.pageNum+"</span>/<span id='pages'>"
        +pageInfo.pages+"</span>页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;每页显示" +
        "<select id='pageSize' style='width:42px;position:relative;top:3px;'>" +
        "<option value='5'>5<option value='7'>7<option value='10'>10" +
        "<option value='13'>13</select>条&nbsp;" +
        "<a id='firstPage' href='javascript:queryList(1)'>首页" +
        "</a><a id='prePage' href='javascript:queryList("+pageInfo.prePage+")'>上一页</a>";
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
    // 如果当前页是第一页: 上一页,首页不可用
    if(pageInfo.pageNum == 1){
        $("#firstPage").removeAttr("href");
        $("#prePage").removeAttr("href");
    }
    // 如果是尾页: 尾页和下一页不可用
    if(pageInfo.pageNum === pageInfo.pages || pageInfo.nextPage === 0){
        $("#nextPage").removeAttr("href");
        $("#lastPage").removeAttr("href");
    }
    // 每页查询条数赋值
    $("#pageSize").val(pageInfo.pageSize);
    // 监听每页显示的值发生变化
    $("#pageSize").bind("input propertychange", function (){
        // 再次查询
        globalPageSize = $("#pageSize").val();
        queryList(pageInfo.pageNum);
    })
}
function queryList(pageNum){}

/**
 *  get请求方式，导出Excel数据
 * @param url 导出excel的请求地址。如果导出的数据包含查询条件，请拼接到地址中。
 * @param fileName 导出的文件名，不含后缀
 * @param list 若选中数据，则传入选中记录的主键数组；否则导出全部的数据，则设置为null或[]。
 * @param paramName 若导出选中的记录，需要设置与后端@RequestParam的值（value）相同;否则导出全部，则设置为""或null。
 */
function reqExport(url,fileName,list,paramName){
    layer.confirm('确定导出数据吗？', {
        btn: ['确认','取消'],//按钮
        title: '提示'
    }, function(){
        // list 不为空
        if (list&&list.length>0){
            let paramUrl = "";
            for (let i = 0; i < list.length; i++) {
                paramUrl = paramUrl + "&" + paramName + "=" + list[i];
            }
            url = url + "?"+ paramUrl.substr(1,paramUrl.length-1);
        }
        layer.msg('请求已发送', {icon: 1});
        let xhr = new XMLHttpRequest();
        xhr.open('GET', url, true);    // 也可以使用POST方式，根据接口
        xhr.responseType = "blob";  // 返回类型blob
        // 定义请求完成的处理函数，请求前也可以增加加载框/禁用下载按钮逻辑
        xhr.onload = function () {
            // 请求完成
            if (this.status === 200) {
                // 返回200
                let blob = this.response;
                let reader = new FileReader();
                reader.readAsDataURL(blob);  // 转换为base64，可以直接放入a标签的href
                reader.onload = function (e) {
                    // 转换完成，创建一个a标签用于下载
                    var a = document.createElement('a');
                    a.download = fileName + '.xlsx';
                    a.href = e.target.result;
                    $("body").append(a);  // 修复firefox中无法触发click
                    a.click();
                    $(a).remove();
                    layer.msg('导出成功!');
                }
                // 导出失败的处理
                let obj = JSON.parse(this.responseText);
                if (obj.code!=null){
                    layer.msg(obj.msg);
                }
            }else {
                layer.msg("导出失败!");
            }
        };
        // 发送ajax请求
        xhr.send();
    }, function(){
        layer.msg('导出已取消');
    });
}