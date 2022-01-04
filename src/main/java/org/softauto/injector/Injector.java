package org.softauto.injector;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.softauto.core.ClassType;
import org.softauto.core.Utils;

/**
 * Injector  new class instance
 */
public class Injector  {

    private static final Logger logger = LogManager.getLogger(Injector.class);


    public  Object[] inject(String fullClassName,Object[] args,Class[] types,ClassType classType){
        try {
            Object[] objs = ServiceCaller.call(InitializerFactory.getInitializer(classType)).startCall(fullClassName,args,types);
            logger.debug("successfully inject "+ fullClassName + " with args "+ Utils.result2String(args));
            return objs;
        }catch (Exception e){
            logger.error("fail inject "+ fullClassName+ " with args "+ Utils.result2String(args),e);
        }
        return null;
    }

    public  Object inject(String fullClassName,String var,Object value){
        try {
            Object objs = ServiceCaller.InitVar(new ServerService.VariableHandler()).startCall(fullClassName,var,value);
            logger.debug("successfully inject "+ fullClassName + " with var "+ var + " value "+ value);
            return objs;
        }catch (Exception e){
            logger.error("fail inject "+ fullClassName+  " with var "+ var + " value "+ value,e);
        }
        return null;
    }

}
