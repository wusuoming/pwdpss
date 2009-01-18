<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Language" content="zh-cn"/>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>
<title>用户列表</title>
<!--css start-->
<link rel="stylesheet" type="text/css" href="../js/tabview/assets/tabview.css"/>
<link rel="stylesheet" type="text/css" href="../js/tabview/assets/border_tabs.css"/>
<link rel="stylesheet" type="text/css" href="../js/popselect.css" />
<link rel="stylesheet" type="text/css" media="screen" href="../style/basic.css" />
<style type="text/css">a {behavior:url(../style/delDashedLine.htc)}</style>

<!--css end-->
<script type="text/javascript" src="../js/prototype.js"></script>
<script type="text/javascript" src="../js/lightbox.js"></script>
<script type="text/javascript" src="../js/scriptaculous.js?load=effects"></script>
<script type="text/javascript" src="../js/reflection.js"></script>
<script type="text/javascript" src="../js/changestyle.js"></script>
<script type="text/javascript" src="../js/time/yahoo.js"></script>
<script type="text/javascript" src="../js/time/event.js" ></script>
<script type="text/javascript" src="../js/time/dom.js" ></script>
<script type="text/javascript" src="../js/time/calendar.js"></script>
<script type="text/javascript" src="../js/time/time.js"></script>
<script type="text/javascript" src="../js/popup/show_window.js"></script>
<script type="text/javascript" src="../js/table_add/yahoo.js"></script>
<script type="text/javascript" src="../js/table_add/event.js" ></script>
<script type="text/javascript" src="../js/table_add/dom.js" ></script>
<script type="text/javascript" src="../js/table_add/logger.js"></script>
<script type="text/javascript" src="../js/table_add/datasource-beta-debug.js"></script>
<script type="text/javascript" src="../js/table_add/datatable-beta-debug.js"></script>
<script type="text/javascript" src="../js/table_add/data.js"></script>
<script type="text/javascript" src="../js/table_add/data2.js"></script>
<script type="text/javascript" src="../js/tabber/tabber.js" ></script>
<script type="text/javascript" src="../js/element/element-beta.js"></script>
<script type="text/javascript" src="../js/tabview/tabview.js"></script>
<!--自动下拉列表JS-->
<script type="text/javascript" src="../js/build/yahoo-dom-event/yahoo-dom-event.js"></script>
<script type="text/javascript" src="../js/build/element/element-beta-min.js"></script>
<script type="text/javascript" src="../js/build/connection/connection-min.js"></script>
<script type="text/javascript" src="../js/build/container/container-min.js"></script>
<script type="text/javascript" src="../js/build/tabview/tabview.js"></script>
<script type="text/javascript" src="../js/build/autocomplete/autocomplete-debug.js"></script>
<script type="text/javascript" src="../js/build/animation/animation.js"></script>
<script type="text/javascript" src="../js/claim.js"></script>

<script type="text/javascript">
document.write('<style type="text/css">.tabber{display:none;}<\/style>');
</script>

<style type="text/css">
#demo { width:100%; }
#demo .yui-content { padding:0px; } /* pad content container */
</style>
</head>
<body id="all_title">
  <div id="container">
    <!--CONTENT BEGIN-->
    <div id="content">
      <form id="formQuery" style="display:block;">
        <table class="fix_table" border="0">
          <tr>
            <td class="bgc_tt short">户号</td>
            <td class="long"><input name="UserNo" type="text" class="input_w w_8"  /></td>
			<td class="bgc_tt">户名</td>
           <td class="long"><input name="UserName" type="text" class="input_w w_8"  /></td>
          </tr>
          <tr>
            <td class="bgc_tt">线路代码</td>
            <td class="long"><input name="LineCode" type="text" class="input_w w_8" value="" /></td>
			<td class="bgc_tt">效力状态</td>
            <td><input name="ValidStatus" type="radio" checked="checked"/>有效
                <input name="ValidStatus" type="radio" />无效<span class="warning">*</span></td>
          </tr>
		  <tr><td class="bgc_tt short" colspan="4" align="center"><input name="button" type="button" class="btn_zoom" value=" 查 询 " /></td>
</tr>
        </table>
      </form>
     <br />
	<div class="sort">
	<table>
		<tr>
			<th class="thborder">选择</th>
			<th class="thborder">户号</th>
			<th class="thborder">户名</th>
			<th class="thborder">线路代码</th>
			<th class="thborder">是否有效</th>
			<th class="thborder">注释</th>
			<th class="thborder">操作</th>
		</tr>
		<tr>
			<td class="yui-dt-odd"><input type="checkbox"></td>
			<td class="yui-dt-odd">UserNo</td>
			<td class="yui-dt-odd">UserName</td>
			<td class="yui-dt-odd">LineCode</td>
			<td class="yui-dt-odd">ValidStatus</td>
			<td class="yui-dt-odd">Remark</td>
			<td class="yui-dt-odd"><a href="JavaScript:alert('点击删除记录！');">删除</a></td>
		</tr>
		
		<tr><td colspan="10" class="yui-dt-odd">第1页/第1-10条共120条  下一页  尾页 </td></tr>
	</table>
  </div>

      <br />

  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">
      <tr>
        <td><div class="button_img1"><a href="javascript:addUser();">增  加</a></div></td>
        <td><div class="button_img2"><a href="javascript:delUser();">删  除</a></div></td>
        <td><div class="button_img3"><a href="javascript:editUser();">修  改</a></div></td>
		<td><div class="button_img3"><a href="javascript:cancelUser();">设置无效</a></div></td>
      </tr>
    </table>
<script language="javascript">
function addUser(){
	this.location="addLWUserLine.html;
	parent.right_top.spaninfo.innerHTML="用户线路信息管理 >> 功能管理 >> 添加用户";
}

function editUser(){
	this.location="modifyLWUserLine.html";
	parent.right_top.spaninfo.innerHTML="用户线路信息管理 >> 功能管理 >> 修改用户";
}

function delUser(){
	alert("批量删除记录！");
}

function cancelUser(){
	alert("将选中记录设置为无效！");
}
</script>
<br />
    </div>
    <!--CONTENT OVER-->
  </div>

</body>
</html>
