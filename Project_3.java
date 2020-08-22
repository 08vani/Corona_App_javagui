import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class Project_3 {
    static Patient[] patient_a;
    static Patient[] patient_b;
    static Patient[] patient_c;
    static Patient[] patient_d;
    public static void main (String[] args)
    {
        patient_a=new Patient[5];
        patient_b=new Patient[5];
        patient_c=new Patient[3];
        patient_d=new Patient[7];

        patient_a[0]=new Patient("Flora ",6,"A",1,4,2020,22,4,2020);
        patient_a[1]=new Patient("Caery ",72,"A",1,6,2020,22,6,2020);
        patient_a[2]=new Patient("Bob ",74,"A",4,7,2020,25,7,2020);
        patient_a[3]=new Patient("Smith ",89,"A",7,8,2020,28,8,2020);
        patient_a[4]=new Patient("Robertz ",50,"A",9,8,2020,30,8,2020);

        patient_b[0]=new Patient("Denys",24,"B",1,4,2020,22,4,2020);
        patient_b[1]=new Patient("David ",7,"B",14,6,2020,5,7,2020);
        patient_b[2]=new Patient("Pearson",47,"B",4,6,2020,25,6,2020);
        patient_b[3]=new Patient("Anderson",62,"B",27,7,2020,17,8,2020);
        patient_b[4]=new Patient("Julie",86,"B",2,5,2020,23,5,2020);

        patient_c[0]=new Patient("Jim",42,"C",18,5,2020,8,6,2020);
        patient_c[1]=new Patient("Rachel",48,"C",24,7,2020,14,8,2020);
        patient_c[2]=new Patient("Thomas",21,"C",11,6,2020,2,7,2020);

        patient_d[0]=new Patient("Hazel",87,"D",23,6,2020,14,7,2020);
        patient_d[1]=new Patient("Kevim ",37,"D",5,6,2020,26,6,2020);
        patient_d[2]=new Patient("Tom",67,"D",20,6,2020,11,7,2020);
        patient_d[3]=new Patient("Mary",17,"D",21,6,2020,12,7,2020);
        patient_d[4]=new Patient("Johnson",10,"D",1,8,2020,22,8,2020);
        patient_d[5]=new Patient("Edith",42,"D",7,6,2020,28,6,2020);
        patient_d[6]=new Patient("John",95,"D",1,6,2020,22,6,2020);

        make_GUI obj=new make_GUI();
    }
    static class make_GUI extends JFrame implements  ActionListener{
        JTextField date;
        JTextField a_active;
        JTextField a_rec;
        JTextField b_active;
        JTextField b_rec;
        JTextField c_active;
        JTextField c_rec;
        JTextField d_active;
        JTextField d_rec;
        JCheckBox button_a;
        JCheckBox button_b;
        JCheckBox button_c;
        JCheckBox button_d;
        JButton end_button;
        DefaultListModel<String> l_name=new DefaultListModel<>();
        DefaultListModel<String> l_Age=new DefaultListModel<>();
        DefaultListModel<String> l_Tower=new DefaultListModel<>();
        DefaultListModel<String> l_Repoted=new DefaultListModel<>();
        DefaultListModel<String> l_Recovered=new DefaultListModel<>();
        DefaultListModel<String> l__satatus=new DefaultListModel<>();
        JList<String> ls1=new JList<>(l_name);
        JList<String> ls2=new JList<>(l_Age);
        JList<String> ls3=new JList<>(l_Tower);
        JList<String> ls4=new JList<>(l_Repoted);
        JList<String> ls5=new JList<>(l_Recovered);
        JList<String> ls6=new JList<>(l__satatus);
        JTextField error=new JTextField("WRONG DATE, PLEASE ENTER AGAIN");
        make_GUI()
        {

            JLabel enter_date=new JLabel("Enter The Date :  ");
            enter_date.setBounds(20,20,100,25);
            add(enter_date);

            date=new JTextField("dd/mm/yyyy",10);
            date.setBounds(150,20,200,25);
            add(date);
            String d=date.getText();

            button_a=new JCheckBox("A");
            button_a.setBounds(400,20,50,50);
            add(button_a);


            button_b=new JCheckBox("B");
            button_b.setBounds(500,20,50,50);
            add(button_b);

            button_c=new JCheckBox("C");
            button_c.setBounds(600,20,50,50);
            add(button_c);

            button_d=new JCheckBox("D");
            button_d.setBounds(700,20,50,50);
            add(button_d);

            end_button=new JButton("OK");
            end_button.setBounds(800,20,100,50);
            end_button.addActionListener(this);
            add(end_button);


            //label for a
            JLabel a_label=new JLabel("Active in A : ");
            a_label.setBounds(20,100,500,25);
            add(a_label);

            a_active=new JTextField();
            a_active.setBounds(100,100,100,25);
            add(a_active);

            JLabel a_rec_label=new JLabel("Reccovered in A: ");
            a_rec_label.setBounds(20, 150,500,25);
            add(a_rec_label);

            a_rec=new JTextField();
            a_rec.setBounds(130,150,100,25);
            add(a_rec);

            //label for B
            JLabel b_label=new JLabel("Active in B : ");
            b_label.setBounds(220,100,500,25);
            add(b_label);

            b_active=new JTextField();
            b_active.setBounds(300,100,100,25);
            add(b_active);

            JLabel b_rec_label=new JLabel("Reccovered in B: ");
            b_rec_label.setBounds(260, 150,500,25);
            add(b_rec_label);

            b_rec=new JTextField();
            b_rec.setBounds(370,150,100,25);
            add(b_rec);

            //label for C

            JLabel c_label=new JLabel("Active in C : ");
            c_label.setBounds(420,100,500,25);
            add(c_label);

            c_active=new JTextField();
            c_active.setBounds(500,100,100,25);
            add(c_active);

            JLabel c_rec_label=new JLabel("Reccovered in C: ");
            c_rec_label.setBounds(500, 150,500,25);
            add(c_rec_label);

            c_rec=new JTextField();
            c_rec.setBounds(620,150,100,25);
            add(c_rec);

            //label for D

            JLabel d_label=new JLabel("Active in D : ");
            d_label.setBounds(620,100,500,25);
            add(d_label);

            d_active=new JTextField();
            d_active.setBounds(700,100,100,25);
            add(d_active);

            JLabel d_rec_label=new JLabel("Reccovered in D: ");
            d_rec_label.setBounds(750, 150,500,25);
            add(d_rec_label);

            d_rec=new JTextField();
            d_rec.setBounds(870,150,100,25);
            add(d_rec);

;
            setTitle("COVID-DATA-ANALYSIS");


            setLayout(null);
            setSize(1100,1500);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            boolean at = false,bt=false,ct=false,dt=false;
            int height=10;
            String d=date.getText();
            String day=d.substring(0,2);
            String mon=d.substring(3,5);
            String year=d.substring(6,10);
            int date=Integer.parseInt(day);
            int m=Integer.parseInt(mon);
            ls1.setVisible(true);
            ls2.setVisible(true);
            ls3.setVisible(true);
            ls4.setVisible(true);
            ls5.setVisible(true);
            ls6.setVisible(true);
            error.setVisible(false);
            if(year.equals("2020")==true && m>=4 && m<=8)
            {
                l_name.clear();
                l_Age.clear();
                l_Repoted.clear();
                l_Recovered.clear();
                l_Tower.clear();
                l__satatus.clear();
                a_active.setText("");
                a_rec.setText("");
                b_active.setText("");
                b_rec.setText("");
                c_active.setText("");
                c_rec.setText("");
                d_active.setText("");
                d_rec.setText("");
                l_name.addElement("NAME");
                l_Age.addElement("AGE");
                l_Tower.addElement("Tower");
                l_Repoted.addElement("REPORTED");
                l_Recovered.addElement("RECOVERED");
                l__satatus.addElement("STATUS");
                if(button_a.isSelected())
                {

                    at=true;
                    int active=0,recovered=0,no=0;
                    height+=patient_a.length;
                    for(int i=0;i<patient_a.length;i++)
                    {
                        Patient p=patient_a[i];
                        if(p.Recovery.month<m)
                        {
                            recovered=recovered+1;
                            p.set_status("Recovered");
                        }
                        else if(p.Recovery.month>m)
                        {
                            if(m==p.Reporting.month)
                            {
                                if(p.Reporting.day<=date)
                                {
                                    active=active+1;
                                    p.set_status("Active");
                                }

                            }

                        }
                        else
                        {
                            if(p.Recovery.day<=date)
                            {
                                recovered=recovered+1;
                                p.set_status("Recovered");
                            }
                            else  if(p.Recovery.day>date)
                            {
                                if(p.Reporting.month==m)
                                {
                                    if(p.Reporting.day<=date)
                                    {
                                        active=active+1;
                                        p.set_status("Active");
                                    }
                                }
                                else if(p.Reporting.month<m)
                                {
                                    active=active+1;
                                    p.set_status("Active");
                                }

                            }

                        }
                        String[] data=p.display().split(":");
                        l_name.addElement(data[0]);
                        l_Age.addElement(data[1]);
                        l_Tower.addElement(data[2]);
                        l_Repoted.addElement(data[3]);
                        l_Recovered.addElement(data[4]);
                        l__satatus.addElement(data[5]);
                    }
                    a_active.setText(active+"");
                    a_rec.setText(recovered+" ");

                }
                if (button_b.isSelected()==true)
                {
                    bt=true;
                    height =height+patient_b.length;
                    int active=0,recovered=0,no=0;
                    for(int i=0;i<patient_b.length;i++)
                    {
                        Patient p=patient_b[i];
                        if(p.Recovery.month<m)
                        {
                            recovered=recovered+1;
                            p.set_status("Recovered");
                        }
                        else if(p.Recovery.month>m)
                        {
                            if(m==p.Reporting.month)
                            {
                                if(p.Reporting.day<=date)
                                {
                                    active=active+1;
                                    p.set_status("Active");
                                }

                            }


                        }
                        else
                        {
                            if(p.Recovery.day<=date)
                            {
                                recovered=recovered+1;
                                p.set_status("Recovered");
                            }
                            else  if(p.Recovery.day>date)
                            {
                                if(p.Reporting.month==m)
                                {
                                    if(p.Reporting.day<=date)
                                    {
                                        active=active+1;
                                        p.set_status("Active");
                                    }

                                }
                                else if(p.Reporting.month<m)
                                {
                                    active=active+1;
                                    p.set_status("Active");
                                }

                            }

                        }
                        String[] data=p.display().split(":");
                        l_name.addElement(data[0]);
                        l_Age.addElement(data[1]);
                        l_Tower.addElement(data[2]);
                        l_Repoted.addElement(data[3]);
                        l_Recovered.addElement(data[4]);
                        l__satatus.addElement(data[5]);
                    }
                    b_active.setText(active+"");
                    b_rec.setText(recovered+" ");

                }
                if(button_c.isSelected()==true)
                {
                    ct=true;
                    height+=patient_c.length;
                    int active=0,recovered=0,no=0;
                    for(int i=0;i<patient_c.length;i++)
                    {
                        Patient p=patient_c[i];
                        if(p.Recovery.month<m)
                        {
                            recovered=recovered+1;
                            p.set_status("Recovered");
                        }
                        else if(p.Recovery.month>m)
                        {
                            if(m==p.Reporting.month)
                            {
                                if(p.Reporting.day<=date)
                                {
                                    active=active+1;
                                    p.set_status("Active");
                                }

                            }



                        }
                        else
                        {
                            if(p.Recovery.day<=date)
                            {
                                recovered=recovered+1;
                                p.set_status("Recovered");
                            }
                            else  if(p.Recovery.day>date)
                            {
                                if(p.Reporting.month==m)
                                {
                                    if(p.Reporting.day<=date)
                                    {
                                        active=active+1;
                                        p.set_status("Active");
                                    }

                                }
                                else if(p.Reporting.month<m)
                                {
                                    active=active+1;
                                    p.set_status("Active");
                                }

                            }

                        }
                        String[] data=p.display().split(":");
                        l_name.addElement(data[0]);
                        l_Age.addElement(data[1]);
                        l_Tower.addElement(data[2]);
                        l_Repoted.addElement(data[3]);
                        l_Recovered.addElement(data[4]);
                        l__satatus.addElement(data[5]);
                    }
                    c_active.setText(active+"");
                    c_rec.setText(recovered+" ");
                }
                if(button_d.isSelected()==true){
                    dt=true;
                    int active=0,recovered=0,no=0;
                    height+=patient_d.length;
                    for(int i=0;i<patient_d.length;i++)
                    {
                        Patient p=patient_d[i];
                        if(p.Recovery.month<m)
                        {
                            recovered=recovered+1;
                            p.set_status("Recovered");
                        }
                        else if(p.Recovery.month>m)
                        {
                            if(m==p.Reporting.month)
                            {
                                if(p.Reporting.day<=date)
                                {
                                    active=active+1;
                                    p.set_status("Active");
                                }

                            }


                        }
                        else
                        {
                            if(p.Recovery.day<=date)
                            {
                                recovered=recovered+1;
                                p.set_status("Recovered");
                            }
                            else  if(p.Recovery.day>date)
                            {
                                if(p.Reporting.month==m)
                                {
                                    if(p.Reporting.day<=date)
                                    {
                                        active=active+1;
                                        p.set_status("Active");
                                    }

                                }
                                else if(p.Reporting.month<m)
                                {
                                    active=active+1;
                                    p.set_status("Active");
                                }

                            }

                        }
                        String[] data=p.display().split(":");
                        l_name.addElement(data[0]);
                        l_Age.addElement(data[1]);
                        l_Tower.addElement(data[2]);
                        l_Repoted.addElement(data[3]);
                        l_Recovered.addElement(data[4]);
                        l__satatus.addElement(data[5]);
                    }
                    d_active.setText(active+"");
                    d_rec.setText(recovered+" ");

                }
                ls1.setBounds(30,200,75,height*15);
                ls2.setBounds(130,200,75,height*15);
                ls3.setBounds(230,200,75,height*15);
                ls4.setBounds(330,200,75,height*15);
                ls5.setBounds(430,200,80,height*15);
                ls6.setBounds(540,200,85,height*15);
                add(ls1);
                add(ls2);
                add(ls3);
                add(ls4);
                add(ls5);
                add(ls6);

            }
            else
            {
                error.setVisible(true);
                ls1.setVisible(false);
                ls2.setVisible(false);
                ls3.setVisible(false);
                ls4.setVisible(false);
                ls5.setVisible(false);
                ls6.setVisible(false);
                error.setBounds(450,400,230,25);
                add(error);
            }
            }

    }
    static class date{
        int day;
        int month;
        int year;
        date(int d,int m,int y)
        {
            day=d;
            month=m;
            year=y;
        }
        public String display()
        {
            return day+"/"+month+"/"+year;
        }
    }
    static class Patient{
        String Name;
        int Age;
        String Tower;
        date Reporting;
        date Recovery;
        String status;
        Patient(String n, int a,String t,int re_day,int re_mon,int re_year,int ry_day,int ry_mon,int ry_y)
        {
            Name=n;
            Age=a;
            Tower=t;
            Reporting=new date(re_day,re_mon,re_year);
            Recovery=new date(ry_day,ry_mon,ry_y);

        }
        public void set_status(String val)
        {
            status=val;
        }
        public String display()
        {
            String val= Name+":"+Age+":"+Tower+":"+Reporting.display()+":"+Recovery.display()+":"+status;
            return val;
        }
    }
}
