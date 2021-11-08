/**
 * drug业务常用的一些js脚本
 */
// 编辑页面和look页面操作完成返回页面的操作
function returnToIndex() {
    var indexURL = encodeURI(document.location.toString());
    let pageNum = indexURL.GetValue("pageNum");
    let pageSize = indexURL.GetValue("pageSize");
    let drName = indexURL.GetValue("drName");
    let drType = indexURL.GetValue("drType");
    console.log("4:"+indexURL);
    window.location.href="index.html?pageNum=" + pageNum + "&pageSize=" + pageSize + "&drName="+ drName + "&drType="+ drType;
}