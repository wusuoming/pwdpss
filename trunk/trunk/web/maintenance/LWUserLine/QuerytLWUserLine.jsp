<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Language" content="zh-cn"/>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>
<title>�û��б�</title>
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
<!--�Զ������б�JS-->
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
            <td class="bgc_tt short">����</td>
            <td class="long"><input name="UserNo" type="text" class="input_w w_8"  /></td>
			<td class="bgc_tt">����</td>
           <td class="long"><input name="UserName" type="text" class="input_w w_8"  /></td>
          </tr>
          <tr>
            <td class="bgc_tt">��·����</td>
            <td class="long"><input name="LineCode" type="text" class="input_w w_8" value="" /></td>
			<td class="bgc_tt">Ч��״̬</td>
            <td><input name="ValidStatus" type="radio" checked="checked"/>��Ч
                <input name="ValidStatus" type="radio" />��Ч<span class="warning">*</span></td>
          </tr>
		  <tr><td class="bgc_tt short" colspan="4" align="center"><input name="button" type="button" class="btn_zoom" value=" �� ѯ " /></td>
</tr>
        </table>
      </form>
     <br />
	<div class="sort">
	<table>
		<tr>
			<th class="thborder">ѡ��</th>
			<th class="thborder">����</th>
			<th class="thborder">����</th>
			<th class="thborder">��·����</th>
			<th class="thborder">�Ƿ���Ч</th>
			<th class="thborder">ע��</th>
			<th class="thborder">����</th>
		</tr>
		<tr>
			<td class="yui-dt-odd"><input type="checkbox"></td>
			<td class="yui-dt-odd">UserNo</td>
			<td class="yui-dt-odd">UserName</td>
			<td class="yui-dt-odd">LineCode</td>
			<td class="yui-dt-odd">ValidStatus</td>
			<td class="yui-dt-odd">Remark</td>
			<td class="yui-dt-odd"><a href="JavaScript:alert('���ɾ����¼��');">ɾ��</a></td>
		</tr>
		
		<tr><td colspan="10" class="yui-dt-odd">��1ҳ/��1-10����120��  ��һҳ  βҳ </td></tr>
	</table>
  </div>

      <br />

  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">
      <tr>
        <td><div class="button_img1"><a href="javascript:addUser();">��  ��</a></div></td>
        <td><div class="button_img2"><a href="javascript:delUser();">ɾ  ��</a></div></td>
        <td><div class="button_img3"><a href="javascript:editUser();">��  ��</a></div></td>
		<td><div class="button_img3"><a href="javascript:cancelUser();">������Ч</a></div></td>
      </tr>
    </table>
<script language="javascript">
function addUser(){
	this.location="addLWUserLine.html;
	parent.right_top.spaninfo.innerHTML="�û���·��Ϣ���� >> ���ܹ��� >> ����û�";
}

function editUser(){
	this.location="modifyLWUserLine.html";
	parent.right_top.spaninfo.innerHTML="�û���·��Ϣ���� >> ���ܹ��� >> �޸��û�";
}

function delUser(){
	alert("����ɾ����¼��");
}

function cancelUser(){
	alert("��ѡ�м�¼����Ϊ��Ч��");
}
</script>
<br />
    </div>
    <!--CONTENT OVER-->
  </div>

</body>
</html>
