package com.elongway.pss.util;

/**
 * 
 * @author CAFEBABE
 *
 */
import java.io.File;
import java.util.TreeMap;
import com.sinosoft.sysframework.exceptionlog.UserException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
public class ServiceConfig
{

    private static TreeMap ConstTreeMap = null;
    private static boolean isInited = false;

    public ServiceConfig()
    {
    }

    public static boolean isInited()
    {
        return isInited;
    }

    public static synchronized void pushConstTreeMap(String filePath)
        throws Exception
    {
        DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentbuilder = documentbuilderfactory.newDocumentBuilder();
        Document document = documentbuilder.parse(new File(filePath));
        NodeList nodelist = document.getElementsByTagName("Service");
        NodeList nodelist1 = nodelist.item(0).getChildNodes();
        int i = nodelist1.getLength();
        for(int j = 0; j < i; j++)
        {
            if(nodelist1.item(j).getNodeType() != Node.ELEMENT_NODE)
                continue;
            String nodeName = nodelist1.item(j).getNodeName().trim();
            String nodeValue;
            if(!nodelist1.item(j).hasChildNodes())
              nodeValue = "";
            else
              nodeValue = nodelist1.item(j).getFirstChild().getNodeValue();
            ConstTreeMap.put(nodeName, nodeValue);
        }

    }

    public static synchronized void init(String filePath, boolean flag)
        throws Exception
    {
        if(flag || !isInited)
            init(filePath);
    }

    public static synchronized void init(String filePath)
        throws Exception
    {
        ConstTreeMap = new TreeMap();
        pushConstTreeMap(filePath);
        isInited = true;
    }

    public static synchronized void init(String filePath1, String filePath2, boolean flag)
        throws Exception
    {
        if(flag || !isInited)
            init(filePath1, filePath2);
    }

    public static synchronized void init(String s, String s1)
        throws Exception
    {
        ConstTreeMap = new TreeMap();
        pushConstTreeMap(s);
        pushConstTreeMap(s1);
        isInited = true;
    }

    public static String getProperty(String name)
        throws UserException
    {
        String value = null;
//        if(!isInited)
//            throw new UserException("SysConst类没有初始化!");
//        if(name == null)
//            throw new UserException("SysConst.GetProperty()参数为NULL");
//        if(name.trim().length() == 0)
//            throw new UserException("SysConst.GetProperty()参数值为空");
//        value = (String)ConstTreeMap.get(name);
//        if(value == null)
//            throw new UserException("SysConst.GetProperty没有" + name + "配置项");
//        else
            return value;
    }

    public static void setProperty(String name, String value)
        throws UserException
    {
//        if(!ConstTreeMap.containsKey(name))
//        {
//            throw new UserException("SysConst.setProperty没有" + name + "配置项");
//        } else
//        {
            ConstTreeMap.put(name, value);
            return;
//        }
    }

    public static void main(String args[])
    {
        try
        {
            getProperty("");
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

}

