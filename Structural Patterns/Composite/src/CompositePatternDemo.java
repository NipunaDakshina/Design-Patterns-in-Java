public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO=new Employee("John","CEO",200000);
        Employee headSales=new Employee("Robert","Head Sales",30000);
        Employee headMarketing=new Employee("Michel","Head Marketing",250000);
        Employee cleark1=new Employee("Laura","Marketing",10000);
        Employee cleark2=new Employee("Bob","Marketing",10000);
        Employee salesExecutive1=new Employee("Richard","Sales",10000);
        Employee salesExecutive2=new Employee("Rob","Sales",1000);

        CEO.add(headSales);
        CEO.add(headMarketing);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        headMarketing.add(cleark1);
        headMarketing.add(cleark2);

        //print all employess of the organization
        System.out.println(CEO);
        for (Employee headEmployee: CEO.getSubordinates()){
            System.out.println(headEmployee);
            for (Employee employee:headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }


    }
}