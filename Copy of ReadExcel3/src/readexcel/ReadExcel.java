package readexcel;

import java.io.File;
import java.io.FileInputStream;

import java.io.InputStream;

import domain.Messaeg;

import jxl.Cell;
import jxl.SheetSettings;

import jxl.Sheet;

import jxl.Workbook;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ReadExcel {

	static int fileCount = 1;

	public static void main(String[] args)

	{
		int fanren = 1;
		int count = 1;

		Messaeg ms = new Messaeg();

		jxl.Workbook readwb = null;

		try

		{

			// 构建Workbook对象, 只读Workbook对象

			// 直接从本地文件创建Workbook

			InputStream instream = new FileInputStream(
					"D:/fan/fanproject/2016.4.22开卡.xls");

			readwb = Workbook.getWorkbook(instream);

			// Sheet的下标是从0开始

			// 获取第一张Sheet表

			Sheet readsheet = readwb.getSheet(2);

			// 获取Sheet表中所包含的总列数

			// int rsColumns = readsheet.getColumns();

			// 获取Sheet表中所包含的总行数

			// int rsRows = readsheet.getRows();

			// 获取指定单元格的对象引用

			// 由于程序原因 一次只能读写48个为
			NewObject.NewFile(fileCount);
			// 727
			for (int i = 3; i < 952; i++)

			{

				for (int j = 0; j < 10; j++)

				{

					Cell cell = readsheet.getCell(j, i);

					if (j == 0) {

						ms.setFirst(cell.getContents());
					}

					if (j == 1) {

						ms.setName(cell.getContents());
					}
					if (j == 2) {
						ms.setNumberS(cell.getContents());
					}
					if (j == 3) {

						ms.setDate(cell.getContents());
					}
					if (j == 4) {

						ms.setCellphone(cell.getContents());

					}
					if (j == 5) {

						ms.setLocalhost(cell.getContents());
					}
					if (j == 9) {

						ms.setNumberK(cell.getContents());
					}
				}
				// 读取完一行的数据

				File file1 = new File("D:/fan/特殊业务申请书-样式  - 副本.xls");
				File file2 = new File("D:/fancopy/1/" + ms.getFirst()
						+ ms.getName() + ".xls");

				Workbook rwb = Workbook.getWorkbook(file1);

				WritableWorkbook wwb = Workbook.createWorkbook(file2, rwb);

				WritableSheet ws = wwb.getSheet(0);
				WritableSheet ws223 = wwb.getSheet(1);
				SheetSettings settings = ws223.getSettings();

				settings.setScaleFactor(95);

				Label label = new Label(5, 2, ms.getName());
				ws.addCell(label);
				label = null;
				Label label2 = new Label(1, 3, "身份证");
				ws.addCell(label2);
				label2 = null;
				Label label3 = new Label(2, 3, ms.getNumberS());
				ws.addCell(label3);
				label3 = null;
				Label label4 = new Label(6, 3, ms.getDate());
				ws.addCell(label4);
				label4 = null;
				Label label5 = new Label(1, 4, ms.getCellphone());
				ws.addCell(label5);
				label5 = null;
				Label label6 = new Label(1, 5, ms.getLocalhost());
				ws.addCell(label6);
				label6 = null;
				Label label7 = new Label(5, 5, ms.getCellphone());
				ws.addCell(label7);
				label7 = null;
				Label label8 = new Label(1, 2, ms.getNumberK());
				ws.addCell(label8);
				label8 = null;

				wwb.write();
				wwb.close();

				// count = 总个数 -48; // count = 13 - 48; if (true) { //
				// 表示可以写满整个标签

				NewObject.Writein(ms);
				count++;

				if (fileCount == 20) {
				// 最后一页剩余个数
					if (fanren == 36) {

						NewObject.Write();
						NewObject.WriteClose();
						return;
					}
					fanren++;
				}

				if (count == 49) {

					NewObject.Write();
					NewObject.WriteClose();
					fileCount++;

					NewObject.NewFile(fileCount);
					count = 1;

					NewObject.g = 0;
					NewObject.h = 0;
					NewObject.mark3 = 1;
					NewObject.mark2 = 0;

				}

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			readwb.close();

		}

	}
}
