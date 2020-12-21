package java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author: TapFun
 * @since: 2020/12/21/17:08
 **/

public class Emp {
    private BigDecimal empno;

    private String ename;

    private String job;

    private BigDecimal mgr;

    private Date hiredate;

    private Double sal;

    private BigDecimal comm;

    private BigDecimal deptno;

    public BigDecimal getEmpno() {
        return empno;
    }

    public void setEmpno(BigDecimal empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public BigDecimal getMgr() {
        return mgr;
    }

    public void setMgr(BigDecimal mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public BigDecimal getDeptno() {
        return deptno;
    }

    public void setDeptno(BigDecimal deptno) {
        this.deptno = deptno;
    }

    public List<Emp> filter(List<Emp> empList){
        ArrayList<Emp> emps = new ArrayList<>();
        for (Emp emp : empList){
            if(emp.getSal()>3000){
                emps.add(emp);
            }
        }
        return emps;
    }

    public List<Emp> filterLambda(List<Emp> empList, Predicate<Emp> predicate){
        ArrayList<Emp> emps = new ArrayList<>();
        for (Emp emp : empList){
            if (predicate.test(emp)){
                emps.add(emp);
            }
        }
        return emps;
    }

    public static void main(String[] args) {
        Emp emp1 = new Emp();
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(emp1);
        emp1.filter(emps);

        //emp1.filterLambda(emps,Emp emp ->  )
    }
}


