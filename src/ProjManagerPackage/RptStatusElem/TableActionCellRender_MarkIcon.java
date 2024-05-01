package ProjManagerPackage.RptStatusElem;

import ProjManagerPackage.AccMgmtElem.*;
import ProjManagerPackage.AssignSupvElem.*;
import ProjManagerPackage.StuAssessElem.EditButton;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author PC
 */
public class TableActionCellRender_MarkIcon extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com =  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        MarkIcon action = new MarkIcon();
        action.setBackground(com.getBackground());

        return action;
    }
    
}
