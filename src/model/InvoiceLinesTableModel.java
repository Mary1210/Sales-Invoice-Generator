/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Mary
 */
public class InvoiceLinesTableModel extends AbstractTableModel{
    private List<InvoiceLine> item;
     public InvoiceLinesTableModel(List<InvoiceLine> item) {
       this.item = item;
    }
     
     
      public List<InvoiceLine> getInvoiceLines() {
        return item;
    }

    @Override
    public int getRowCount() {
        return item.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "item Name";
            case 1:
                return "item Price";
            case 2:
                return "item Count";
            case 3:
                return "Invoice Number";
            default:
                return "";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
               return String.class;
            case 1:
               return Integer.class;
            case 2:
               return Integer.class;
            case 3:
               return Double.class;
            default:
                return Object.class;
                            
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex,
            int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex,int columnIndex) {
        InvoiceLine row = item.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return row.getItemName();
            case 1:
                return row.getItemName();
            case 2:
                return row.getItemPrice();
            case 3:
                return row.getItemCount();
            default:
                return "";
        } 
    }   
}
