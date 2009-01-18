
function exportExcel(title, queryId, formAction, paras)
{
	var winURL = "/piccaudit/common/pub/ExportExcelPage.jsp";
	var winWidth = 500, winHeight = 260;

	window.open(winURL + "?queryId=" + queryId + "&title=" + title + "&formAction=" + formAction + 
		        "&paras=" + paras,	"",
				"width=" + winWidth + ",height=" + winHeight + "," +
				"top=" + (window.screen.availHeight-winHeight)/2 + "," +
				"left=" + (window.screen.availWidth-winWidth)/2 + "," + 
				"toolbar=0,location=0,directories=0,menubar=1,scrollbars=1,resizable=1,status=1");
}

function openExportWindow(url, parameters)
{
	var pageURL = url + "?" + parameters;
	var winWidth = 700, winHeight = 450;

	window.open(pageURL, "",
				"width=" + winWidth + ",height=" + winHeight + "," +
				"top=" + (window.screen.availHeight-winHeight)/2 + "," +
				"left=" + (window.screen.availWidth-winWidth)/2 + "," + 
				"toolbar=1,location=0,directories=0,menubar=1,scrollbars=1,resizable=1,status=1");
}