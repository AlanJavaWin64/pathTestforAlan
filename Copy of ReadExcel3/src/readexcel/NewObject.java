package readexcel;

import java.io.File;
import java.io.IOException;

import domain.Messaeg;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class NewObject {

	static int g = 0;
	static int h = 0;
	static int mark3 = 1;
	static int mark2 = 0;

	static File file3;
	static File file4;
	static Workbook rwb2;
	static WritableWorkbook wwb2;
	static WritableSheet ws22;

	public static void NewFile(int i) throws Exception {

		file3 = new File("D:/fan/¿Ë—ÙÃÏœË±Í«©ƒ£∞Â1.xls");
		file4 = new File("D:/fancopy/2/" + i + ".xls");

		rwb2 = Workbook.getWorkbook(file3);
		wwb2 = Workbook.createWorkbook(file4, rwb2);

		ws22 = wwb2.getSheet(0);

	}

	public static void Writein(Messaeg ms) throws Exception {

		if (g < 7) {

			if (mark3 < 4) {
				Label label18 = new Label(g, h, ms.getName());
				ws22.addCell(label18);
				label18 = null;
				Label label19 = new Label(g + 1, h, ms.getCellphone());
				ws22.addCell(label19);
				label19 = null;
				g = g + 3;

			}

		}

		if (mark3 == 3) {
			mark3 = 1;
			h = h + 1;
			g = 0;
			mark2++;
		} else {
			mark3 = mark3 + 1;
		}

		if (mark2 == 2) {
			mark2 = 0;
			h = h + 1;

		}

	}

	public static void Write() throws Exception {

		wwb2.write();

	}

	public static void WriteClose() throws Exception {

		wwb2.close();

	}

}
