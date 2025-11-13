package tests;

import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;
import com.opencsv.CSVReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileParsingTest {
    private ClassLoader cl = FilesParsingTest.class.getClassLoader();


    private boolean isFilePresent(String fileName) throws IOException {
        try (ZipInputStream zip = new ZipInputStream(cl.getResourceAsStream("Test.zip"))) {
            ZipEntry entry;
            while ((entry = zip.getNextEntry()) != null) {
                if (fileName.equals(entry.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Test
    @DisplayName("Проверка таблицы на содержание значения")
    void checkXlsFileContent() throws Exception {

        Assertions.assertTrue(isFilePresent("testTable.xlsx"), "Файл testTable.xlsx отсутствует в архиве");

        try (ZipInputStream zip = new ZipInputStream(cl.getResourceAsStream("Test.zip"))) {
            ZipEntry entry;
            while ((entry = zip.getNextEntry()) != null) {
                if ("import.xlsx".equals(entry.getName())) {
                    XLS xls = new XLS(zip);
                    String actualValue = xls.excel.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
                    Assertions.assertTrue(actualValue.contains("Автомагазин"));
                }
            }
        }
    }

    @Test
    @DisplayName("Проверка PDF файла на количество страниц")
    void checkPdfFileNumberOfPages() throws Exception {

        Assertions.assertTrue(isFilePresent("Trail.pdf"), "Trail.pdf отсутствует в архиве");

        try (ZipInputStream zip = new ZipInputStream(cl.getResourceAsStream("Test.zip"))) {
            ZipEntry entry;
            while ((entry = zip.getNextEntry()) != null) {
                if ("Trail.pdf".equals(entry.getName())) {
                    PDF pdf = new PDF(zip);
                    Assertions.assertEquals(29, pdf.numberOfPages);
                }
            }
        }
    }

    @Test
    @DisplayName("Проверка CSV файла на содержание значения")
    void checkCsvFileContentArray() throws Exception {

        Assertions.assertTrue(isFilePresent("testTableCSV.csv"), "Файл testTableCSV.csv отсутствует в архиве");

        try (ZipInputStream zip = new ZipInputStream(cl.getResourceAsStream("Test.zip"))) {
            ZipEntry entry;
            while ((entry = zip.getNextEntry()) != null) {
                if ("testTableCSV.csv".equals(entry.getName())) {
                    CSVReader csvReader = new CSVReader(new InputStreamReader(zip));
                    List<String[]> data = csvReader.readAll();
                    Assertions.assertArrayEquals(
                            new String[]{"Тест 1", "Магазин игрушек", "Красная 54а", "8963222554"},
                            data.get(0)
                    );
                }
            }
        }
    }

    private class FilesParsingTest {
    }
}






