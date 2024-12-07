// public class weeknine2 {
    
// }

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class weeknine2 extends Frame implements ActionListener {

     TextField eno;
     TextField ename;
     Button next;
     Button addnew;

     Panel p;
     static ResultSet rs;
     static Connection c;
     static Statement st;

     public odbcframe() {
          super ("The query Application:");
          setLayout(new GridLayout(5, 1));
          eno = new TextField(20);
          ename = new TextField(50);
          next = new Button("Next");
          addnew = new Button("AddNewRec");

          p = new Panel();
          add(new Label("Emp no:"));
          add(eno);
          add(new Label("Emp name:"));
          add(ename);
          add(p);
          p.add(next);
          p.add(addnew);

          next.addActionListener(this);
          addnew.addActionListener(this);

          pack();
          setVisible(true);
     }

     public static void main(String s[]) {
          odbcframe obj = new odbcframe();

          try {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               c = DriverManager.getConnection("jdbc:odbc:connect_ora", "scott", "tiger");
               st = c.createStatement();
               rs = st.executeQuery("select empno,ename from empdet");
               rs.next();
          } catch (Exception e) {
               System.out.println("Error Inside.." + e);
          }
          obj.showRecord(rs);
     }

     public void actionPerformed(ActionEvent event) {
          if (event.getSource() == next) {
               try {
                    rs.next();
               } catch (Exception e) {
               }
               showRecord(rs);
          }
          if (event.getSource() == addnew) {
               try {
                    addRecord();
               } catch (Exception e) {
               }

          }

     }

     public void showRecord(ResultSet rs) {
          try {
               eno.setText(rs.getString(1));
               ename.setText(rs.getString(2));
          } catch (Exception e) {
          }
     }

     public void addRecord() {
          try {
               st.executeUpdate("insert into empdet(empno,ename)  values(" + Integer.parseInt(eno.getText()) + ",'"
                         + ename.getText() + "')");
          } catch (Exception e) {
               System.out.println(e.toString());
          }
     }

}
