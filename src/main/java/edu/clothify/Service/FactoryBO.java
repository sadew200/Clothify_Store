package edu.clothify.Service;

import edu.clothify.Service.Custom.Impl.EmployeeAccountBOImpl;
import edu.clothify.Service.Custom.Impl.OwnerAccountBOImpl;
import edu.clothify.Util.ServiceType;

public class FactoryBO {
    private static FactoryBO instance;
    private FactoryBO(){}
    public static FactoryBO getInstance(){
        return instance==null ?  instance=new FactoryBO() :  instance;
    }
    public <T extends SuperBO>T getServiceType(ServiceType serviceType){
        switch (serviceType){
            case EMPLOYEE_ACCOUNT :
               return (T)new EmployeeAccountBOImpl();
            case OWNER_ACCOUNT:
                return (T)new OwnerAccountBOImpl();
        }
        return null;
    }
}
