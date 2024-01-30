package src.io;

import org.apache.poi.ss.usermodel.*;
import src.model.Order;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class OrdersIO {
    public static void read(ArrayList<Order> orders) throws IOException {
        String file_name = "TEST.xlsx";
        File file = new File(file_name);
        Workbook workbook;
        FileInputStream fins = null;
        try {
            fins = new FileInputStream(file);
        }catch (Exception e){
            e.printStackTrace();
        }
        workbook = WorkbookFactory.create(fins);
        Sheet sheet = workbook.getSheetAt(0);
        FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();
        for (Row row : sheet){
            for (Cell cell: row){

            }
        }
    }
}
