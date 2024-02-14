package pompackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLogin extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		BaseTest test = new BaseTest();
		test.setup();
		LoginPage lp = new LoginPage(driver);
		Flib lib = new Flib();

		int rowcount = lib.getRowCount(EXCELPATH, INVALIDSHEETNAME);

		for (int i = 1; i <= rowcount; i++) {

			lp.InvalidLoginIntoActitime(lib.getDataFromExcelSheet(EXCELPATH, INVALIDSHEETNAME, i, 0),
					lib.getDataFromExcelSheet(EXCELPATH, INVALIDSHEETNAME, i, 1));

		}
	}

}
