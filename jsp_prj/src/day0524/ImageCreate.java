package day0524;

import kr.co.sist.util.img.ImageResize;

public class ImageCreate {

	/**
	 * ���ε�� �̹����� ����Ͽ� �ٸ� ũ���� �̹����� �����ϴ� ��.
	 * �ܺ� ���̺귯���� ���.(������ jar�� Web Content/WEB-INF/lib ������ �ٿ��ְ� ���)
	 * @param originalName �ٸ� ũ��� ������ �̹���
	 */
	public void createImg(String originalName) {
		ImageResize ir=new ImageResize();
		ir.resizeImage("C:/dev/workspace/jsp_prj/WebContent/day0524/"+originalName, 242, 200);
//		ImageResize ir=new ImageResize();
//		ir.resizeImage("C:/dev/workspace/jsp_prj/WebContent/day0524"+originalName, 242, 200);
	}


}
