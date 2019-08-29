package ch10.例子2;

import java.io.File;
import java.io.FilenameFilter;

public class FileAccept implements FilenameFilter {
	private String extendName;

	public void setExtendName(String s) {
		extendName = "." + s;
	}

	public boolean accept(File dir, String name) { // 重写接口中的方法
		return name.endsWith(extendName);
	}
}
