import java.time.LocalDate;
import java.util.Scanner;

enum docter
{
    a("Dr. Ashok Seth",2500,"Immunologists"),
    b("Dr. Naresh Trehan",3000,"Anesthesiolog"),
    c("Dr. Suresh H. Advani",5000,"Cardiologists"),
    d("Dr. Sandeep Vaishya",6520,"Dermatologist"),
    e("Dr. A.B. Govindaraj",7000,"Neurologist s");
    private final String name;
    private final int fee;
    private final String spc;
    docter(String nm, int fe, String sp)
    {
        this.name=nm;
        this.fee=fe;
        this.spc=sp;
    }

    public String getName() {
        return name;
    }

    public int getFee() {
        return fee;
    }

    public String getSpc() {
        return spc;
    }
}

public class Ca3HEALTH
{
    static LocalDate ldt=LocalDate.now();
    static String t_date=ldt.getDayOfMonth()+"-"+ldt.getMonth()+"-"+ldt.getYear()+" ("+ldt.getDayOfWeek()+")";
    static Scanner inp=new Scanner(System.in);
    static Ca3HEALTH [] patientArr=new Ca3HEALTH[100];
    String patientName;
    String docName;
    static int pId=0;
    int curPID;

    public String getPatdate() {
        return patdate;
    }

    public void setPatdate(String patdate) {
        this.patdate = patdate;
    }

    int consFee;
    String patdate;
    String spclz;
    int patAge;

    Ca3HEALTH()
    {
        pId++;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getCurPID() {
        return curPID;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getConsFee() {
        return consFee;
    }

    public String getSpclz() {
        return spclz;
    }

    public int getPatAge() {
        return patAge;
    }



    public void setDocName(String docName) {
        this.docName = docName;
    }

    public void setConsFee(int consFee) {
        this.consFee = consFee;
    }

    public void setSpclz(String spclz) {
        this.spclz = spclz;
    }

    public void setCurPID(int curPID) {
        this.curPID = curPID;
    }

    public void setPatAge(int patAge) {
        this.patAge = patAge;
    }

    public String getDocName() {
        return docName;
    }

    public void appointment()
    {   System.out.println();
        System.out.println("             :::::APPOINTMENT SLIP::::::");
        System.out.println("|    Patient ID:"+ curPID);
        System.out.println("|    Date:"+ patdate);
        System.out.println("|    Name:"+patientName);
        System.out.println("|    Age:"+patAge);
        System.out.println("|    Docter:"+docName+", "+spclz);
        System.out.println("|    Consultation Fee: "+consFee);
    }

    public static void main(String ...ff)
    {
        boolean run=true;
        int choice;
        while (run)
        {   System.out.println();
            System.out.println("              ::::HEALTH CARE APPLICATION::::");
            System.out.println("01: New Patient");
            System.out.println("02: Patient Details");
            System.out.println("03: Available Docters");
            System.out.println("04: See patients");
            System.out.println("05: Exit");
            System.out.println("Enter Operation!");
            choice=inp.nextInt();
            switch (choice)
            {
                case 1:
                {
                    Ca3HEALTH p1=new Ca3HEALTH();
                    System.out.println("---New Patient Entry---run:"+pId);
                    System.out.println("Enter patient NAME: ");
                    p1.setPatientName(inp.next());
                    System.out.println("Age: ");
                    p1.setPatAge(inp.nextInt());
                    System.out.println("Select from Available Docters:");
                    System.out.println("   CONS. FEE    SPECIALIZATION        NAME");
                    System.out.println("------------------------------------------------------");
                    for(docter d:docter.values())
                        System.out.println((d.ordinal()+1)+" : "+d.getFee()+"         "+d.getSpc()+"   "+d.getName());
                    System.out.println("Select docter by id:");
                    int dChoice=inp.nextInt();
                    switch (dChoice)
                    {
                        case 1:
                        {
                            docter d1= docter.valueOf("a");
                            p1.setDocName(d1.getName());
                            p1.setConsFee(d1.getFee());
                            p1.setSpclz(d1.getSpc());
                            break;
                        }
                        case 2:
                        {
                            docter d1= docter.valueOf("b");
                            p1.setDocName(d1.getName());
                            p1.setConsFee(d1.getFee());
                            p1.setSpclz(d1.getSpc());
                            break;
                        }
                        case 3:
                        {
                            docter d1= docter.valueOf("c");
                            p1.setDocName(d1.getName());
                            p1.setConsFee(d1.getFee());
                            p1.setSpclz(d1.getSpc());
                            break;
                        }
                        case 4:
                        {
                            docter d1= docter.valueOf("d");
                            p1.setDocName(d1.getName());
                            p1.setConsFee(d1.getFee());
                            p1.setSpclz(d1.getSpc());
                            break;
                        }
                        case 5:
                        {
                            docter d1= docter.valueOf("e");
                            p1.setDocName(d1.getName());
                            p1.setConsFee(d1.getFee());
                            p1.setSpclz(d1.getSpc());
                            break;
                        }
                    }
                    System.out.println("Docter chosen: "+p1.getDocName());
                    p1.setPatdate(t_date);
                    p1.setCurPID(pId);
                    patientArr[pId]=p1;
                    //System.out.println("array ref: "+patientArr[pId]);
                    p1.appointment();
                    System.out.println("------------------------------------------------");
                    break;
                }
                case 2:
                {
                    System.out.println("      ---Patient Details---");
                    System.out.println("Enter PATIENT ID: ");
                    int i=inp.nextInt();
                    Ca3HEALTH a=patientArr[i];
                    System.out.println("    Name: "+a.getPatientName());
                    System.out.println("    Age: "+a.getPatAge());
                    System.out.println("    Docter: "+a.getDocName());
                    System.out.println("    Consultation fee: "+a.getConsFee());
                    System.out.println("    Date: "+a.getPatdate());
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 3:
                {
                    System.out.println("           ---Available Docters---");
                    System.out.println("   CONS. FEE    SPECIALIZATION        NAME");
                    System.out.println("---------------------------------------------------");
                    for(docter d:docter.values())
                        System.out.println((d.ordinal()+1)+" : "+d.getFee()+"     "+d.getSpc()+"   "+d.getName());
                    System.out.println("---------------------------------------------------");
                    break;
                }
                case 4:
                {
                    int i=1;
                    if(patientArr[i]==null)
                        System.out.print("NO PATIENT !");
                    else
                    {
                        System.out.println("All patients: ");
                        System.out.println("          Date             Age    Name");
                        for(i=1;i<=pId;i++)
                        {
                            Ca3HEALTH a=patientArr[i];
                            System.out.println(a.getPatdate()+"     "+a.getPatAge()+"     "+a.getPatientName());
                        }
                        System.out.println("---------------------------------------------------");
                    }
                    break;
                }
                case 5:
                {
                    run=false;
                    System.out.println("Exiting...");
                    break;
                }
            }
        }
    }





}

