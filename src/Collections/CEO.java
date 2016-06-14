/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *
 * @author miracleca
 */
class CEO {
    
   
       int id;
        String name;
        double salary;
        String cname;
   
        
        public void initCEO(int id,String name,double salary,String cname){
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.cname=cname;
        }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     
  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     *
     */
    public void display()
         {
             System.out.println(id +";"+ name +";" + salary + ";" + cname);
         }

    String getCompanyName() {
      return cname;
    }
        
           
    
}

