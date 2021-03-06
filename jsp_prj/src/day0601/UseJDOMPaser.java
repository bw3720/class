package day0601;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class UseJDOMPaser {

	public static void main(String[] args) {
		//1. XML을 읽어들일 수 있는 Paser생성
		SAXBuilder sb = new SAXBuilder();
		//2. XML문서 읽기
		Document doc;
		try {
			//절대경로를 사용하여 java가 실행되는 컴퓨터 HDD에 존재하는 XML파일 읽기. 
			doc = sb.build(new File("C:/dev/workspace/jsp_prj/WebContent/xml0601/hello.xml"));
			//URL을 사용하여 외부서버에서 제공하는 XML파일 읽기.
			//doc = sb.build(new URL("http://localhost/jsp_prj/xml0601/hello.xml"));
			System.out.println(doc);
			//최상위 부모노드(근 노드, root node)
			Element rootNode=doc.getRootElement();
			System.out.println("부모노드"+rootNode);
			//부모노드의 자식노드들 얻기.
			List<Element> msgNodes = rootNode.getChildren();
			System.out.println(msgNodes);
			//자식노드들을 순환하면서 파싱한다.
			for (Element msgNode : msgNodes) {
				//System.out.println(msgNode.getName() + " / " +msgNode.getText());
				if("msg1".equals(msgNode.getName())) {
					System.out.println(msgNode.getText());
				}
			}//end for
			
			
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
	}//main

}//class
