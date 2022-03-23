/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Mary
 */
public class InvoiceHeaderTableModel extends AbstractTableModel{
    private List<InvoiceHeader> invoiceList;
   
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    public InvoiceHeaderTableModel(List<InvoiceHeader> List) {
       this.invoiceList = List;
        
    }
    
    @Override
    public int getRowCount() {
        return invoiceList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
               return "Invoice No.";
            case 1:
               return "Customer Name";
            case 2:
               return "Invoice Date";
            case 3:
               return "Invoice Total";
            default:
                return"";
                            
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
               return Integer.class;
            case 1:
               return String.class;
            case 2:
               return String.class;
            case 3:
               return Double.class;
            default:
                return Object.class;
                            
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader row = invoiceList.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return row.getInvNum();
            case 1:
                return row.getCutomerName();
            case 2:
                return df.format(row.getinvDate());
            case 3:
                return row.getInvTotal();
            default:
                return "";
        } //To change body of generated methods, choose Tools | Templates.
    }

    
}
